'x' @ [8:9] ==> var x: Int defined in bar[LocalVariableDescriptor]

'run' @ [9:9] ==> @InlineOnly public inline fun <R> run(block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'x' @ [11:17] ==> var x: Int defined in bar[LocalVariableDescriptor]

'bas' @ [13:17] ==> public fun bas(): Unit defined in root package in file Test.kt[SimpleFunctionDescriptorImpl]

'run' @ [19:29] ==> @InlineOnly public inline fun <R> run(block: () -> Map<Any?, Nothing>): Map<Any?, Nothing> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Map<Any?, Nothing>

'if (false) {
            mapOf()
        } else {
            emptyMap()
        }' @ [21:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'mapOf' @ [22:13] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<Any?, Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any?
    <V> -> Any?

'emptyMap' @ [24:13] ==> public fun <K, V> emptyMap(): Map<Any?, Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any?
    <V> -> Any?

'emptyMap' @ [27:9] ==> public fun <K, V> emptyMap(): Map<Any?, Nothing> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any?
    <V> -> Nothing

