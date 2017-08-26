'MockProject' @ [30:53] ==> public constructor MockProject(p0: (PicoContainer..PicoContainer?), @NotNull p1: Disposable) defined in com.intellij.mock.MockProject[JavaClassConstructorDescriptor]

'if (ApplicationManager.getApplication() != null) ApplicationManager.getApplication().picoContainer else null' @ [30:65] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PicoContainer?, elseBranch: PicoContainer?): PicoContainer?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PicoContainer?

'!=' @ [30:69] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.openapi.application.Application[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [30:88] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'getApplication' @ [30:133] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'picoContainer' @ [30:150] ==> public final val Application.picoContainer: PicoContainer[MyPropertyDescriptor]

'parentDisposable' @ [30:175] ==> value-parameter parentDisposable: Disposable defined in org.jetbrains.kotlin.test.testFramework.MockProjectEx.<init>[ValueParameterDescriptorImpl]

