'resolvedCall' @ [39:22] ==> public abstract val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.CallInfo[PropertyDescriptorImpl]

'resultingDescriptor' @ [39:35] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'original' @ [39:55] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'if (result is TypeAliasConstructorDescriptor) result.underlyingConstructorDescriptor else result' @ [40:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableDescriptor, elseBranch: CallableDescriptor): CallableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableDescriptor

'result' @ [40:20] ==> val result: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.<get-callableDescriptor>[LocalVariableDescriptor]

'result' @ [40:62] ==> val result: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.<get-callableDescriptor>[LocalVariableDescriptor]

'underlyingConstructorDescriptor' @ [40:69] ==> public abstract val underlyingConstructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor[DeserializedPropertyDescriptor]

'result' @ [40:106] ==> val result: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.<get-callableDescriptor>[LocalVariableDescriptor]

'isNativeObject' @ [43:53] ==> public open fun isNativeObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'callableDescriptor' @ [43:68] ==> public val CallInfo.callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'resolvedCall' @ [46:28] ==> public abstract val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.CallInfo[PropertyDescriptorImpl]

'dispatchReceiver' @ [46:41] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'dispatchReceiver' @ [47:12] ==> val dispatchReceiver: ReceiverValue? defined in org.jetbrains.kotlin.js.translate.callTranslator.isSuperInvocation[LocalVariableDescriptor]

'dispatchReceiver' @ [47:54] ==> val dispatchReceiver: ReceiverValue? defined in org.jetbrains.kotlin.js.translate.callTranslator.isSuperInvocation[LocalVariableDescriptor]

'expression' @ [47:71] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[DeserializedPropertyDescriptor]

'resolvedCall' @ [52:27] ==> public abstract val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.CallInfo[PropertyDescriptorImpl]

'resultingDescriptor' @ [52:40] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'containingDeclaration' @ [52:60] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'translateAsValueReference' @ [53:36] ==> @NotNull public open fun translateAsValueReference(@NotNull descriptor: DeclarationDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'calleeOwner' @ [53:62] ==> val calleeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.<get-calleeOwner>[LocalVariableDescriptor]

'context' @ [53:75] ==> public abstract val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.CallInfo[PropertyDescriptorImpl]

'callableDescriptor' @ [57:13] ==> public val CallInfo.callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'context' @ [60:13] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'getNameForDescriptor' @ [60:21] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'variableDescriptor' @ [60:42] ==> public val VariableAccessInfo.variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'value' @ [62:49] ==> public final val value: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'variableDescriptor' @ [65:20] ==> public val VariableAccessInfo.variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'if (isGetAccess()) property.getter!! else property.setter!!' @ [66:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PropertyAccessorDescriptor, elseBranch: PropertyAccessorDescriptor): PropertyAccessorDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PropertyAccessorDescriptor

'isGetAccess' @ [66:16] ==> public fun VariableAccessInfo.isGetAccess(): Boolean defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'property' @ [66:31] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.getAccessDescriptor[LocalVariableDescriptor]

'getter' @ [66:40] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'property' @ [66:54] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.getAccessDescriptor[LocalVariableDescriptor]

'setter' @ [66:63] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'if (variableDescriptor is PropertyDescriptor &&
               (variableDescriptor.isExtension || TranslationUtils.shouldAccessViaFunctions(variableDescriptor))
                   ) {
        getAccessDescriptor()
    }
    else {
        variableDescriptor
    }' @ [70:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableDescriptor, elseBranch: CallableDescriptor): CallableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableDescriptor

'variableDescriptor' @ [70:16] ==> public val VariableAccessInfo.variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'variableDescriptor' @ [71:17] ==> public val VariableAccessInfo.variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'isExtension' @ [71:36] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'shouldAccessViaFunctions' @ [71:68] ==> public open fun shouldAccessViaFunctions(@NotNull descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'variableDescriptor' @ [71:93] ==> public val VariableAccessInfo.variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'getAccessDescriptor' @ [73:9] ==> public fun VariableAccessInfo.getAccessDescriptor(): PropertyAccessorDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [76:9] ==> public val VariableAccessInfo.variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'if (isGetAccess()) {
        ref
    }
    else {
        // This is useful when passing AST to TemporaryAssignmentElimination. It can bring
        // property assignment like `obj.propertyName = $tmp` to places where `$tmp` gets its value,
        // but only when it's sure that no side effects possible.
        ref.sideEffects = SideEffectKind.PURE
        JsAstUtils.assignment(ref, value!!)
    }' @ [81:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'isGetAccess' @ [81:16] ==> public fun VariableAccessInfo.isGetAccess(): Boolean defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'ref' @ [82:9] ==> value-parameter ref: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.constructAccessExpression[ValueParameterDescriptorImpl]

'ref' @ [88:9] ==> value-parameter ref: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.constructAccessExpression[ValueParameterDescriptorImpl]

'sideEffects' @ [88:13] ==> public var HasMetadata.sideEffects: SideEffectKind defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'PURE' @ [88:42] ==> enum entry PURE defined in org.jetbrains.kotlin.js.backend.ast.metadata.SideEffectKind[FakeCallableDescriptorForObject]

'assignment' @ [89:20] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'ref' @ [89:31] ==> value-parameter ref: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.constructAccessExpression[ValueParameterDescriptorImpl]

'value' @ [89:36] ==> public final val value: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'context' @ [94:13] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.FunctionCallInfo[PropertyDescriptorImpl]

'getNameForDescriptor' @ [94:21] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'callableDescriptor' @ [94:42] ==> public val CallInfo.callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'argumentsInfo' @ [96:53] ==> public final val argumentsInfo: CallArgumentTranslator.ArgumentsInfo defined in org.jetbrains.kotlin.js.translate.callTranslator.FunctionCallInfo[PropertyDescriptorImpl]

'hasSpreadOperator' @ [96:67] ==> public final val hasSpreadOperator: Boolean defined in org.jetbrains.kotlin.js.translate.reference.CallArgumentTranslator.ArgumentsInfo[PropertyDescriptorImpl]

