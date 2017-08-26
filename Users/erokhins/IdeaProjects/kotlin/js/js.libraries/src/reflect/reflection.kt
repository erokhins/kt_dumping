'JsName' @ [22:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'getOrCreateKClass' @ [23:67] ==> private fun <T : Any> getOrCreateKClass(jClass: JsClass<T>): KClass<T> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'jClass' @ [23:85] ==> value-parameter jClass: JsClass<T> defined in getKClass[ValueParameterDescriptorImpl]

'JsName' @ [24:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'getOrCreateKClass' @ [25:67] ==> private fun <T : Any> getOrCreateKClass(jClass: JsClass<T>): KClass<T> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'e' @ [25:85] ==> value-parameter e: T defined in getKClassFromExpression[ValueParameterDescriptorImpl]

'jsClass' @ [25:87] ==> @Deprecated public val <T : Any> T.jsClass: JsClass<T> defined in kotlin.js[PropertyDescriptorImpl]
Inferred types:
    <T : Any> -> T

'jClass' @ [28:20] ==> value-parameter jClass: JsClass<T> defined in getOrCreateKClass[ValueParameterDescriptorImpl]

'asDynamic' @ [28:27] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'`$metadata$`' @ [28:39] ==> public final var `$metadata$`: dynamic defined in getOrCreateKClass[PropertyDescriptorImpl]

'if (metadata != null) {
        if (metadata.`$kClass$` == null) {
            val kClass = KClassImpl(jClass)
            metadata.`$kClass$` = kClass
            kClass
        }
        else {
            metadata.`$kClass$`
        }
    }
    else {
        KClassImpl(jClass)
    }' @ [30:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KClass<T>, elseBranch: KClass<T>): KClass<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KClass<T>

'metadata' @ [30:16] ==> val metadata: dynamic defined in getOrCreateKClass[LocalVariableDescriptor]

'if (metadata.`$kClass$` == null) {
            val kClass = KClassImpl(jClass)
            metadata.`$kClass$` = kClass
            kClass
        }
        else {
            metadata.`$kClass$`
        }' @ [31:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: dynamic, elseBranch: dynamic): dynamic[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> dynamic

'metadata' @ [31:13] ==> val metadata: dynamic defined in getOrCreateKClass[LocalVariableDescriptor]

'`$kClass$`' @ [31:22] ==> public final var `$kClass$`: dynamic defined in getOrCreateKClass[PropertyDescriptorImpl]

'KClassImpl' @ [32:26] ==> public constructor KClassImpl<T : Any>(jClass: JsClass<T>) defined in kotlin.reflect.js.internal.KClassImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> T

'jClass' @ [32:37] ==> value-parameter jClass: JsClass<T> defined in getOrCreateKClass[ValueParameterDescriptorImpl]

'metadata' @ [33:13] ==> val metadata: dynamic defined in getOrCreateKClass[LocalVariableDescriptor]

'`$kClass$`' @ [33:22] ==> public final var `$kClass$`: dynamic defined in getOrCreateKClass[PropertyDescriptorImpl]

'kClass' @ [33:35] ==> val kClass: KClassImpl<T> defined in getOrCreateKClass[LocalVariableDescriptor]

'kClass' @ [34:13] ==> val kClass: KClassImpl<T> defined in getOrCreateKClass[LocalVariableDescriptor]

'metadata' @ [37:13] ==> val metadata: dynamic defined in getOrCreateKClass[LocalVariableDescriptor]

'`$kClass$`' @ [37:22] ==> public final var `$kClass$`: dynamic defined in getOrCreateKClass[PropertyDescriptorImpl]

'KClassImpl' @ [41:9] ==> public constructor KClassImpl<T : Any>(jClass: JsClass<T>) defined in kotlin.reflect.js.internal.KClassImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> T

'jClass' @ [41:20] ==> value-parameter jClass: JsClass<T> defined in getOrCreateKClass[ValueParameterDescriptorImpl]

