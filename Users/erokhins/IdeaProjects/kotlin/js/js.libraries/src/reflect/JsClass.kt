'Deprecated' @ [33:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'ReplaceWith' @ [33:85] ==> public constructor ReplaceWith(expression: String, vararg imports: String) defined in kotlin.ReplaceWith[DeserializedClassConstructorDescriptor]

'WARNING' @ [33:138] ==> enum entry WARNING defined in kotlin.DeprecationLevel[FakeCallableDescriptorForObject]

'Deprecated' @ [36:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'ReplaceWith' @ [36:85] ==> public constructor ReplaceWith(expression: String, vararg imports: String) defined in kotlin.ReplaceWith[DeserializedClassConstructorDescriptor]

'WARNING' @ [36:141] ==> enum entry WARNING defined in kotlin.DeprecationLevel[FakeCallableDescriptorForObject]

'when (jsTypeOf(this)) {
        "string" -> js("String")
        "number" -> js("Number")
        "boolean" -> js("Boolean")
        else -> js("Object").getPrototypeOf(this).constructor
    }' @ [38:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsClass<T>, entry1: JsClass<T>, entry2: JsClass<T>, entry3: JsClass<T>): JsClass<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsClass<T>

'jsTypeOf' @ [38:19] ==> @InlineOnly @Suppress public inline fun jsTypeOf(a: Any?): String defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'this' @ [38:28] ==> <this> defined in kotlin.js.jsClass[ReceiverParameterDescriptorImpl]

'js' @ [39:21] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'js' @ [40:21] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'js' @ [41:22] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'js' @ [42:17] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'getPrototypeOf' @ [42:30] ==> public final fun getPrototypeOf(p0: dynamic): dynamic defined in kotlin.js.<get-jsClass>[SimpleFunctionDescriptorImpl]

'this' @ [42:45] ==> <this> defined in kotlin.js.jsClass[ReceiverParameterDescriptorImpl]

'constructor' @ [42:51] ==> public final var constructor: dynamic defined in kotlin.js.<get-jsClass>[PropertyDescriptorImpl]

'this' @ [49:14] ==> <this> defined in kotlin.js.js[ReceiverParameterDescriptorImpl]

'jClass' @ [49:37] ==> internal final val jClass: JsClass<T> defined in kotlin.reflect.js.internal.KClassImpl[PropertyDescriptorImpl]

'getKClass' @ [55:13] ==> @JsName internal fun <T : Any> getKClass(jClass: JsClass<T>): KClass<T> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'this' @ [55:23] ==> <this> defined in kotlin.js.kotlin[ReceiverParameterDescriptorImpl]

