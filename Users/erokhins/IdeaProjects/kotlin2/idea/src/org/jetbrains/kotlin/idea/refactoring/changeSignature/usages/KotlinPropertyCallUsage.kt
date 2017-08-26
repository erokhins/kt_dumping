'KotlinUsageInfo<KtSimpleNameExpression>' @ [31:65] ==> public constructor KotlinUsageInfo<T : PsiElement>(element: KtSimpleNameExpression) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinUsageInfo[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtSimpleNameExpression

'element' @ [31:105] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.<init>[ValueParameterDescriptorImpl]

'element' @ [32:32] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.<init>[ValueParameterDescriptorImpl]

'getResolvedCall' @ [32:40] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [32:56] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.<init>[ValueParameterDescriptorImpl]

'analyze' @ [32:64] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'updateName' @ [35:9] ==> private final fun updateName(changeInfo: KotlinChangeInfo, element: KtSimpleNameExpression): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage[SimpleFunctionDescriptorImpl]

'changeInfo' @ [35:20] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.processUsage[ValueParameterDescriptorImpl]

'element' @ [35:32] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.processUsage[ValueParameterDescriptorImpl]

'updateReceiver' @ [36:9] ==> private final fun updateReceiver(changeInfo: KotlinChangeInfo, element: KtSimpleNameExpression): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage[SimpleFunctionDescriptorImpl]

'changeInfo' @ [36:24] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.processUsage[ValueParameterDescriptorImpl]

'element' @ [36:36] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.processUsage[ValueParameterDescriptorImpl]

'changeInfo' @ [41:13] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateName[ValueParameterDescriptorImpl]

'isNameChanged' @ [41:24] ==> public final val KotlinChangeInfo.isNameChanged: Boolean[MyPropertyDescriptor]

'element' @ [42:13] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateName[ValueParameterDescriptorImpl]

'mainReference' @ [42:21] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'handleElementRename' @ [42:35] ==> public open fun handleElementRename(newElementName: String?): PsiElement defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedSimpleFunctionDescriptor]

'changeInfo' @ [42:55] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateName[ValueParameterDescriptorImpl]

'newName' @ [42:66] ==> public final var KotlinChangeInfo.newName: String[MyPropertyDescriptor]

'changeInfo' @ [47:27] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateReceiver[ValueParameterDescriptorImpl]

'receiverParameterInfo' @ [47:38] ==> public final var receiverParameterInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'changeInfo' @ [48:27] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateReceiver[ValueParameterDescriptorImpl]

'methodDescriptor' @ [48:38] ==> public final val methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'receiver' @ [48:55] ==> public abstract val receiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'newReceiver' @ [49:13] ==> val newReceiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateReceiver[LocalVariableDescriptor]

'oldReceiver' @ [49:28] ==> val oldReceiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateReceiver[LocalVariableDescriptor]

'element' @ [51:32] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateReceiver[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelectorOrThis' @ [51:40] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'newReceiver' @ [54:13] ==> val newReceiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateReceiver[LocalVariableDescriptor]

'elementToReplace' @ [55:16] ==> val elementToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateReceiver[LocalVariableDescriptor]

'resolvedCall' @ [56:16] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage[PropertyDescriptorImpl]

'dispatchReceiver' @ [56:30] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'newReceiver' @ [58:32] ==> val newReceiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateReceiver[LocalVariableDescriptor]

'let' @ [58:45] ==> @InlineOnly public inline fun <T, R> KotlinParameterInfo.let(block: (KotlinParameterInfo) -> KtExpression): KtExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo
    <R> -> KtExpression

'KtPsiFactory' @ [59:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [59:43] ==> public final val KotlinPropertyCallUsage.project: Project[MyPropertyDescriptor]

'it' @ [60:28] ==> value-parameter it: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateReceiver.<anonymous>[ValueParameterDescriptorImpl]

'defaultValueForCall' @ [60:31] ==> public final var defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'psiFactory' @ [60:54] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateReceiver.<anonymous>[LocalVariableDescriptor]

'createExpression' @ [60:65] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [61:13] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateReceiver.<anonymous>[LocalVariableDescriptor]

'createExpressionByPattern' @ [61:24] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'receiver' @ [61:59] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateReceiver.<anonymous>[LocalVariableDescriptor]

'element' @ [61:69] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateReceiver[ValueParameterDescriptorImpl]

'element' @ [62:14] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateReceiver[ValueParameterDescriptorImpl]

'elementToReplace' @ [64:9] ==> val elementToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateReceiver[LocalVariableDescriptor]

'replace' @ [64:26] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'replacingElement' @ [64:34] ==> val replacingElement: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage.updateReceiver[LocalVariableDescriptor]

