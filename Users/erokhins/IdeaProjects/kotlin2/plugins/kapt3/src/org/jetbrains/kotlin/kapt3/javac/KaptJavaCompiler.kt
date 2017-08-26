'JavaCompiler' @ [24:44] ==> public constructor JavaCompiler(p0: (Context..Context?)) defined in com.sun.tools.javac.main.JavaCompiler[JavaClassConstructorDescriptor]

'context' @ [24:57] ==> value-parameter context: Context defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaCompiler.<init>[ValueParameterDescriptorImpl]

'super' @ [25:70] ==> <this> defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaCompiler[LazyClassReceiverParameterDescriptor]

'shouldStop' @ [25:76] ==> protected/*protected and package*/ open fun shouldStop(p0: (CompileStates.CompileState..CompileStates.CompileState?)): Boolean defined in com.sun.tools.javac.main.JavaCompiler[JavaMethodDescriptor]

'cs' @ [25:87] ==> value-parameter cs: CompileStates.CompileState defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaCompiler.shouldStop[ValueParameterDescriptorImpl]

'if (shouldStop(cs)) JavacList.nil<T>() else list' @ [28:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<T>, elseBranch: List<T>): List<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<T>

'shouldStop' @ [28:20] ==> public open fun shouldStop(cs: CompileStates.CompileState): Boolean defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaCompiler[SimpleFunctionDescriptorImpl]

'cs' @ [28:31] ==> value-parameter cs: CompileStates.CompileState defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaCompiler.stopIfErrorOccurred[ValueParameterDescriptorImpl]

'nil' @ [28:46] ==> public open fun <A : (Any..Any?)> nil(): (List<(T..T?)>..List<(T..T?)>?) defined in com.sun.tools.javac.util.List[JavaMethodDescriptor]
Inferred types:
    <A : (Any..Any?)> -> T

'list' @ [28:60] ==> value-parameter list: List<T> defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaCompiler.stopIfErrorOccurred[ValueParameterDescriptorImpl]

'context' @ [33:13] ==> value-parameter context: Context defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaCompiler.Companion.preRegister[ValueParameterDescriptorImpl]

'put' @ [33:21] ==> public open fun <T : (Any..Any?)> put(p0: (Context.Key<(JavaCompiler..JavaCompiler?)>..Context.Key<(JavaCompiler..JavaCompiler?)>?), p1: (Context.Factory<(JavaCompiler..JavaCompiler?)>..Context.Factory<(JavaCompiler..JavaCompiler?)>?)): Unit defined in com.sun.tools.javac.util.Context[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JavaCompiler

'compilerKey' @ [33:25] ==> protected/*protected static*/ final val compilerKey: (Context.Key<(JavaCompiler..JavaCompiler?)>..Context.Key<(JavaCompiler..JavaCompiler?)>?) defined in com.sun.tools.javac.main.JavaCompiler[JavaPropertyDescriptor]

'Factory' @ [33:46] ==> public final fun <T : (Any..Any?)> Factory(function: ((Context..Context?)) -> (JavaCompiler..JavaCompiler?)): Context.Factory<JavaCompiler> defined in com.sun.tools.javac.util.Context[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> JavaCompiler

