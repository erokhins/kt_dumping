'SLRUMap' @ [27:51] ==> public constructor SLRUMap<K : (Any..Any?), V : (Any..Any?)>(p0: Int, p1: Int) defined in com.intellij.util.containers.SLRUMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ClassId
    <V : (Any..Any?)> -> ByteArray

'SLRUMap' @ [28:64] ==> public constructor SLRUMap<K : (Any..Any?), V : (Any..Any?)>(p0: Int, p1: Int) defined in com.intellij.util.containers.SLRUMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> MethodId
    <V : (Any..Any?)> -> SMAPAndMethodNode

'get' @ [32:17] ==> @Nullable public open operator fun get(p0: (K..K?)): V? defined in com.intellij.util.containers.SLRUMap[JavaMethodDescriptor]

'key' @ [32:21] ==> value-parameter key: K defined in org.jetbrains.kotlin.codegen.inline.getOrPut[ValueParameterDescriptorImpl]

'if (value == null) {
        val answer = defaultValue()
        put(key, answer)
        answer
    }
    else {
        value
    }' @ [33:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: V, elseBranch: V): V[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> V

'value' @ [33:16] ==> val value: V? defined in org.jetbrains.kotlin.codegen.inline.getOrPut[LocalVariableDescriptor]

'invoke' @ [34:22] ==> public abstract operator fun invoke(): V defined in kotlin.Function0[FunctionInvokeDescriptor]

'put' @ [35:9] ==> public open fun put(p0: (K..K?), @NotNull p1: V): Unit defined in com.intellij.util.containers.SLRUMap[JavaMethodDescriptor]

'key' @ [35:13] ==> value-parameter key: K defined in org.jetbrains.kotlin.codegen.inline.getOrPut[ValueParameterDescriptorImpl]

'answer' @ [35:18] ==> val answer: V defined in org.jetbrains.kotlin.codegen.inline.getOrPut[LocalVariableDescriptor]

'answer' @ [36:9] ==> val answer: V defined in org.jetbrains.kotlin.codegen.inline.getOrPut[LocalVariableDescriptor]

'value' @ [39:9] ==> val value: V? defined in org.jetbrains.kotlin.codegen.inline.getOrPut[LocalVariableDescriptor]

