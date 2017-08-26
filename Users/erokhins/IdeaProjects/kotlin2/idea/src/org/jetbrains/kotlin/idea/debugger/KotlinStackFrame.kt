'JavaStackFrame' @ [26:54] ==> public constructor JavaStackFrame(@NotNull p0: StackFrameDescriptorImpl, p1: Boolean) defined in com.intellij.debugger.engine.JavaStackFrame[JavaClassConstructorDescriptor]

'StackFrameDescriptorImpl' @ [26:69] ==> public constructor StackFrameDescriptorImpl(@NotNull p0: StackFrameProxyImpl, @NotNull p1: MethodsTracker) defined in com.intellij.debugger.ui.impl.watch.StackFrameDescriptorImpl[JavaClassConstructorDescriptor]

'frame' @ [26:94] ==> value-parameter frame: StackFrameProxyImpl defined in org.jetbrains.kotlin.idea.debugger.KotlinStackFrame.<init>[ValueParameterDescriptorImpl]

'MethodsTracker' @ [26:101] ==> public constructor MethodsTracker() defined in com.intellij.debugger.ui.impl.watch.MethodsTracker[JavaClassConstructorDescriptor]

'super' @ [28:16] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.KotlinStackFrame[LazyClassReceiverParameterDescriptor]

'getVisibleVariables' @ [28:22] ==> protected/*protected and package*/ open fun getVisibleVariables(): (MutableList<(LocalVariableProxyImpl..LocalVariableProxyImpl?)>..List<(LocalVariableProxyImpl..LocalVariableProxyImpl?)>?) defined in com.intellij.debugger.engine.JavaStackFrame[JavaMethodDescriptor]

'filter' @ [28:44] ==> public inline fun <T> Iterable<(LocalVariableProxyImpl..LocalVariableProxyImpl?)>.filter(predicate: ((LocalVariableProxyImpl..LocalVariableProxyImpl?)) -> Boolean): List<(LocalVariableProxyImpl..LocalVariableProxyImpl?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.debugger.jdi.LocalVariableProxyImpl..com.intellij.debugger.jdi.LocalVariableProxyImpl?)

'!' @ [29:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isFakeLocalVariableForInline' @ [29:14] ==> public fun isFakeLocalVariableForInline(name: String): Boolean defined in org.jetbrains.kotlin.codegen.inline[DeserializedSimpleFunctionDescriptor]

'it' @ [29:43] ==> value-parameter it: (LocalVariableProxyImpl..LocalVariableProxyImpl?) defined in org.jetbrains.kotlin.idea.debugger.KotlinStackFrame.getVisibleVariables.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [29:46] ==> public open fun name(): (String..String?) defined in com.intellij.debugger.jdi.LocalVariableProxyImpl[JavaMethodDescriptor]

