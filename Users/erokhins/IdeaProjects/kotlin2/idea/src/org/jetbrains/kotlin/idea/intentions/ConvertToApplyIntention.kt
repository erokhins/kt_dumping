'ConvertToScopeIntention<KtExpression>' @ [23:33] ==> public constructor ConvertToScopeIntention<TExpression : KtExpression>(elementType: Class<KtExpression>, text: String) defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention[ClassConstructorDescriptorImpl]
Inferred types:
    <TExpression : KtExpression> -> KtExpression

'java' @ [24:29] ==> public val <T> KClass<KtExpression>.java: Class<KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'scopeExpression' @ [27:15] ==> value-parameter scopeExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.findCallExpressionFrom[ValueParameterDescriptorImpl]

'initializer' @ [27:48] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'callExpression' @ [27:88] ==> public val KtQualifiedExpression.callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[PropertyDescriptorImpl]

'when (element) {
            is KtProperty -> element.isApplicable()
            is KtDotQualifiedExpression -> {
                val receiverExpressionText = element.getLeftMostReceiverExpression().text
                isApplicableWithGivenReceiverText(element, receiverExpressionText) &&
                element.findTargetProperty(receiverExpressionText)?.isApplicable() ?: false
            }
            else -> false
        }' @ [30:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'element' @ [30:22] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.isApplicableTo[ValueParameterDescriptorImpl]

'element' @ [31:30] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.isApplicableTo[ValueParameterDescriptorImpl]

'isApplicable' @ [31:38] ==> private final fun KtProperty.isApplicable(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention[SimpleFunctionDescriptorImpl]

'element' @ [33:46] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.isApplicableTo[ValueParameterDescriptorImpl]

'getLeftMostReceiverExpression' @ [33:54] ==> public fun KtDotQualifiedExpression.getLeftMostReceiverExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'text' @ [33:86] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'isApplicableWithGivenReceiverText' @ [34:17] ==> protected final fun isApplicableWithGivenReceiverText(expression: KtDotQualifiedExpression, receiverExpressionText: String): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention[SimpleFunctionDescriptorImpl]

'element' @ [34:51] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.isApplicableTo[ValueParameterDescriptorImpl]

'receiverExpressionText' @ [34:60] ==> val receiverExpressionText: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.isApplicableTo[LocalVariableDescriptor]

'element' @ [35:17] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.isApplicableTo[ValueParameterDescriptorImpl]

'findTargetProperty' @ [35:25] ==> private final fun KtDotQualifiedExpression.findTargetProperty(receiverExpressionText: String): KtProperty? defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention[SimpleFunctionDescriptorImpl]

'receiverExpressionText' @ [35:44] ==> val receiverExpressionText: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.isApplicableTo[LocalVariableDescriptor]

'isApplicable' @ [35:69] ==> private final fun KtProperty.isApplicable(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention[SimpleFunctionDescriptorImpl]

'!' @ [42:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLocal' @ [42:14] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'name' @ [43:33] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'getDotQualifiedSiblingIfAny' @ [44:33] ==> protected final fun KtExpression.getDotQualifiedSiblingIfAny(forward: Boolean): KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention[SimpleFunctionDescriptorImpl]

'firstDotQualified' @ [45:13] ==> val firstDotQualified: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.isApplicable[LocalVariableDescriptor]

'isApplicableWithGivenReceiverText' @ [45:42] ==> protected final fun isApplicableWithGivenReceiverText(expression: KtDotQualifiedExpression, receiverExpressionText: String): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention[SimpleFunctionDescriptorImpl]

'firstDotQualified' @ [45:76] ==> val firstDotQualified: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.isApplicable[LocalVariableDescriptor]

'localVariableName' @ [45:95] ==> val localVariableName: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.isApplicable[LocalVariableDescriptor]

'firstDotQualified' @ [46:36] ==> val firstDotQualified: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.isApplicable[LocalVariableDescriptor]

'getDotQualifiedSiblingIfAny' @ [46:54] ==> protected final fun KtExpression.getDotQualifiedSiblingIfAny(forward: Boolean): KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention[SimpleFunctionDescriptorImpl]

'nextDotQualified' @ [47:20] ==> val nextDotQualified: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.isApplicable[LocalVariableDescriptor]

'isApplicableWithGivenReceiverText' @ [47:48] ==> protected final fun isApplicableWithGivenReceiverText(expression: KtDotQualifiedExpression, receiverExpressionText: String): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention[SimpleFunctionDescriptorImpl]

'nextDotQualified' @ [47:82] ==> val nextDotQualified: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.isApplicable[LocalVariableDescriptor]

'localVariableName' @ [47:100] ==> val localVariableName: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.isApplicable[LocalVariableDescriptor]

'getPrevSiblingIgnoringWhitespaceAndComments' @ [53:22] ==> public fun PsiElement.getPrevSiblingIgnoringWhitespaceAndComments(withItself: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'when (target) {
            is KtProperty ->
                if (target.name == receiverExpressionText) {
                    return target
                }
            is KtDotQualifiedExpression ->
                if (isApplicableWithGivenReceiverText(target, receiverExpressionText)) {
                    return target.findTargetProperty(receiverExpressionText)
                }
        }' @ [54:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'target' @ [54:15] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.findTargetProperty[LocalVariableDescriptor]

'target' @ [56:21] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.findTargetProperty[LocalVariableDescriptor]

'name' @ [56:28] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'receiverExpressionText' @ [56:36] ==> value-parameter receiverExpressionText: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.findTargetProperty[ValueParameterDescriptorImpl]

'target' @ [57:28] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.findTargetProperty[LocalVariableDescriptor]

'isApplicableWithGivenReceiverText' @ [60:21] ==> protected final fun isApplicableWithGivenReceiverText(expression: KtDotQualifiedExpression, receiverExpressionText: String): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention[SimpleFunctionDescriptorImpl]

'target' @ [60:55] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.findTargetProperty[LocalVariableDescriptor]

'receiverExpressionText' @ [60:63] ==> value-parameter receiverExpressionText: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.findTargetProperty[ValueParameterDescriptorImpl]

'target' @ [61:28] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.findTargetProperty[LocalVariableDescriptor]

'findTargetProperty' @ [61:35] ==> private final fun KtDotQualifiedExpression.findTargetProperty(receiverExpressionText: String): KtProperty? defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention[SimpleFunctionDescriptorImpl]

'receiverExpressionText' @ [61:54] ==> value-parameter receiverExpressionText: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.findTargetProperty[ValueParameterDescriptorImpl]

'when (element) {
            is KtProperty -> applyWithGivenReceiverText(element, element.name ?: return)
            is KtDotQualifiedExpression -> {
                val receiverExpressionText = element.getReceiverExpressionText() ?: return
                val property = element.findTargetProperty(receiverExpressionText) ?: return
                applyWithGivenReceiverText(property, receiverExpressionText)
            }
        }' @ [68:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [68:15] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.applyTo[ValueParameterDescriptorImpl]

'applyWithGivenReceiverText' @ [69:30] ==> protected final fun applyWithGivenReceiverText(expression: KtExpression, receiverExpressionText: String): Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention[SimpleFunctionDescriptorImpl]

'element' @ [69:57] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [69:66] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.applyTo[ValueParameterDescriptorImpl]

'name' @ [69:74] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'element' @ [71:46] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.applyTo[ValueParameterDescriptorImpl]

'getReceiverExpressionText' @ [71:54] ==> protected final fun KtDotQualifiedExpression.getReceiverExpressionText(): String? defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention[SimpleFunctionDescriptorImpl]

'element' @ [72:32] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.applyTo[ValueParameterDescriptorImpl]

'findTargetProperty' @ [72:40] ==> private final fun KtDotQualifiedExpression.findTargetProperty(receiverExpressionText: String): KtProperty? defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention[SimpleFunctionDescriptorImpl]

'receiverExpressionText' @ [72:59] ==> val receiverExpressionText: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.applyTo[LocalVariableDescriptor]

'applyWithGivenReceiverText' @ [73:17] ==> protected final fun applyWithGivenReceiverText(expression: KtExpression, receiverExpressionText: String): Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention[SimpleFunctionDescriptorImpl]

'property' @ [73:44] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.applyTo[LocalVariableDescriptor]

'receiverExpressionText' @ [73:54] ==> val receiverExpressionText: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.applyTo[LocalVariableDescriptor]

'element' @ [79:13] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.createScopeExpression[ValueParameterDescriptorImpl]

'element' @ [80:38] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.createScopeExpression[ValueParameterDescriptorImpl]

'name' @ [80:46] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'factory' @ [81:16] ==> value-parameter factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.createScopeExpression[ValueParameterDescriptorImpl]

'createProperty' @ [81:24] ==> public final fun createProperty(name: String, type: String?, isVar: Boolean, initializer: String?): KtProperty defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'receiverExpressionText' @ [81:39] ==> val receiverExpressionText: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.createScopeExpression[LocalVariableDescriptor]

'element' @ [81:63] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.createScopeExpression[ValueParameterDescriptorImpl]

'typeReference' @ [81:71] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'text' @ [81:86] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'element' @ [81:92] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.createScopeExpression[ValueParameterDescriptorImpl]

'isVar' @ [81:100] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'element' @ [82:42] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention.createScopeExpression[ValueParameterDescriptorImpl]

'initializer' @ [82:50] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'text' @ [82:63] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

