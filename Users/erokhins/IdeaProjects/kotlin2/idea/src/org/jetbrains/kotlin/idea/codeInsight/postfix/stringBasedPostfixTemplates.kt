'StringBasedPostfixTemplate' @ [41:6] ==> public constructor StringBasedPostfixTemplate(@NotNull p0: String, @NotNull p1: String, @NotNull p2: PostfixTemplateExpressionSelector) defined in com.intellij.codeInsight.template.postfix.templates.StringBasedPostfixTemplate[JavaClassConstructorDescriptor]

'name' @ [41:33] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.codeInsight.postfix.ConstantStringBasedPostfixTemplate.<init>[ValueParameterDescriptorImpl]

'desc' @ [41:39] ==> value-parameter desc: String defined in org.jetbrains.kotlin.idea.codeInsight.postfix.ConstantStringBasedPostfixTemplate.<init>[ValueParameterDescriptorImpl]

'selector' @ [41:45] ==> value-parameter selector: PostfixTemplateExpressionSelector defined in org.jetbrains.kotlin.idea.codeInsight.postfix.ConstantStringBasedPostfixTemplate.<init>[ValueParameterDescriptorImpl]

'template' @ [42:59] ==> private final val template: String defined in org.jetbrains.kotlin.idea.codeInsight.postfix.ConstantStringBasedPostfixTemplate[PropertyDescriptorImpl]

'expr' @ [44:58] ==> value-parameter expr: PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.postfix.ConstantStringBasedPostfixTemplate.getElementToRemove[ValueParameterDescriptorImpl]

'ConstantStringBasedPostfixTemplate' @ [49:5] ==> public constructor ConstantStringBasedPostfixTemplate(name: String, desc: String, template: String, selector: PostfixTemplateExpressionSelector) defined in org.jetbrains.kotlin.idea.codeInsight.postfix.ConstantStringBasedPostfixTemplate[ClassConstructorDescriptorImpl]

'name' @ [50:9] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.codeInsight.postfix.KtForEachPostfixTemplate.<init>[ValueParameterDescriptorImpl]

'createExpressionSelectorWithComplexFilter' @ [53:9] ==> internal fun createExpressionSelectorWithComplexFilter(checkCanBeUsedAsValue: Boolean = ..., statementsOnly: Boolean = ..., predicate: ((KtExpression, BindingContext) -> Boolean)? = ...): PostfixTemplateExpressionSelector defined in org.jetbrains.kotlin.idea.codeInsight.postfix in file KtPostfixTemplateProvider.kt[SimpleFunctionDescriptorImpl]

'hasIterableType' @ [53:100] ==> private fun KtExpression.hasIterableType(bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.codeInsight.postfix in file stringBasedPostfixTemplates.kt[SimpleFunctionDescriptorImpl]

'MacroCallNode' @ [56:20] ==> public constructor MacroCallNode(@NotNull p0: Macro) defined in com.intellij.codeInsight.template.impl.MacroCallNode[JavaClassConstructorDescriptor]

'SuggestVariableNameMacro' @ [56:34] ==> public constructor SuggestVariableNameMacro() defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro[ClassConstructorDescriptorImpl]

'template' @ [57:9] ==> value-parameter template: Template defined in org.jetbrains.kotlin.idea.codeInsight.postfix.KtForEachPostfixTemplate.setVariables[ValueParameterDescriptorImpl]

'addVariable' @ [57:18] ==> public open fun addVariable(@NonNls @NotNull p0: String, p1: (Expression..Expression?), p2: (Expression..Expression?), p3: Boolean): (Variable..Variable?) defined in com.intellij.codeInsight.template.Template[JavaMethodDescriptor]

'name' @ [57:38] ==> val name: MacroCallNode defined in org.jetbrains.kotlin.idea.codeInsight.postfix.KtForEachPostfixTemplate.setVariables[LocalVariableDescriptor]

'ConstantNode' @ [57:44] ==> public constructor ConstantNode(p0: (String..String?)) defined in com.intellij.codeInsight.template.impl.ConstantNode[JavaClassConstructorDescriptor]

'getResolutionFacade' @ [62:28] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getType' @ [63:16] ==> public fun KtExpression.getType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [63:24] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.postfix.hasIterableType[ValueParameterDescriptorImpl]

'getResolutionScope' @ [64:17] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [64:36] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.postfix.hasIterableType[ValueParameterDescriptorImpl]

'resolutionFacade' @ [64:52] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.postfix.hasIterableType[LocalVariableDescriptor]

'resolutionFacade' @ [65:20] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.postfix.hasIterableType[LocalVariableDescriptor]

'ideService' @ [65:37] ==> public inline fun <reified T : Any> ResolutionFacade.ideService(): IterableTypesDetection defined in org.jetbrains.kotlin.idea.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> IterableTypesDetection

'createDetector' @ [65:74] ==> public final fun createDetector(scope: LexicalScope): IterableTypesDetector defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection[DeserializedSimpleFunctionDescriptor]

'scope' @ [65:89] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInsight.postfix.hasIterableType[LocalVariableDescriptor]

'detector' @ [66:12] ==> val detector: IterableTypesDetector defined in org.jetbrains.kotlin.idea.codeInsight.postfix.hasIterableType[LocalVariableDescriptor]

'isIterable' @ [66:21] ==> public abstract fun isIterable(type: KotlinType, loopVarType: KotlinType? = ...): Boolean defined in org.jetbrains.kotlin.idea.core.IterableTypesDetector[DeserializedSimpleFunctionDescriptor]

'type' @ [66:32] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.codeInsight.postfix.hasIterableType[LocalVariableDescriptor]

'ConstantStringBasedPostfixTemplate' @ [69:43] ==> public constructor ConstantStringBasedPostfixTemplate(name: String, desc: String, template: String, selector: PostfixTemplateExpressionSelector) defined in org.jetbrains.kotlin.idea.codeInsight.postfix.ConstantStringBasedPostfixTemplate[ClassConstructorDescriptorImpl]

'createExpressionSelector' @ [73:9] ==> internal fun createExpressionSelector(checkCanBeUsedAsValue: Boolean = ..., statementsOnly: Boolean = ..., typePredicate: ((KotlinType) -> Boolean)? = ...): PostfixTemplateExpressionSelector defined in org.jetbrains.kotlin.idea.codeInsight.postfix in file KtPostfixTemplateProvider.kt[SimpleFunctionDescriptorImpl]

'KotlinType' @ [73:73] ==> private constructor KotlinType() defined in org.jetbrains.kotlin.types.KotlinType[DeserializedClassConstructorDescriptor]

'isBoolean' @ [73:85] ==> public fun KotlinType.isBoolean(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'ConstantStringBasedPostfixTemplate' @ [76:50] ==> public constructor ConstantStringBasedPostfixTemplate(name: String, desc: String, template: String, selector: PostfixTemplateExpressionSelector) defined in org.jetbrains.kotlin.idea.codeInsight.postfix.ConstantStringBasedPostfixTemplate[ClassConstructorDescriptorImpl]

'createExpressionSelector' @ [79:9] ==> internal fun createExpressionSelector(checkCanBeUsedAsValue: Boolean = ..., statementsOnly: Boolean = ..., typePredicate: ((KotlinType) -> Boolean)? = ...): PostfixTemplateExpressionSelector defined in org.jetbrains.kotlin.idea.codeInsight.postfix in file KtPostfixTemplateProvider.kt[SimpleFunctionDescriptorImpl]

'ConstantStringBasedPostfixTemplate' @ [82:41] ==> public constructor ConstantStringBasedPostfixTemplate(name: String, desc: String, template: String, selector: PostfixTemplateExpressionSelector) defined in org.jetbrains.kotlin.idea.codeInsight.postfix.ConstantStringBasedPostfixTemplate[ClassConstructorDescriptorImpl]

'createExpressionSelector' @ [86:9] ==> internal fun createExpressionSelector(checkCanBeUsedAsValue: Boolean = ..., statementsOnly: Boolean = ..., typePredicate: ((KotlinType) -> Boolean)? = ...): PostfixTemplateExpressionSelector defined in org.jetbrains.kotlin.idea.codeInsight.postfix in file KtPostfixTemplateProvider.kt[SimpleFunctionDescriptorImpl]

'ConstantStringBasedPostfixTemplate' @ [89:43] ==> public constructor ConstantStringBasedPostfixTemplate(name: String, desc: String, template: String, selector: PostfixTemplateExpressionSelector) defined in org.jetbrains.kotlin.idea.codeInsight.postfix.ConstantStringBasedPostfixTemplate[ClassConstructorDescriptorImpl]

'createExpressionSelector' @ [93:9] ==> internal fun createExpressionSelector(checkCanBeUsedAsValue: Boolean = ..., statementsOnly: Boolean = ..., typePredicate: ((KotlinType) -> Boolean)? = ...): PostfixTemplateExpressionSelector defined in org.jetbrains.kotlin.idea.codeInsight.postfix in file KtPostfixTemplateProvider.kt[SimpleFunctionDescriptorImpl]

'ConstantStringBasedPostfixTemplate' @ [96:42] ==> public constructor ConstantStringBasedPostfixTemplate(name: String, desc: String, template: String, selector: PostfixTemplateExpressionSelector) defined in org.jetbrains.kotlin.idea.codeInsight.postfix.ConstantStringBasedPostfixTemplate[ClassConstructorDescriptorImpl]

'createExpressionSelector' @ [100:9] ==> internal fun createExpressionSelector(checkCanBeUsedAsValue: Boolean = ..., statementsOnly: Boolean = ..., typePredicate: ((KotlinType) -> Boolean)? = ...): PostfixTemplateExpressionSelector defined in org.jetbrains.kotlin.idea.codeInsight.postfix in file KtPostfixTemplateProvider.kt[SimpleFunctionDescriptorImpl]

'KotlinType' @ [100:73] ==> private constructor KotlinType() defined in org.jetbrains.kotlin.types.KotlinType[DeserializedClassConstructorDescriptor]

'isBoolean' @ [100:85] ==> public fun KotlinType.isBoolean(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

