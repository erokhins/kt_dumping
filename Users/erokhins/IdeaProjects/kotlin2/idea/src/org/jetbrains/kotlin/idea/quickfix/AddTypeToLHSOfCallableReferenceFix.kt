'KotlinQuickFixAction<KtCallableReferenceExpression>' @ [34:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtCallableReferenceExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtCallableReferenceExpression

'expression' @ [34:57] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.AddTypeToLHSOfCallableReferenceFix.<init>[ValueParameterDescriptorImpl]

'familyName' @ [36:30] ==> public final val AddTypeToLHSOfCallableReferenceFix.familyName: String[MyPropertyDescriptor]

'element' @ [39:23] ==> protected final val element: KtCallableReferenceExpression? defined in org.jetbrains.kotlin.idea.quickfix.AddTypeToLHSOfCallableReferenceFix[PropertyDescriptorImpl]

'element' @ [40:28] ==> val element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.AddTypeToLHSOfCallableReferenceFix.invoke[LocalVariableDescriptor]

'callableReference' @ [40:36] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getResolvedCall' @ [40:54] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [40:70] ==> val element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.AddTypeToLHSOfCallableReferenceFix.invoke[LocalVariableDescriptor]

'analyze' @ [40:78] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [40:102] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'with' @ [41:24] ==> @InlineOnly public inline fun <T, R> with(receiver: ResolvedCall<out CallableDescriptor>, block: (ResolvedCall<out CallableDescriptor>).() -> ReceiverValue): ReceiverValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<out CallableDescriptor>
    <R> -> ReceiverValue

'resolvedCall' @ [41:29] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.AddTypeToLHSOfCallableReferenceFix.invoke[LocalVariableDescriptor]

'dispatchReceiver' @ [42:13] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'extensionReceiver' @ [42:33] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'KtPsiFactory' @ [44:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [44:39] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddTypeToLHSOfCallableReferenceFix.invoke[ValueParameterDescriptorImpl]

'createExpression' @ [44:48] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'SOURCE_CODE' @ [44:88] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [44:100] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'receiver' @ [44:111] ==> val receiver: ReceiverValue defined in org.jetbrains.kotlin.idea.quickfix.AddTypeToLHSOfCallableReferenceFix.invoke[LocalVariableDescriptor]

'type' @ [44:120] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'element' @ [45:9] ==> val element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.AddTypeToLHSOfCallableReferenceFix.invoke[LocalVariableDescriptor]

'setReceiverExpression' @ [45:17] ==> public final fun setReceiverExpression(newReceiverExpression: KtExpression): Unit defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[DeserializedSimpleFunctionDescriptor]

'expression' @ [45:39] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddTypeToLHSOfCallableReferenceFix.invoke[LocalVariableDescriptor]

'ShortenReferences' @ [46:9] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [46:27] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [46:35] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'element' @ [46:43] ==> val element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.AddTypeToLHSOfCallableReferenceFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [49:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'AddTypeToLHSOfCallableReferenceFix' @ [51:20] ==> public constructor AddTypeToLHSOfCallableReferenceFix(expression: KtCallableReferenceExpression) defined in org.jetbrains.kotlin.idea.quickfix.AddTypeToLHSOfCallableReferenceFix[ClassConstructorDescriptorImpl]

'diagnostic' @ [51:55] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.AddTypeToLHSOfCallableReferenceFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [51:66] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'parent' @ [51:77] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

