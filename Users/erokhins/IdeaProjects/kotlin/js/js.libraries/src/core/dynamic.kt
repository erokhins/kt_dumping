'kotlin.internal.InlineOnly' @ [22:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [23:47] ==> <this> defined in kotlin.js.asDynamic[ReceiverParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [28:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'kotlin.internal.NoInfer' @ [29:42] ==> public constructor NoInfer() defined in kotlin.internal.NoInfer[ClassConstructorDescriptorImpl]

'this' @ [29:71] ==> <this> defined in kotlin.js.unsafeCast[ReceiverParameterDescriptorImpl]

'asDynamic' @ [29:76] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'kotlin.internal.DynamicExtension' @ [34:1] ==> public constructor DynamicExtension() defined in kotlin.internal.DynamicExtension[ClassConstructorDescriptorImpl]

'JsName' @ [35:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'kotlin.internal.InlineOnly' @ [36:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'kotlin.internal.NoInfer' @ [37:45] ==> public constructor NoInfer() defined in kotlin.internal.NoInfer[ClassConstructorDescriptorImpl]

'this' @ [37:74] ==> <this> defined in kotlin.js.unsafeCast[ReceiverParameterDescriptorImpl]

'kotlin.internal.DynamicExtension' @ [45:1] ==> public constructor DynamicExtension() defined in kotlin.internal.DynamicExtension[ClassConstructorDescriptorImpl]

'this' @ [47:19] ==> <this> defined in kotlin.js.iterator[ReceiverParameterDescriptorImpl]

'when {
        this["iterator"] != null ->
            this["iterator"]()
        js("Kotlin").isArrayish(r) ->
            r.unsafeCast<Array<*>>().iterator()

        else ->
            (r as Iterable<*>).iterator()
    }' @ [49:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Iterator<dynamic>, entry1: Iterator<dynamic>, entry2: Iterator<dynamic>): Iterator<dynamic>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Iterator<dynamic>

'this' @ [50:9] ==> <this> defined in kotlin.js.iterator[ReceiverParameterDescriptorImpl]

'this' @ [51:13] ==> <this> defined in kotlin.js.iterator[ReceiverParameterDescriptorImpl]

'js' @ [52:9] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'isArrayish' @ [52:22] ==> public final fun isArrayish(p0: dynamic): dynamic defined in kotlin.js.iterator[SimpleFunctionDescriptorImpl]

'r' @ [52:33] ==> val r: Any? defined in kotlin.js.iterator[LocalVariableDescriptor]

'r' @ [53:13] ==> val r: Any? defined in kotlin.js.iterator[LocalVariableDescriptor]

'unsafeCast' @ [53:15] ==> @InlineOnly public inline fun <T> Any?.unsafeCast(): Array<*> defined in kotlin.js[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Array<*>

'iterator' @ [53:38] ==> public final operator fun iterator(): Iterator<Any?> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'r' @ [56:14] ==> val r: Any? defined in kotlin.js.iterator[LocalVariableDescriptor]

'iterator' @ [56:32] ==> public abstract operator fun iterator(): Iterator<Any?> defined in kotlin.collections.Iterable[SimpleFunctionDescriptorImpl]

