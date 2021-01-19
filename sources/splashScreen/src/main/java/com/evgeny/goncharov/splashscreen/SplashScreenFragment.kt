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
import com.evgeny.goncharov.splashscreen.databinding.FragmentSplashScreenBinding
import kotlinx.coroutines.*

/**
 * Сплешскрин
 */
class SplashScreenFragment : Fragment() {

    /** Для осуществление задержки */
    private val mainScope = CoroutineScope(Dispatchers.Main + SupervisorJob())

    /** Для перехода на экран настроек */
    private lateinit var wallCatsMediator: WallCatsMediator

    /** Для оповещения роутера что все еще открыт сплеш скрин */
    private lateinit var mainRouter: MainRouter

    /** Биндинг View на сплеш скрине */
    private lateinit var binder: FragmentSplashScreenBinding

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
    ): View {
        binder = FragmentSplashScreenBinding.inflate(inflater, container, false)
        mainRouter.splashScreenIsInit(true)
        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        return binder.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initUi()
    }

    private fun initUi() {
        initFountSplashScreenTitle()
        animationView()
    }

    private fun initFountSplashScreenTitle() {
        val typeFace = Typeface.createFromAsset(activity?.assets, "19144.ttf")
        binder.txvTitle.typeface = typeFace
    }

    private fun animationView() {
        mainScope.launch {
            startAnimation()
            delay(DELAY_SPLASH_SCREEN_MILLISECONDS)
            goToTheNextFragment()
        }
    }

    private fun startAnimation() {
        val animationShow = AnimationUtils.loadAnimation(activity, R.anim.show_logo)
        binder.imvCat.startAnimation(animationShow)
        binder.txvTitle.startAnimation(animationShow)
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

    companion object {

        /** Задержка в миллисекундах */
        private const val DELAY_SPLASH_SCREEN_MILLISECONDS = 2500L

        fun getInstance() = SplashScreenFragment()
    }
}