package com.evgeny.goncharov.splashscreen

import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.mediators.WallCatsMediator
import kotlinx.android.synthetic.main.fragment_splash_screen.view.imvCat
import kotlinx.android.synthetic.main.fragment_splash_screen.view.txvTitle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Сплешскрин
 */
class SplashScreenFragment : Fragment() {

    companion object {

        /** Задержка в миллисекундах */
        private const val DELAY_SPLASH_SCREEN_MILLISECONDS = 2500L

        fun getInstance() = SplashScreenFragment()
    }

    /** Для осуществление задержки */
    private val mainScope = CoroutineScope(Dispatchers.Main + SupervisorJob())

    /** Для перехода на экран настроек */
    @Inject
    lateinit var wallCatsMediator: WallCatsMediator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerSplashScreenComponent
            .builder()
            .mediatorsProvider((requireActivity() as WithFacade).getFacade())
            .build()
            .inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash_screen, container, false)
        init(view)
        return view
    }

    private fun init(content: View) {
        initFountSplashScreenTitle(content)
        animationView(content)
    }

    private fun initFountSplashScreenTitle(content: View) {
        val typeFace = Typeface.createFromAsset(activity?.assets, "19144.ttf")
        content.txvTitle.typeface = typeFace
    }

    private fun animationView(content: View) {
        mainScope.launch {
            startAnimation(content)
            delay(DELAY_SPLASH_SCREEN_MILLISECONDS)
            goToTheNextFragment()
        }
    }

    private fun startAnimation(content: View) {
        val animationShow = AnimationUtils.loadAnimation(activity, R.anim.show_logo)
        content.imvCat.startAnimation(animationShow)
        content.txvTitle.startAnimation(animationShow)
    }

    private fun goToTheNextFragment() {
        wallCatsMediator.goToTheWallCatsFragment(requireActivity().supportFragmentManager)
    }
}