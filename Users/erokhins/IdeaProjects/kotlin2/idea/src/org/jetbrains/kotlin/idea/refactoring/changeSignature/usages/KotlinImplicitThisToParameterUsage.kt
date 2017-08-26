'KotlinUsageInfo<KtElement>' @ [32:69] ==> public constructor KotlinUsageInfo<T : PsiElement>(element: KtElement) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinUsageInfo[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtElement

'callElement' @ [32:96] ==> value-parameter callElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitReceiverUsage.<init>[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [40:32] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'element' @ [40:45] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitReceiverUsage.processUsage[ValueParameterDescriptorImpl]

'project' @ [40:53] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'createExpression' @ [40:62] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'getNewReceiverText' @ [41:20] ==> protected abstract fun getNewReceiverText(): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitReceiverUsage[SimpleFunctionDescriptorImpl]

'element' @ [41:44] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitReceiverUsage.processUsage[ValueParameterDescriptorImpl]

'text' @ [41:52] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'processReplacedElement' @ [43:9] ==> protected open fun processReplacedElement(element: KtElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitReceiverUsage[SimpleFunctionDescriptorImpl]

'element' @ [43:32] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitReceiverUsage.processUsage[ValueParameterDescriptorImpl]

'replace' @ [43:40] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'newQualifiedCall' @ [43:48] ==> val newQualifiedCall: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitReceiverUsage.processUsage[LocalVariableDescriptor]

'KotlinImplicitReceiverUsage' @ [52:4] ==> public constructor KotlinImplicitReceiverUsage(callElement: KtElement) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitReceiverUsage[ClassConstructorDescriptorImpl]

'callElement' @ [52:32] ==> value-parameter callElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitThisToParameterUsage.<init>[ValueParameterDescriptorImpl]

'parameterInfo' @ [53:49] ==> public final val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitThisToParameterUsage[PropertyDescriptorImpl]

'getInheritedName' @ [53:63] ==> public final fun getInheritedName(inheritedCallable: KotlinCallableDefinitionUsage<*>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[SimpleFunctionDescriptorImpl]

'containingCallable' @ [53:80] ==> public final val containingCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitThisToParameterUsage[PropertyDescriptorImpl]

'element' @ [56:9] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitThisToParameterUsage.processReplacedElement[ValueParameterDescriptorImpl]

'addToShorteningWaitSet' @ [56:17] ==> public fun KtElement.addToShorteningWaitSet(options: ShortenReferences.Options = ...): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'Options' @ [56:40] ==> public constructor Options(removeThisLabels: Boolean = ..., removeThis: Boolean = ..., removeExplicitCompanion: Boolean = ...) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options[DeserializedClassConstructorDescriptor]

'KotlinImplicitReceiverUsage' @ [63:4] ==> public constructor KotlinImplicitReceiverUsage(callElement: KtElement) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitReceiverUsage[ClassConstructorDescriptorImpl]

'callElement' @ [63:32] ==> value-parameter callElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitThisUsage.<init>[ValueParameterDescriptorImpl]

'explicateReceiverOf' @ [64:41] ==> public fun explicateReceiverOf(descriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages in file KotlinImplicitThisToParameterUsage.kt[SimpleFunctionDescriptorImpl]

'targetDescriptor' @ [64:61] ==> public final val targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitThisUsage[PropertyDescriptorImpl]

'element' @ [67:9] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitThisUsage.processReplacedElement[ValueParameterDescriptorImpl]

'addToShorteningWaitSet' @ [67:17] ==> public fun KtElement.addToShorteningWaitSet(options: ShortenReferences.Options = ...): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'Options' @ [67:40] ==> public constructor Options(removeThisLabels: Boolean = ..., removeThis: Boolean = ..., removeExplicitCompanion: Boolean = ...) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options[DeserializedClassConstructorDescriptor]

'descriptor' @ [72:16] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.explicateReceiverOf[ValueParameterDescriptorImpl]

'name' @ [72:27] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'when {
        name.isSpecial -> "this"
        DescriptorUtils.isCompanionObject(descriptor) -> IdeDescriptorRenderers.SOURCE_CODE.renderClassifierName(descriptor as ClassifierDescriptor)
        else -> "this@${name.asString()}"
    }' @ [73:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'name' @ [74:9] ==> val name: Name defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.explicateReceiverOf[LocalVariableDescriptor]

'isSpecial' @ [74:14] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'isCompanionObject' @ [75:25] ==> public open fun isCompanionObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [75:43] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.explicateReceiverOf[ValueParameterDescriptorImpl]

'SOURCE_CODE' @ [75:81] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderClassifierName' @ [75:93] ==> public abstract fun renderClassifierName(klass: ClassifierDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [75:114] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.explicateReceiverOf[ValueParameterDescriptorImpl]

'name' @ [76:25] ==> val name: Name defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.explicateReceiverOf[LocalVariableDescriptor]

'asString' @ [76:30] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

