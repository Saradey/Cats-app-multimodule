package com.evgeny.goncharov.splashscreen

import android.content.pm.ActivityInfo
import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.managers.MainRouter
import com.evgeny.goncharov.coreapi.mediators.WallCatsMediator
import com.evgeny.goncharov.coreapi.providers.MainRouterProvider
import kotlinx.android.synthetic.main.fragment_splash_screen.view.*
import kotlinx.coroutines.*

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
    private lateinit var wallCatsMediator: WallCatsMediator

    /** Для оповещения роутера что все еще открыт сплеш скрин */
    private lateinit var mainRouter: MainRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerSplashScreenComponent
            .builder()
            .mediatorsProvider((requireActivity() as WithFacade).getFacade())
            .mainRouterProvider((requireActivity() as WithFacade).getFacade() as MainRouterProvider)
            .build()
            .apply {
                wallCatsMediator = provideWallCatsMediator()
                mainRouter = provideMainRouter()
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash_screen, container, false)
        init(view)
        mainRouter.splashScreenIsInit(true)
        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
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
        activity?.let {
            wallCatsMediator.goToTheWallCatsFragment(it.supportFragmentManager)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mainRouter.splashScreenIsInit(false)
        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_FULL_USER
    }
}