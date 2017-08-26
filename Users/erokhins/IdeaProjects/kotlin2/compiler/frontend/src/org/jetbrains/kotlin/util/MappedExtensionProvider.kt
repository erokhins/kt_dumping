'WeakReference' @ [29:26] ==> public constructor WeakReference<T : (Any..Any?)>(p0: (Pair<Application, R>..Pair<Application, R>?)) defined in java.lang.ref.WeakReference[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Pair<Application, R>

'cached' @ [32:22] ==> private/*private to this*/ final var cached: WeakReference<Pair<Application, R>> defined in org.jetbrains.kotlin.util.MappedExtensionProvider[PropertyDescriptorImpl]

'get' @ [32:29] ==> public open fun get(): Pair<Application, R>? defined in java.lang.ref.WeakReference[JavaMethodDescriptor]

'update' @ [32:45] ==> private final fun update(): R defined in org.jetbrains.kotlin.util.MappedExtensionProvider[SimpleFunctionDescriptorImpl]

'component1' @ [33:14] ==> public final operator fun component1(): Application defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [33:19] ==> public final operator fun component2(): R defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'cached' @ [33:33] ==> val cached: Pair<Application, R> defined in org.jetbrains.kotlin.util.MappedExtensionProvider.get[LocalVariableDescriptor]

'if (app == ApplicationManager.getApplication()) {
            extensions
        }
        else {
            update()
        }' @ [34:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: R, elseBranch: R): R[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> R

'app' @ [34:20] ==> val app: Application defined in org.jetbrains.kotlin.util.MappedExtensionProvider.get[LocalVariableDescriptor]

'getApplication' @ [34:46] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'extensions' @ [35:13] ==> val extensions: R defined in org.jetbrains.kotlin.util.MappedExtensionProvider.get[LocalVariableDescriptor]

'update' @ [38:13] ==> private final fun update(): R defined in org.jetbrains.kotlin.util.MappedExtensionProvider[SimpleFunctionDescriptorImpl]

'getApplication' @ [43:41] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'let' @ [43:58] ==> @InlineOnly public inline fun <T, R> (Application..Application?).let(block: ((Application..Application?)) -> Pair<(Application..Application?), R>): Pair<(Application..Application?), R> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.application.Application..com.intellij.openapi.application.Application?)
    <R> -> Pair<(com.intellij.openapi.application.Application..com.intellij.openapi.application.Application?), R>

'Pair' @ [44:13] ==> public constructor Pair<out A, out B>(first: (Application..Application?), second: R) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> (com.intellij.openapi.application.Application..com.intellij.openapi.application.Application?)
    <out B> -> R

'app' @ [44:18] ==> value-parameter app: (Application..Application?) defined in org.jetbrains.kotlin.util.MappedExtensionProvider.update.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [44:23] ==> public abstract operator fun invoke(p1: List<T>): R defined in kotlin.Function1[FunctionInvokeDescriptor]

'app' @ [44:27] ==> value-parameter app: (Application..Application?) defined in org.jetbrains.kotlin.util.MappedExtensionProvider.update.<anonymous>[ValueParameterDescriptorImpl]

'getExtensions' @ [44:31] ==> @NotNull public abstract fun <T : (Any..Any?)> getExtensions(@NotNull p0: ExtensionPointName<(T..T?)>): (Array<(T..T?)>..Array<out (T..T?)>) defined in com.intellij.openapi.application.Application[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (T..T?)

'epName' @ [44:45] ==> private final val epName: ExtensionPointName<T> defined in org.jetbrains.kotlin.util.MappedExtensionProvider[PropertyDescriptorImpl]

'toList' @ [44:53] ==> public fun <T> Array<out (T..T?)>.toList(): List<(T..T?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)

'cached' @ [46:9] ==> private/*private to this*/ final var cached: WeakReference<Pair<Application, R>> defined in org.jetbrains.kotlin.util.MappedExtensionProvider[PropertyDescriptorImpl]

'WeakReference' @ [46:18] ==> public constructor WeakReference<T : (Any..Any?)>(p0: (Pair<Application, R>..Pair<Application, R>?)) defined in java.lang.ref.WeakReference[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Pair<Application, R>

'newVal' @ [46:32] ==> val newVal: Pair<(Application..Application?), R> defined in org.jetbrains.kotlin.util.MappedExtensionProvider.update[LocalVariableDescriptor]

'newVal' @ [47:16] ==> val newVal: Pair<(Application..Application?), R> defined in org.jetbrains.kotlin.util.MappedExtensionProvider.update[LocalVariableDescriptor]

'second' @ [47:23] ==> public final val second: R defined in kotlin.Pair[DeserializedPropertyDescriptor]

'JvmStatic' @ [51:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'MappedExtensionProvider' @ [52:19] ==> protected constructor MappedExtensionProvider<T, out R>(epName: ExtensionPointName<T>, map: (List<T>) -> R) defined in org.jetbrains.kotlin.util.MappedExtensionProvider[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T
    <out R> -> R

'epName' @ [52:43] ==> value-parameter epName: ExtensionPointName<T> defined in org.jetbrains.kotlin.util.MappedExtensionProvider.Companion.create[ValueParameterDescriptorImpl]

'map' @ [52:51] ==> value-parameter map: (List<T>) -> R defined in org.jetbrains.kotlin.util.MappedExtensionProvider.Companion.create[ValueParameterDescriptorImpl]

'MappedExtensionProvider<T, List<T>>' @ [56:61] ==> protected constructor MappedExtensionProvider<T, out R>(epName: ExtensionPointName<T>, map: (List<T>) -> List<T>) defined in org.jetbrains.kotlin.util.MappedExtensionProvider[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T
    <out R> -> List<T>

'epName' @ [56:97] ==> value-parameter epName: ExtensionPointName<T> defined in org.jetbrains.kotlin.util.ExtensionProvider.<init>[ValueParameterDescriptorImpl]

'it' @ [56:107] ==> value-parameter it: List<T> defined in org.jetbrains.kotlin.util.ExtensionProvider.<init>.<anonymous>[ValueParameterDescriptorImpl]

'JvmStatic' @ [58:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'ExtensionProvider' @ [58:90] ==> public constructor ExtensionProvider<T>(epName: ExtensionPointName<T>) defined in org.jetbrains.kotlin.util.ExtensionProvider[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'epName' @ [58:108] ==> value-parameter epName: ExtensionPointName<T> defined in org.jetbrains.kotlin.util.ExtensionProvider.Companion.create[ValueParameterDescriptorImpl]

