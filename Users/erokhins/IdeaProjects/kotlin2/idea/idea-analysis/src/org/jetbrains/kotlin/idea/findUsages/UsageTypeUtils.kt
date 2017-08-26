'when (element) {
            is KtForExpression -> return IMPLICIT_ITERATION
            is KtDestructuringDeclarationEntry -> return READ
            is KtPropertyDelegate -> return PROPERTY_DELEGATION
            is KtStringTemplateExpression -> return USAGE_IN_STRING_LITERAL
        }' @ [36:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'element' @ [36:15] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[ValueParameterDescriptorImpl]

'IMPLICIT_ITERATION' @ [37:42] ==> enum entry IMPLICIT_ITERATION defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'READ' @ [38:58] ==> enum entry READ defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'PROPERTY_DELEGATION' @ [39:45] ==> enum entry PROPERTY_DELEGATION defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'USAGE_IN_STRING_LITERAL' @ [40:53] ==> enum entry USAGE_IN_STRING_LITERAL defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'element' @ [43:23] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [43:32] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtReferenceExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtReferenceExpression

'refExpr' @ [45:23] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'analyze' @ [45:31] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [45:55] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'when {
                refExpr.getNonStrictParentOfType<KtImportDirective>() != null ->
                    CLASS_IMPORT
                refExpr.getParentOfTypeAndBranch<KtCallableReferenceExpression>(){ callableReference } != null ->
                    CALLABLE_REFERENCE
                else -> null
            }' @ [48:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UsageTypeEnum?, entry1: UsageTypeEnum?, entry2: UsageTypeEnum?): UsageTypeEnum?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UsageTypeEnum?

'refExpr' @ [49:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [49:25] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'CLASS_IMPORT' @ [50:21] ==> enum entry CLASS_IMPORT defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'refExpr' @ [51:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [51:25] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallableReferenceExpression.() -> PsiElement?): KtCallableReferenceExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallableReferenceExpression

'callableReference' @ [51:84] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'CALLABLE_REFERENCE' @ [52:21] ==> enum entry CALLABLE_REFERENCE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'refExpr' @ [58:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [58:25] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtTypeProjection? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeProjection

'TYPE_PARAMETER' @ [58:86] ==> enum entry TYPE_PARAMETER defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'refExpr' @ [60:28] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [60:36] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'property' @ [61:17] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getClassUsageType[LocalVariableDescriptor]

'when {
                    property.typeReference.isAncestor(refExpr) ->
                        return if (property.isLocal) CLASS_LOCAL_VAR_DECLARATION else NON_LOCAL_PROPERTY_TYPE

                    property.receiverTypeReference.isAncestor(refExpr) ->
                        return EXTENSION_RECEIVER_TYPE
                }' @ [62:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'property' @ [63:21] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getClassUsageType[LocalVariableDescriptor]

'typeReference' @ [63:30] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'isAncestor' @ [63:44] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'refExpr' @ [63:55] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'if (property.isLocal) CLASS_LOCAL_VAR_DECLARATION else NON_LOCAL_PROPERTY_TYPE' @ [64:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UsageTypeEnum?, elseBranch: UsageTypeEnum?): UsageTypeEnum?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UsageTypeEnum?

'property' @ [64:36] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getClassUsageType[LocalVariableDescriptor]

'isLocal' @ [64:45] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'CLASS_LOCAL_VAR_DECLARATION' @ [64:54] ==> enum entry CLASS_LOCAL_VAR_DECLARATION defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'NON_LOCAL_PROPERTY_TYPE' @ [64:87] ==> enum entry NON_LOCAL_PROPERTY_TYPE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'property' @ [66:21] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getClassUsageType[LocalVariableDescriptor]

'receiverTypeReference' @ [66:30] ==> public final val KtProperty.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'isAncestor' @ [66:52] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'refExpr' @ [66:63] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'EXTENSION_RECEIVER_TYPE' @ [67:32] ==> enum entry EXTENSION_RECEIVER_TYPE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'refExpr' @ [71:28] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [71:36] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtFunction? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtFunction

'function' @ [72:17] ==> val function: KtFunction? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getClassUsageType[LocalVariableDescriptor]

'when {
                    function.typeReference.isAncestor(refExpr) ->
                        return FUNCTION_RETURN_TYPE
                    function.receiverTypeReference.isAncestor(refExpr) ->
                        return EXTENSION_RECEIVER_TYPE
                }' @ [73:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'function' @ [74:21] ==> val function: KtFunction? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getClassUsageType[LocalVariableDescriptor]

'typeReference' @ [74:30] ==> public final var KtFunction.typeReference: KtTypeReference?[MyPropertyDescriptor]

'isAncestor' @ [74:44] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'refExpr' @ [74:55] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'FUNCTION_RETURN_TYPE' @ [75:32] ==> enum entry FUNCTION_RETURN_TYPE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'function' @ [76:21] ==> val function: KtFunction? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getClassUsageType[LocalVariableDescriptor]

'receiverTypeReference' @ [76:30] ==> public final val KtFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'isAncestor' @ [76:52] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'refExpr' @ [76:63] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'EXTENSION_RECEIVER_TYPE' @ [77:32] ==> enum entry EXTENSION_RECEIVER_TYPE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'when {
                refExpr.getParentOfTypeAndBranch<KtTypeParameter>(){ extendsBound } != null
                || refExpr.getParentOfTypeAndBranch<KtTypeConstraint>(){ boundTypeReference } != null ->
                    TYPE_CONSTRAINT

                refExpr is KtSuperTypeListEntry
                || refExpr.getParentOfTypeAndBranch<KtSuperTypeListEntry>(){ typeReference } != null ->
                    SUPER_TYPE

                refExpr.getParentOfTypeAndBranch<KtParameter>(){ typeReference } != null ->
                    VALUE_PARAMETER_TYPE

                refExpr.getParentOfTypeAndBranch<KtIsExpression>(){ typeReference } != null
                || refExpr.getParentOfTypeAndBranch<KtWhenConditionIsPattern>(){ typeReference } != null ->
                    IS

                with(refExpr.getParentOfTypeAndBranch<KtBinaryExpressionWithTypeRHS>(){ right }) {
                    val opType = this?.operationReference?.getReferencedNameElementType()
                    opType == KtTokens.AS_KEYWORD || opType == KtTokens.AS_SAFE
                } ->
                    CLASS_CAST_TO

                with(refExpr.getNonStrictParentOfType<KtDotQualifiedExpression>()) {
                    when {
                        this == null -> {
                            false
                        }
                        receiverExpression == refExpr -> {
                            true
                        }
                        else -> {
                            selectorExpression == refExpr
                            && getParentOfTypeAndBranch<KtDotQualifiedExpression>(strict = true) { receiverExpression } != null
                        }
                    }
                } ->
                    CLASS_OBJECT_ACCESS

                refExpr.getParentOfTypeAndBranch<KtSuperExpression>(){ superTypeQualifier } != null ->
                    SUPER_TYPE_QUALIFIER

                refExpr.getParentOfTypeAndBranch<KtTypeAlias> { getTypeReference() } != null ->
                    TYPE_ALIAS

                else -> null
            }' @ [81:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UsageTypeEnum?, entry1: UsageTypeEnum?, entry2: UsageTypeEnum?, entry3: UsageTypeEnum?, entry4: UsageTypeEnum?, entry5: UsageTypeEnum?, entry6: UsageTypeEnum?, entry7: UsageTypeEnum?, entry8: UsageTypeEnum?): UsageTypeEnum?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UsageTypeEnum?

'refExpr' @ [82:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [82:25] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtTypeParameter.() -> PsiElement?): KtTypeParameter? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeParameter

'extendsBound' @ [82:70] ==> public final var KtTypeParameter.extendsBound: KtTypeReference?[MyPropertyDescriptor]

'refExpr' @ [83:20] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [83:28] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtTypeConstraint.() -> PsiElement?): KtTypeConstraint? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeConstraint

'boundTypeReference' @ [83:74] ==> public final val KtTypeConstraint.boundTypeReference: KtTypeReference?[MyPropertyDescriptor]

'TYPE_CONSTRAINT' @ [84:21] ==> enum entry TYPE_CONSTRAINT defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'refExpr' @ [86:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'refExpr' @ [87:20] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [87:28] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtSuperTypeListEntry.() -> PsiElement?): KtSuperTypeListEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSuperTypeListEntry

'typeReference' @ [87:78] ==> public final val KtSuperTypeListEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'SUPER_TYPE' @ [88:21] ==> enum entry SUPER_TYPE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'refExpr' @ [90:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [90:25] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtParameter.() -> PsiElement?): KtParameter? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtParameter

'typeReference' @ [90:66] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'VALUE_PARAMETER_TYPE' @ [91:21] ==> enum entry VALUE_PARAMETER_TYPE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'refExpr' @ [93:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [93:25] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtIsExpression.() -> PsiElement?): KtIsExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtIsExpression

'typeReference' @ [93:69] ==> public final val KtIsExpression.typeReference: KtTypeReference?[MyPropertyDescriptor]

'refExpr' @ [94:20] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [94:28] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtWhenConditionIsPattern.() -> PsiElement?): KtWhenConditionIsPattern? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtWhenConditionIsPattern

'typeReference' @ [94:82] ==> public final val KtWhenConditionIsPattern.typeReference: KtTypeReference?[MyPropertyDescriptor]

'IS' @ [95:21] ==> enum entry IS defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'with' @ [97:17] ==> @InlineOnly public inline fun <T, R> with(receiver: KtBinaryExpressionWithTypeRHS?, block: KtBinaryExpressionWithTypeRHS?.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtBinaryExpressionWithTypeRHS?
    <R> -> Boolean

'refExpr' @ [97:22] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [97:30] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtBinaryExpressionWithTypeRHS.() -> PsiElement?): KtBinaryExpressionWithTypeRHS? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtBinaryExpressionWithTypeRHS

'right' @ [97:89] ==> public final val KtBinaryExpressionWithTypeRHS.right: KtTypeReference?[MyPropertyDescriptor]

'this' @ [98:34] ==> <this> defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getClassUsageType.<anonymous>[ReceiverParameterDescriptorImpl]

'operationReference' @ [98:40] ==> public final val KtBinaryExpressionWithTypeRHS.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [98:60] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'opType' @ [99:21] ==> val opType: IElementType? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getClassUsageType.<anonymous>[LocalVariableDescriptor]

'AS_KEYWORD' @ [99:40] ==> public final val AS_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'opType' @ [99:54] ==> val opType: IElementType? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getClassUsageType.<anonymous>[LocalVariableDescriptor]

'AS_SAFE' @ [99:73] ==> public final val AS_SAFE: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'CLASS_CAST_TO' @ [101:21] ==> enum entry CLASS_CAST_TO defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'with' @ [103:17] ==> @InlineOnly public inline fun <T, R> with(receiver: KtDotQualifiedExpression?, block: KtDotQualifiedExpression?.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDotQualifiedExpression?
    <R> -> Boolean

'refExpr' @ [103:22] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [103:30] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtDotQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDotQualifiedExpression

'when {
                        this == null -> {
                            false
                        }
                        receiverExpression == refExpr -> {
                            true
                        }
                        else -> {
                            selectorExpression == refExpr
                            && getParentOfTypeAndBranch<KtDotQualifiedExpression>(strict = true) { receiverExpression } != null
                        }
                    }' @ [104:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [105:25] ==> <this> defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getClassUsageType.<anonymous>[ReceiverParameterDescriptorImpl]

'receiverExpression' @ [108:25] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'refExpr' @ [108:47] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'selectorExpression' @ [112:29] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'refExpr' @ [112:51] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [113:32] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtDotQualifiedExpression.() -> PsiElement?): KtDotQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDotQualifiedExpression

'receiverExpression' @ [113:100] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'CLASS_OBJECT_ACCESS' @ [117:21] ==> enum entry CLASS_OBJECT_ACCESS defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'refExpr' @ [119:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [119:25] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtSuperExpression.() -> PsiElement?): KtSuperExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSuperExpression

'superTypeQualifier' @ [119:72] ==> public final val KtSuperExpression.superTypeQualifier: KtTypeReference?[MyPropertyDescriptor]

'SUPER_TYPE_QUALIFIER' @ [120:21] ==> enum entry SUPER_TYPE_QUALIFIER defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'refExpr' @ [122:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [122:25] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtTypeAlias.() -> PsiElement?): KtTypeAlias? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeAlias

'getTypeReference' @ [122:65] ==> @IfNotParsed public final fun getTypeReference(): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtTypeAlias[DeserializedSimpleFunctionDescriptor]

'TYPE_ALIAS' @ [123:21] ==> enum entry TYPE_ALIAS defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'refExpr' @ [130:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [130:25] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtDelegatedSuperTypeEntry.() -> PsiElement?): KtDelegatedSuperTypeEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDelegatedSuperTypeEntry

'delegateExpression' @ [130:80] ==> public final val KtDelegatedSuperTypeEntry.delegateExpression: KtExpression?[MyPropertyDescriptor]

'DELEGATE' @ [131:24] ==> enum entry DELEGATE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'refExpr' @ [134:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'parent' @ [134:25] ==> public final val KtReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'NAMED_ARGUMENT' @ [134:63] ==> enum entry NAMED_ARGUMENT defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'refExpr' @ [136:42] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [136:50] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtDotQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDotQualifiedExpression

'dotQualifiedExpression' @ [138:17] ==> val dotQualifiedExpression: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getVariableUsageType[LocalVariableDescriptor]

'dotQualifiedExpression' @ [139:30] ==> val dotQualifiedExpression: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getVariableUsageType[LocalVariableDescriptor]

'parent' @ [139:53] ==> public final val KtDotQualifiedExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when {
                    dotQualifiedExpression.receiverExpression.isAncestor(refExpr) ->
                        return RECEIVER

                    parent is KtDotQualifiedExpression && parent.receiverExpression.isAncestor(refExpr) ->
                        return RECEIVER
                }' @ [140:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'dotQualifiedExpression' @ [141:21] ==> val dotQualifiedExpression: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getVariableUsageType[LocalVariableDescriptor]

'receiverExpression' @ [141:44] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'isAncestor' @ [141:63] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'refExpr' @ [141:74] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'RECEIVER' @ [142:32] ==> enum entry RECEIVER defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'parent' @ [144:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getVariableUsageType[LocalVariableDescriptor]

'parent' @ [144:59] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getVariableUsageType[LocalVariableDescriptor]

'receiverExpression' @ [144:66] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'isAncestor' @ [144:85] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'refExpr' @ [144:96] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'RECEIVER' @ [145:32] ==> enum entry RECEIVER defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'when (refExpr.readWriteAccess(useResolveForReadWrite = true)) {
                ReferenceAccess.READ -> READ
                ReferenceAccess.WRITE, ReferenceAccess.READ_WRITE -> WRITE
            }' @ [149:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UsageTypeEnum?, entry1: UsageTypeEnum?): UsageTypeEnum?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UsageTypeEnum?

'refExpr' @ [149:26] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'readWriteAccess' @ [149:34] ==> public fun KtExpression.readWriteAccess(useResolveForReadWrite: Boolean): ReferenceAccess defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[SimpleFunctionDescriptorImpl]

'READ' @ [150:33] ==> enum entry READ defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'READ' @ [150:41] ==> enum entry READ defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'WRITE' @ [151:33] ==> enum entry WRITE defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'READ_WRITE' @ [151:56] ==> enum entry READ_WRITE defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'WRITE' @ [151:70] ==> enum entry WRITE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'when (refExpr.mainReference) {
                is KtArrayAccessReference -> {
                    return when {
                        context[BindingContext.INDEXED_LVALUE_GET, refExpr] != null -> IMPLICIT_GET
                        context[BindingContext.INDEXED_LVALUE_SET, refExpr] != null -> IMPLICIT_SET
                        else -> null
                    }
                }
                is KtInvokeFunctionReference -> return IMPLICIT_INVOKE
            }' @ [156:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'refExpr' @ [156:19] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'mainReference' @ [156:27] ==> public val KtReferenceExpression.mainReference: KtReference defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'when {
                        context[BindingContext.INDEXED_LVALUE_GET, refExpr] != null -> IMPLICIT_GET
                        context[BindingContext.INDEXED_LVALUE_SET, refExpr] != null -> IMPLICIT_SET
                        else -> null
                    }' @ [158:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UsageTypeEnum?, entry1: UsageTypeEnum?, entry2: UsageTypeEnum?): UsageTypeEnum?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UsageTypeEnum?

'context' @ [159:25] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'INDEXED_LVALUE_GET' @ [159:48] ==> public final val INDEXED_LVALUE_GET: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'refExpr' @ [159:68] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'IMPLICIT_GET' @ [159:88] ==> enum entry IMPLICIT_GET defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'context' @ [160:25] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'INDEXED_LVALUE_SET' @ [160:48] ==> public final val INDEXED_LVALUE_SET: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'refExpr' @ [160:68] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'IMPLICIT_SET' @ [160:88] ==> enum entry IMPLICIT_SET defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'IMPLICIT_INVOKE' @ [164:56] ==> enum entry IMPLICIT_INVOKE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'when {
                refExpr.getParentOfTypeAndBranch<KtSuperTypeListEntry>(){ typeReference } != null ->
                    SUPER_TYPE

                descriptor is ConstructorDescriptor
                && refExpr.getParentOfTypeAndBranch<KtAnnotationEntry>(){ typeReference } != null ->
                    ANNOTATION

                with(refExpr.getParentOfTypeAndBranch<KtCallExpression>(){ calleeExpression }) {
                    this?.calleeExpression is KtSimpleNameExpression
                } ->
                    if (descriptor is ConstructorDescriptor) CLASS_NEW_OPERATOR else FUNCTION_CALL

                refExpr.getParentOfTypeAndBranch<KtBinaryExpression>(){ operationReference } != null ||
                refExpr.getParentOfTypeAndBranch<KtUnaryExpression>(){ operationReference } != null ||
                refExpr.getParentOfTypeAndBranch<KtWhenConditionInRange>(){ operationReference } != null ->
                    FUNCTION_CALL

                else -> null
            }' @ [167:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UsageTypeEnum?, entry1: UsageTypeEnum?, entry2: UsageTypeEnum?, entry3: UsageTypeEnum?, entry4: UsageTypeEnum?): UsageTypeEnum?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UsageTypeEnum?

'refExpr' @ [168:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [168:25] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtSuperTypeListEntry.() -> PsiElement?): KtSuperTypeListEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSuperTypeListEntry

'typeReference' @ [168:75] ==> public final val KtSuperTypeListEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'SUPER_TYPE' @ [169:21] ==> enum entry SUPER_TYPE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'descriptor' @ [171:17] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getFunctionUsageType[ValueParameterDescriptorImpl]

'refExpr' @ [172:20] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [172:28] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtAnnotationEntry.() -> PsiElement?): KtAnnotationEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtAnnotationEntry

'typeReference' @ [172:75] ==> public final val KtAnnotationEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'ANNOTATION' @ [173:21] ==> enum entry ANNOTATION defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'with' @ [175:17] ==> @InlineOnly public inline fun <T, R> with(receiver: KtCallExpression?, block: KtCallExpression?.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression?
    <R> -> Boolean

'refExpr' @ [175:22] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [175:30] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallExpression.() -> PsiElement?): KtCallExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallExpression

'calleeExpression' @ [175:76] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'this' @ [176:21] ==> <this> defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getFunctionUsageType.<anonymous>[ReceiverParameterDescriptorImpl]

'calleeExpression' @ [176:27] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'if (descriptor is ConstructorDescriptor) CLASS_NEW_OPERATOR else FUNCTION_CALL' @ [178:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UsageTypeEnum, elseBranch: UsageTypeEnum): UsageTypeEnum[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UsageTypeEnum

'descriptor' @ [178:25] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType.getFunctionUsageType[ValueParameterDescriptorImpl]

'CLASS_NEW_OPERATOR' @ [178:62] ==> enum entry CLASS_NEW_OPERATOR defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'FUNCTION_CALL' @ [178:86] ==> enum entry FUNCTION_CALL defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'refExpr' @ [180:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [180:25] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtBinaryExpression.() -> PsiElement?): KtBinaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtBinaryExpression

'operationReference' @ [180:73] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'refExpr' @ [181:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [181:25] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtUnaryExpression.() -> PsiElement?): KtUnaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUnaryExpression

'operationReference' @ [181:72] ==> public final val KtUnaryExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'refExpr' @ [182:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [182:25] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtWhenConditionInRange.() -> PsiElement?): KtWhenConditionInRange? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtWhenConditionInRange

'operationReference' @ [182:77] ==> public final val KtWhenConditionInRange.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'FUNCTION_CALL' @ [183:21] ==> enum entry FUNCTION_CALL defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'when {
                refExpr.getNonStrictParentOfType<KtPackageDirective>() != null -> PACKAGE_DIRECTIVE
                refExpr.getNonStrictParentOfType<KtQualifiedExpression>() != null -> PACKAGE_MEMBER_ACCESS
                else -> getClassUsageType()
            }' @ [190:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UsageTypeEnum?, entry1: UsageTypeEnum?, entry2: UsageTypeEnum?): UsageTypeEnum?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UsageTypeEnum?

'refExpr' @ [191:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [191:25] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtPackageDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtPackageDirective

'PACKAGE_DIRECTIVE' @ [191:83] ==> enum entry PACKAGE_DIRECTIVE defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'refExpr' @ [192:17] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [192:25] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtQualifiedExpression

'PACKAGE_MEMBER_ACCESS' @ [192:86] ==> enum entry PACKAGE_MEMBER_ACCESS defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'getClassUsageType' @ [193:25] ==> local final fun getClassUsageType(): UsageTypeEnum? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[SimpleFunctionDescriptorImpl]

'getCommonUsageType' @ [197:25] ==> local final fun getCommonUsageType(): UsageTypeEnum? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[SimpleFunctionDescriptorImpl]

'usageType' @ [198:13] ==> val usageType: UsageTypeEnum? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'usageType' @ [198:39] ==> val usageType: UsageTypeEnum? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'context' @ [200:26] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [200:49] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'refExpr' @ [200:67] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'when (descriptor) {
            is ClassifierDescriptor -> when {
            // Treat object accesses as variables to simulate the old behaviour (when variables were created for objects)
                DescriptorUtils.isNonCompanionObject(descriptor) || DescriptorUtils.isEnumEntry(descriptor) -> getVariableUsageType()
                DescriptorUtils.isCompanionObject(descriptor) -> COMPANION_OBJECT_ACCESS
                else -> getClassUsageType()
            }
            is PackageViewDescriptor -> {
                if (refExpr.mainReference.resolve() is PsiPackage) getPackageUsageType() else getClassUsageType()
            }
            is VariableDescriptor -> getVariableUsageType()
            is FunctionDescriptor -> getFunctionUsageType(descriptor)
            else -> null
        }' @ [202:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UsageTypeEnum?, entry1: UsageTypeEnum?, entry2: UsageTypeEnum?, entry3: UsageTypeEnum?, entry4: UsageTypeEnum?): UsageTypeEnum?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UsageTypeEnum?

'descriptor' @ [202:22] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'when {
            // Treat object accesses as variables to simulate the old behaviour (when variables were created for objects)
                DescriptorUtils.isNonCompanionObject(descriptor) || DescriptorUtils.isEnumEntry(descriptor) -> getVariableUsageType()
                DescriptorUtils.isCompanionObject(descriptor) -> COMPANION_OBJECT_ACCESS
                else -> getClassUsageType()
            }' @ [203:40] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UsageTypeEnum?, entry1: UsageTypeEnum?, entry2: UsageTypeEnum?): UsageTypeEnum?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UsageTypeEnum?

'isNonCompanionObject' @ [205:33] ==> public open fun isNonCompanionObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [205:54] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'isEnumEntry' @ [205:85] ==> public open fun isEnumEntry(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [205:97] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'getVariableUsageType' @ [205:112] ==> local final fun getVariableUsageType(): UsageTypeEnum? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[SimpleFunctionDescriptorImpl]

'isCompanionObject' @ [206:33] ==> public open fun isCompanionObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [206:51] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'COMPANION_OBJECT_ACCESS' @ [206:66] ==> enum entry COMPANION_OBJECT_ACCESS defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeEnum[FakeCallableDescriptorForObject]

'getClassUsageType' @ [207:25] ==> local final fun getClassUsageType(): UsageTypeEnum? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[SimpleFunctionDescriptorImpl]

'if (refExpr.mainReference.resolve() is PsiPackage) getPackageUsageType() else getClassUsageType()' @ [210:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UsageTypeEnum?, elseBranch: UsageTypeEnum?): UsageTypeEnum?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UsageTypeEnum?

'refExpr' @ [210:21] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

'mainReference' @ [210:29] ==> public val KtReferenceExpression.mainReference: KtReference defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'resolve' @ [210:43] ==> @Nullable public abstract fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtReference[JavaMethodDescriptor]

'getPackageUsageType' @ [210:68] ==> local final fun getPackageUsageType(): UsageTypeEnum? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[SimpleFunctionDescriptorImpl]

'getClassUsageType' @ [210:95] ==> local final fun getClassUsageType(): UsageTypeEnum? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[SimpleFunctionDescriptorImpl]

'getVariableUsageType' @ [212:38] ==> local final fun getVariableUsageType(): UsageTypeEnum? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[SimpleFunctionDescriptorImpl]

'getFunctionUsageType' @ [213:38] ==> local final fun getFunctionUsageType(descriptor: FunctionDescriptor): UsageTypeEnum? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[SimpleFunctionDescriptorImpl]

'descriptor' @ [213:59] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.findUsages.UsageTypeUtils.getUsageType[LocalVariableDescriptor]

