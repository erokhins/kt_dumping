'IntentionBasedInspection<KtWhenExpression>' @ [27:40] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtWhenExpression>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtWhenExpression

'IntroduceWhenSubjectIntention' @ [27:83] ==> public constructor IntroduceWhenSubjectIntention() defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IntroduceWhenSubjectIntention[ClassConstructorDescriptorImpl]

'SelfTargetingRangeIntention<KtWhenExpression>' @ [29:39] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtWhenExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtWhenExpression

'KtWhenExpression' @ [29:85] ==> public constructor KtWhenExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtWhenExpression[JavaClassConstructorDescriptor]

'java' @ [29:109] ==> public val <T> KClass<KtWhenExpression>.java: Class<KtWhenExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'element' @ [31:23] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IntroduceWhenSubjectIntention.applicabilityRange[ValueParameterDescriptorImpl]

'getSubjectToIntroduce' @ [31:31] ==> public fun KtWhenExpression.getSubjectToIntroduce(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file branchedTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'text' @ [32:9] ==> public final var IntroduceWhenSubjectIntention.text: String[MyPropertyDescriptor]

'subject' @ [32:30] ==> val subject: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IntroduceWhenSubjectIntention.applicabilityRange[LocalVariableDescriptor]

'text' @ [32:38] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'element' @ [33:16] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IntroduceWhenSubjectIntention.applicabilityRange[ValueParameterDescriptorImpl]

'whenKeyword' @ [33:24] ==> public final val KtWhenExpression.whenKeyword: PsiElement[MyPropertyDescriptor]

'textRange' @ [33:36] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'element' @ [37:9] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IntroduceWhenSubjectIntention.applyTo[ValueParameterDescriptorImpl]

'introduceSubject' @ [37:17] ==> public fun KtWhenExpression.introduceSubject(): KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file branchedTransformationUtils.kt[SimpleFunctionDescriptorImpl]

