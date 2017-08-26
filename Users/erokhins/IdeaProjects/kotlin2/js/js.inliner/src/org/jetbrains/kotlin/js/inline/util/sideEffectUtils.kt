'any' @ [25:9] ==> public fun JsNode.any(predicate: (JsNode) -> Boolean): Boolean defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [25:15] ==> value-parameter it: JsNode defined in org.jetbrains.kotlin.js.inline.util.canHaveSideEffect.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [25:37] ==> value-parameter it: JsNode defined in org.jetbrains.kotlin.js.inline.util.canHaveSideEffect.<anonymous>[ValueParameterDescriptorImpl]

'canHaveOwnSideEffect' @ [25:40] ==> public fun JsExpression.canHaveOwnSideEffect(vars: Set<JsName>): Boolean defined in org.jetbrains.kotlin.js.inline.util in file sideEffectUtils.kt[SimpleFunctionDescriptorImpl]

'localVars' @ [25:61] ==> value-parameter localVars: Set<JsName> defined in org.jetbrains.kotlin.js.inline.util.canHaveSideEffect[ValueParameterDescriptorImpl]

'when (this) {
    is JsConditional,
    is JsLiteral -> false
    is JsBinaryOperation -> operator.isAssignment
    is JsNameRef -> name !in vars && sideEffects != SideEffectKind.PURE
    else -> sideEffects != SideEffectKind.PURE
}' @ [27:60] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [27:66] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.canHaveOwnSideEffect[ReceiverParameterDescriptorImpl]

'operator' @ [30:29] ==> public final val JsBinaryOperation.operator: JsBinaryOperator[MyPropertyDescriptor]

'isAssignment' @ [30:38] ==> public final val JsBinaryOperator.isAssignment: Boolean[MyPropertyDescriptor]

'name' @ [31:21] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'vars' @ [31:30] ==> value-parameter vars: Set<JsName> defined in org.jetbrains.kotlin.js.inline.util.canHaveOwnSideEffect[ValueParameterDescriptorImpl]

'sideEffects' @ [31:38] ==> public var HasMetadata.sideEffects: SideEffectKind defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'PURE' @ [31:68] ==> enum entry PURE defined in org.jetbrains.kotlin.js.backend.ast.metadata.SideEffectKind[FakeCallableDescriptorForObject]

'sideEffects' @ [32:13] ==> public var HasMetadata.sideEffects: SideEffectKind defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'PURE' @ [32:43] ==> enum entry PURE defined in org.jetbrains.kotlin.js.backend.ast.metadata.SideEffectKind[FakeCallableDescriptorForObject]

