'call' @ [31:21] ==> value-parameter call: JsInvocation defined in org.jetbrains.kotlin.js.inline.util.getSimpleName[ValueParameterDescriptorImpl]

'qualifier' @ [31:26] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'qualifier' @ [32:13] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.util.getSimpleName[LocalVariableDescriptor]

'name' @ [32:39] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'call' @ [41:36] ==> value-parameter call: JsInvocation defined in org.jetbrains.kotlin.js.inline.util.getSimpleIdent[ValueParameterDescriptorImpl]

'qualifier' @ [41:41] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'qualifier' @ [43:24] ==> var qualifier: JsExpression? defined in org.jetbrains.kotlin.js.inline.util.getSimpleIdent[LocalVariableDescriptor]

'when (qualifier) {
            is JsInvocation -> {
                val callableQualifier = qualifier
                qualifier = callableQualifier.qualifier

                if (isCallInvocation(callableQualifier)) {
                    qualifier = (qualifier as? JsNameRef)?.qualifier
                }
            }
            is HasName -> return qualifier.name?.ident
            else -> break@qualifiers
        }' @ [44:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'qualifier' @ [44:15] ==> var qualifier: JsExpression? defined in org.jetbrains.kotlin.js.inline.util.getSimpleIdent[LocalVariableDescriptor]

'qualifier' @ [46:41] ==> var qualifier: JsExpression? defined in org.jetbrains.kotlin.js.inline.util.getSimpleIdent[LocalVariableDescriptor]

'qualifier' @ [47:17] ==> var qualifier: JsExpression? defined in org.jetbrains.kotlin.js.inline.util.getSimpleIdent[LocalVariableDescriptor]

'callableQualifier' @ [47:29] ==> val callableQualifier: JsExpression? defined in org.jetbrains.kotlin.js.inline.util.getSimpleIdent[LocalVariableDescriptor]

'qualifier' @ [47:47] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'isCallInvocation' @ [49:21] ==> public fun isCallInvocation(invocation: JsInvocation): Boolean defined in org.jetbrains.kotlin.js.inline.util in file invocationUtils.kt[SimpleFunctionDescriptorImpl]

'callableQualifier' @ [49:38] ==> val callableQualifier: JsExpression? defined in org.jetbrains.kotlin.js.inline.util.getSimpleIdent[LocalVariableDescriptor]

'qualifier' @ [50:21] ==> var qualifier: JsExpression? defined in org.jetbrains.kotlin.js.inline.util.getSimpleIdent[LocalVariableDescriptor]

'qualifier' @ [50:34] ==> var qualifier: JsExpression? defined in org.jetbrains.kotlin.js.inline.util.getSimpleIdent[LocalVariableDescriptor]

'qualifier' @ [50:60] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'qualifier' @ [53:34] ==> var qualifier: JsExpression? defined in org.jetbrains.kotlin.js.inline.util.getSimpleIdent[LocalVariableDescriptor]

'name' @ [53:44] ==> public final var HasName.name: (JsName..JsName?)[MyPropertyDescriptor]

'ident' @ [53:50] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'invocation' @ [68:21] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.inline.util.isCallInvocation[ValueParameterDescriptorImpl]

'qualifier' @ [68:32] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'invocation' @ [69:21] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.inline.util.isCallInvocation[ValueParameterDescriptorImpl]

'arguments' @ [69:32] ==> public final val JsInvocation.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'qualifier' @ [71:9] ==> val qualifier: JsNameRef? defined in org.jetbrains.kotlin.js.inline.util.isCallInvocation[LocalVariableDescriptor]

'name' @ [71:19] ==> public val JsExpression?.name: JsName? defined in org.jetbrains.kotlin.js.translate.utils in file inlineUtils.kt[PropertyDescriptorImpl]

'descriptor' @ [71:25] ==> public var JsName.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'qualifier' @ [73:12] ==> val qualifier: JsNameRef? defined in org.jetbrains.kotlin.js.inline.util.isCallInvocation[LocalVariableDescriptor]

'ident' @ [73:23] ==> public final val JsNameRef.ident: String[MyPropertyDescriptor]

'CALL_FUNCTION' @ [73:38] ==> public const final val CALL_FUNCTION: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'arguments' @ [73:55] ==> val arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>) defined in org.jetbrains.kotlin.js.inline.util.isCallInvocation[LocalVariableDescriptor]

'isNotEmpty' @ [73:65] ==> @InlineOnly public inline fun <T> Collection<(JsExpression..JsExpression?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'getCallerQualifierImpl' @ [83:12] ==> private fun getCallerQualifierImpl(invocation: JsInvocation): JsExpression? defined in org.jetbrains.kotlin.js.inline.util in file invocationUtils.kt[SimpleFunctionDescriptorImpl]

'invocation' @ [83:35] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.inline.util.hasCallerQualifier[ValueParameterDescriptorImpl]

'getCallerQualifierImpl' @ [95:12] ==> private fun getCallerQualifierImpl(invocation: JsInvocation): JsExpression? defined in org.jetbrains.kotlin.js.inline.util in file invocationUtils.kt[SimpleFunctionDescriptorImpl]

'invocation' @ [95:35] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.inline.util.getCallerQualifier[ValueParameterDescriptorImpl]

'AssertionError' @ [96:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'invocation' @ [101:13] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.inline.util.getCallerQualifierImpl[ValueParameterDescriptorImpl]

'qualifier' @ [101:24] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'qualifier' @ [101:50] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'this' @ [112:25] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.transitiveStaticRef[ReceiverParameterDescriptorImpl]

'qualifier' @ [114:13] ==> var qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.util.<get-transitiveStaticRef>[LocalVariableDescriptor]

'when (qualifier) {
                is JsNameRef -> {
                    qualifier.name?.staticRef as? JsExpression ?: break@loop
                }
                is JsInvocation -> {
                    getSimpleName(qualifier)?.staticRef as? JsExpression ?: break@loop
                }
                else -> break@loop
            }' @ [114:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsExpression, entry1: JsExpression, entry2: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsExpression

'qualifier' @ [114:31] ==> var qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.util.<get-transitiveStaticRef>[LocalVariableDescriptor]

'qualifier' @ [116:21] ==> var qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.util.<get-transitiveStaticRef>[LocalVariableDescriptor]

'name' @ [116:31] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'staticRef' @ [116:37] ==> public var JsName.staticRef: JsNode? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'getSimpleName' @ [119:21] ==> public fun getSimpleName(call: JsInvocation): JsName? defined in org.jetbrains.kotlin.js.inline.util in file invocationUtils.kt[SimpleFunctionDescriptorImpl]

'qualifier' @ [119:35] ==> var qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.util.<get-transitiveStaticRef>[LocalVariableDescriptor]

'staticRef' @ [119:47] ==> public var JsName.staticRef: JsNode? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'qualifier' @ [124:16] ==> var qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.util.<get-transitiveStaticRef>[LocalVariableDescriptor]

