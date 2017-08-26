'getInstance' @ [56:49] ==> public open fun getInstance(): (CommandProcessor..CommandProcessor?) defined in com.intellij.openapi.command.CommandProcessor[JavaMethodDescriptor]

'commandProcessor' @ [57:27] ==> val commandProcessor: (CommandProcessor..CommandProcessor?) defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[LocalVariableDescriptor]

'currentCommandName' @ [57:44] ==> public final var CommandProcessor.currentCommandName: String?[MyPropertyDescriptor]

'commandProcessor' @ [58:30] ==> val commandProcessor: (CommandProcessor..CommandProcessor?) defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[LocalVariableDescriptor]

'currentCommandGroupId' @ [58:47] ==> public final var CommandProcessor.currentCommandGroupId: Any?[MyPropertyDescriptor]

'context' @ [60:27] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[ValueParameterDescriptorImpl]

'document' @ [60:35] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'createRangeMarker' @ [60:44] ==> @NotNull public open fun createRangeMarker(@NotNull p0: TextRange): RangeMarker defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'placeholderRange' @ [60:62] ==> value-parameter placeholderRange: TextRange defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[ValueParameterDescriptorImpl]

'context' @ [62:9] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[ValueParameterDescriptorImpl]

'setLaterRunnable' @ [62:17] ==> public final fun setLaterRunnable(@Nullable p0: (() -> Unit)?): Unit defined in com.intellij.codeInsight.completion.InsertionContext[MyFunctionDescriptor]

'context' @ [63:13] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[ValueParameterDescriptorImpl]

'project' @ [63:21] ==> public final val InsertionContext.project: (Project..Project?)[MyPropertyDescriptor]

'executeWriteCommand' @ [63:29] ==> public fun <T> Project.executeWriteCommand(name: String, groupId: Any? = ..., command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'commandName' @ [63:49] ==> val commandName: String defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[LocalVariableDescriptor]

'commandGroupId' @ [63:72] ==> val commandGroupId: Any? defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[LocalVariableDescriptor]

'rangeMarker' @ [65:25] ==> val rangeMarker: RangeMarker defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[LocalVariableDescriptor]

'isValid' @ [65:37] ==> public final val RangeMarker.isValid: Boolean[MyPropertyDescriptor]

'rangeMarker' @ [66:43] ==> val rangeMarker: RangeMarker defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[LocalVariableDescriptor]

'startOffset' @ [66:55] ==> public final val RangeMarker.startOffset: Int[MyPropertyDescriptor]

'context' @ [67:25] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[ValueParameterDescriptorImpl]

'document' @ [67:33] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'deleteString' @ [67:42] ==> public abstract fun deleteString(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'startOffset' @ [67:55] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate.<anonymous>.<anonymous>[LocalVariableDescriptor]

'rangeMarker' @ [67:68] ==> val rangeMarker: RangeMarker defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[LocalVariableDescriptor]

'endOffset' @ [67:80] ==> public final val RangeMarker.endOffset: Int[MyPropertyDescriptor]

'signatureOnly' @ [69:29] ==> value-parameter signatureOnly: Boolean defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[ValueParameterDescriptorImpl]

'context' @ [70:46] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[ValueParameterDescriptorImpl]

'document' @ [70:54] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'charsSequence' @ [70:63] ==> public final val Document.charsSequence: CharSequence[MyPropertyDescriptor]

'isCharAt' @ [70:77] ==> public fun CharSequence.isCharAt(offset: Int, c: Char): Boolean defined in org.jetbrains.kotlin.idea.completion.handlers in file handlerUtils.kt[SimpleFunctionDescriptorImpl]

'startOffset' @ [70:86] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate.<anonymous>.<anonymous>[LocalVariableDescriptor]

'!' @ [71:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'spaceAhead' @ [71:34] ==> val spaceAhead: Boolean defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate.<anonymous>.<anonymous>[LocalVariableDescriptor]

'context' @ [72:33] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[ValueParameterDescriptorImpl]

'document' @ [72:41] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'insertString' @ [72:50] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'startOffset' @ [72:63] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate.<anonymous>.<anonymous>[LocalVariableDescriptor]

'context' @ [76:25] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[ValueParameterDescriptorImpl]

'editor' @ [76:33] ==> public final val InsertionContext.editor: Editor[MyPropertyDescriptor]

'caretModel' @ [76:40] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [76:51] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'startOffset' @ [76:64] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate.<anonymous>.<anonymous>[LocalVariableDescriptor]

'buildTemplate' @ [77:40] ==> private final fun buildTemplate(lambdaType: KotlinType, signatureOnly: Boolean, explicitParameterTypes: Boolean, project: Project): Template defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[SimpleFunctionDescriptorImpl]

'lambdaType' @ [77:54] ==> value-parameter lambdaType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[ValueParameterDescriptorImpl]

'signatureOnly' @ [77:66] ==> value-parameter signatureOnly: Boolean defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[ValueParameterDescriptorImpl]

'explicitParameterTypes' @ [77:81] ==> value-parameter explicitParameterTypes: Boolean defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[ValueParameterDescriptorImpl]

'context' @ [77:105] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[ValueParameterDescriptorImpl]

'project' @ [77:113] ==> public final val InsertionContext.project: (Project..Project?)[MyPropertyDescriptor]

'getInstance' @ [78:41] ==> public open fun getInstance(p0: (Project..Project?)): (TemplateManager..TemplateManager?) defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'context' @ [78:53] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[ValueParameterDescriptorImpl]

'project' @ [78:61] ==> public final val InsertionContext.project: (Project..Project?)[MyPropertyDescriptor]

'startTemplate' @ [78:70] ==> public abstract fun startTemplate(@NotNull p0: Editor, @NotNull p1: Template): Unit defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'context' @ [78:84] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[ValueParameterDescriptorImpl]

'editor' @ [78:92] ==> public final val InsertionContext.editor: Editor[MyPropertyDescriptor]

'template' @ [78:100] ==> val template: Template defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate.<anonymous>.<anonymous>[LocalVariableDescriptor]

'rangeMarker' @ [82:21] ==> val rangeMarker: RangeMarker defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.insertTemplate[LocalVariableDescriptor]

'dispose' @ [82:33] ==> public abstract fun dispose(): Unit defined in com.intellij.openapi.editor.RangeMarker[JavaMethodDescriptor]

'+' @ [97:16] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'signaturePresentation' @ [97:23] ==> public final fun signaturePresentation(lambdaType: KotlinType, presentationKind: LambdaSignatureTemplates.SignaturePresentation): String defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[SimpleFunctionDescriptorImpl]

'lambdaType' @ [97:45] ==> value-parameter lambdaType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.lambdaPresentation[ValueParameterDescriptorImpl]

'presentationKind' @ [97:57] ==> value-parameter presentationKind: LambdaSignatureTemplates.SignaturePresentation defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.lambdaPresentation[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [101:50] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [101:73] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [101:106] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [101:117] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.signaturePresentation.typePresentation[ValueParameterDescriptorImpl]

'parameterType' @ [104:24] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.signaturePresentation.parameterPresentation[ValueParameterDescriptorImpl]

'extractParameterNameFromFunctionTypeArgument' @ [104:38] ==> public fun KotlinType.extractParameterNameFromFunctionTypeArgument(): Name? defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'render' @ [104:86] ==> public fun Name.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'when (presentationKind) {
                SignaturePresentation.NAMES -> name ?: nameSuggestion(parameterType)
                SignaturePresentation.NAMES_OR_TYPES -> name ?: typePresentation(parameterType)
                SignaturePresentation.NAMES_AND_TYPES -> "${name ?: nameSuggestion(parameterType)}: ${typePresentation(parameterType)}"
            }' @ [105:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'presentationKind' @ [105:26] ==> value-parameter presentationKind: LambdaSignatureTemplates.SignaturePresentation defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.signaturePresentation[ValueParameterDescriptorImpl]

'NAMES' @ [106:39] ==> enum entry NAMES defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.SignaturePresentation[FakeCallableDescriptorForObject]

'name' @ [106:48] ==> val name: String? defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.signaturePresentation.parameterPresentation[LocalVariableDescriptor]

'nameSuggestion' @ [106:56] ==> private final fun nameSuggestion(parameterType: KotlinType): String defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[SimpleFunctionDescriptorImpl]

'parameterType' @ [106:71] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.signaturePresentation.parameterPresentation[ValueParameterDescriptorImpl]

'NAMES_OR_TYPES' @ [107:39] ==> enum entry NAMES_OR_TYPES defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.SignaturePresentation[FakeCallableDescriptorForObject]

'name' @ [107:57] ==> val name: String? defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.signaturePresentation.parameterPresentation[LocalVariableDescriptor]

'typePresentation' @ [107:65] ==> local final fun typePresentation(type: KotlinType): String defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.signaturePresentation[SimpleFunctionDescriptorImpl]

'parameterType' @ [107:82] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.signaturePresentation.parameterPresentation[ValueParameterDescriptorImpl]

'NAMES_AND_TYPES' @ [108:39] ==> enum entry NAMES_AND_TYPES defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.SignaturePresentation[FakeCallableDescriptorForObject]

'name' @ [108:61] ==> val name: String? defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.signaturePresentation.parameterPresentation[LocalVariableDescriptor]

'nameSuggestion' @ [108:69] ==> private final fun nameSuggestion(parameterType: KotlinType): String defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[SimpleFunctionDescriptorImpl]

'parameterType' @ [108:84] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.signaturePresentation.parameterPresentation[ValueParameterDescriptorImpl]

'typePresentation' @ [108:103] ==> local final fun typePresentation(type: KotlinType): String defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.signaturePresentation[SimpleFunctionDescriptorImpl]

'parameterType' @ [108:120] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.signaturePresentation.parameterPresentation[ValueParameterDescriptorImpl]

'functionParameterTypes' @ [112:16] ==> private final fun functionParameterTypes(functionType: KotlinType): List<KotlinType> defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[SimpleFunctionDescriptorImpl]

'lambdaType' @ [112:39] ==> value-parameter lambdaType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.signaturePresentation[ValueParameterDescriptorImpl]

'joinToString' @ [112:51] ==> public fun <T> Iterable<KotlinType>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((KotlinType) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'parameterPresentation' @ [112:84] ==> local final fun parameterPresentation(parameterType: KotlinType): String defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.signaturePresentation[SimpleFunctionDescriptorImpl]

'getInstance' @ [116:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'file' @ [116:40] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[ValueParameterDescriptorImpl]

'project' @ [116:45] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'commitAllDocuments' @ [116:54] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'?:' @ [117:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'findElementOfClassAtRange' @ [117:38] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> findElementOfClassAtRange(@NotNull p0: PsiFile, p1: Int, p2: Int, @NotNull p3: Class<(KtExpression..KtExpression?)>): KtExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'file' @ [117:64] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[ValueParameterDescriptorImpl]

'placeholderRange' @ [117:70] ==> value-parameter placeholderRange: TextRange defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[ValueParameterDescriptorImpl]

'startOffset' @ [117:87] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'placeholderRange' @ [117:100] ==> value-parameter placeholderRange: TextRange defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[ValueParameterDescriptorImpl]

'endOffset' @ [117:117] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'java' @ [117:148] ==> public val <T> KClass<KtExpression>.java: Class<KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'file' @ [120:32] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [120:37] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [121:30] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[LocalVariableDescriptor]

'analyze' @ [121:47] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'expression' @ [121:55] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[LocalVariableDescriptor]

'PARTIAL' @ [121:83] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'ExpectedInfos' @ [122:29] ==> public constructor ExpectedInfos(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, indicesHelper: KotlinIndicesHelper?, useHeuristicSignatures: Boolean = ..., useOuterCallsExpectedTypeCount: Int = ...) defined in org.jetbrains.kotlin.idea.core.ExpectedInfos[DeserializedClassConstructorDescriptor]

'bindingContext' @ [122:43] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[LocalVariableDescriptor]

'resolutionFacade' @ [122:59] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[LocalVariableDescriptor]

'calculate' @ [122:131] ==> public final fun calculate(expressionWithType: KtExpression): Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.core.ExpectedInfos[DeserializedSimpleFunctionDescriptor]

'expression' @ [122:141] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[LocalVariableDescriptor]

'expectedInfos' @ [123:29] ==> val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[LocalVariableDescriptor]

'mapNotNull' @ [124:18] ==> public inline fun <T, R : Any> Iterable<ExpectedInfo>.mapNotNull(transform: (ExpectedInfo) -> KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo
    <R : Any> -> KotlinType

'it' @ [124:31] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired.<anonymous>[ValueParameterDescriptorImpl]

'fuzzyType' @ [124:34] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'type' @ [124:45] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'filter' @ [125:18] ==> public inline fun <T> Iterable<KotlinType>.filter(predicate: (KotlinType) -> Boolean): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'KotlinType' @ [125:25] ==> private constructor KotlinType() defined in org.jetbrains.kotlin.types.KotlinType[DeserializedClassConstructorDescriptor]

'isFunctionType' @ [125:37] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'toSet' @ [126:18] ==> public fun <T> Iterable<KotlinType>.toSet(): Set<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'explicitParameterTypesRequired' @ [127:16] ==> public final fun explicitParameterTypesRequired(expectedFunctionTypes: Set<KotlinType>, lambdaType: KotlinType): Boolean defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[SimpleFunctionDescriptorImpl]

'functionTypes' @ [127:47] ==> val functionTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[LocalVariableDescriptor]

'lambdaType' @ [127:62] ==> value-parameter lambdaType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[ValueParameterDescriptorImpl]

'expectedFunctionTypes' @ [131:13] ==> value-parameter expectedFunctionTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[ValueParameterDescriptorImpl]

'size' @ [131:35] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'getValueParametersCountFromFunctionType' @ [132:36] ==> public fun getValueParametersCountFromFunctionType(type: KotlinType): Int defined in org.jetbrains.kotlin.resolve.calls.util[DeserializedSimpleFunctionDescriptor]

'lambdaType' @ [132:76] ==> value-parameter lambdaType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[ValueParameterDescriptorImpl]

'expectedFunctionTypes' @ [133:16] ==> value-parameter expectedFunctionTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[ValueParameterDescriptorImpl]

'filter' @ [133:38] ==> public inline fun <T> Iterable<KotlinType>.filter(predicate: (KotlinType) -> Boolean): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'getValueParametersCountFromFunctionType' @ [133:47] ==> public fun getValueParametersCountFromFunctionType(type: KotlinType): Int defined in org.jetbrains.kotlin.resolve.calls.util[DeserializedSimpleFunctionDescriptor]

'it' @ [133:87] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired.<anonymous>[ValueParameterDescriptorImpl]

'lambdaParameterCount' @ [133:94] ==> val lambdaParameterCount: Int defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.explicitParameterTypesRequired[LocalVariableDescriptor]

'size' @ [133:117] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'IdeDescriptorRenderers' @ [136:33] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [136:56] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'withOptions' @ [136:68] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'modifiers' @ [137:9] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'ANNOTATIONS' @ [137:49] ==> enum entry ANNOTATIONS defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier[FakeCallableDescriptorForObject]

'functionParameterTypes' @ [146:30] ==> private final fun functionParameterTypes(functionType: KotlinType): List<KotlinType> defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[SimpleFunctionDescriptorImpl]

'lambdaType' @ [146:53] ==> value-parameter lambdaType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[ValueParameterDescriptorImpl]

'getInstance' @ [148:39] ==> public open fun getInstance(p0: (Project..Project?)): (TemplateManager..TemplateManager?) defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'project' @ [148:51] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[ValueParameterDescriptorImpl]

'manager' @ [150:24] ==> val manager: (TemplateManager..TemplateManager?) defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'createTemplate' @ [150:32] ==> public abstract fun createTemplate(@NotNull p0: String, p1: (String..String?)): (Template..Template?) defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'template' @ [151:9] ==> val template: (Template..Template?) defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'isToShortenLongNames' @ [151:18] ==> public final var Template.isToShortenLongNames: Boolean[MyPropertyDescriptor]

'!' @ [153:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'signatureOnly' @ [153:14] ==> value-parameter signatureOnly: Boolean defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[ValueParameterDescriptorImpl]

'template' @ [154:13] ==> val template: (Template..Template?) defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'addTextSegment' @ [154:22] ==> public abstract fun addTextSegment(@NotNull p0: String): Unit defined in com.intellij.codeInsight.template.Template[JavaMethodDescriptor]

'component1' @ [157:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [157:18] ==> public final operator fun component2(): KotlinType defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'parameterTypes' @ [157:36] ==> val parameterTypes: List<KotlinType> defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'withIndex' @ [157:51] ==> public fun <T> Iterable<KotlinType>.withIndex(): Iterable<IndexedValue<KotlinType>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'i' @ [158:17] ==> val i: Int defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'template' @ [159:17] ==> val template: (Template..Template?) defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'addTextSegment' @ [159:26] ==> public abstract fun addTextSegment(@NotNull p0: String): Unit defined in com.intellij.codeInsight.template.Template[JavaMethodDescriptor]

'parameterType' @ [162:33] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'extractParameterNameFromFunctionTypeArgument' @ [162:47] ==> public fun KotlinType.extractParameterNameFromFunctionTypeArgument(): Name? defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'render' @ [162:95] ==> public fun Name.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'if (parameterName != null) {
                object : Expression() {
                    override fun calculateResult(context: ExpressionContext?) = TextResult(parameterName)
                    override fun calculateQuickResult(context: ExpressionContext?): Result? = TextResult(parameterName)
                    override fun calculateLookupItems(context: ExpressionContext?) = emptyArray<LookupElement>()
                }
            }
            else {
                val nameSuggestions = nameSuggestions(parameterType)
                object : Expression() {
                    override fun calculateResult(context: ExpressionContext?) = TextResult(nameSuggestions[0])
                    override fun calculateQuickResult(context: ExpressionContext?): Result? = null
                    override fun calculateLookupItems(context: ExpressionContext?)
                            = nameSuggestions.map { LookupElementBuilder.create(it) }.toTypedArray()
                }
            }' @ [163:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Expression, elseBranch: Expression): Expression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Expression

'parameterName' @ [163:39] ==> val parameterName: String? defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'Expression' @ [164:26] ==> public constructor Expression() defined in com.intellij.codeInsight.template.Expression[JavaClassConstructorDescriptor]

'TextResult' @ [165:81] ==> public constructor TextResult(@NotNull p0: String) defined in com.intellij.codeInsight.template.TextResult[JavaClassConstructorDescriptor]

'parameterName' @ [165:92] ==> val parameterName: String? defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'TextResult' @ [166:95] ==> public constructor TextResult(@NotNull p0: String) defined in com.intellij.codeInsight.template.TextResult[JavaClassConstructorDescriptor]

'parameterName' @ [166:106] ==> val parameterName: String? defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'emptyArray' @ [167:86] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<LookupElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> LookupElement

'nameSuggestions' @ [171:39] ==> private final fun nameSuggestions(parameterType: KotlinType): List<String> defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[SimpleFunctionDescriptorImpl]

'parameterType' @ [171:55] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'Expression' @ [172:26] ==> public constructor Expression() defined in com.intellij.codeInsight.template.Expression[JavaClassConstructorDescriptor]

'TextResult' @ [173:81] ==> public constructor TextResult(@NotNull p0: String) defined in com.intellij.codeInsight.template.TextResult[JavaClassConstructorDescriptor]

'nameSuggestions' @ [173:92] ==> val nameSuggestions: List<String> defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'nameSuggestions' @ [176:31] ==> val nameSuggestions: List<String> defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'map' @ [176:47] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> LookupElementBuilder): List<LookupElementBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> LookupElementBuilder

'create' @ [176:74] ==> @NotNull public open fun create(@NotNull p0: String): LookupElementBuilder defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'it' @ [176:81] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate.<no name provided>.calculateLookupItems.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [176:87] ==> public inline fun <reified T> Collection<LookupElementBuilder>.toTypedArray(): Array<LookupElementBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> LookupElementBuilder

'template' @ [179:13] ==> val template: (Template..Template?) defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'addVariable' @ [179:22] ==> public abstract fun addVariable(p0: (Expression..Expression?), p1: Boolean): (Variable..Variable?) defined in com.intellij.codeInsight.template.Template[JavaMethodDescriptor]

'nameExpression' @ [179:34] ==> val nameExpression: Expression defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'explicitParameterTypes' @ [181:17] ==> value-parameter explicitParameterTypes: Boolean defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[ValueParameterDescriptorImpl]

'template' @ [182:17] ==> val template: (Template..Template?) defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'addTextSegment' @ [182:26] ==> public abstract fun addTextSegment(@NotNull p0: String): Unit defined in com.intellij.codeInsight.template.Template[JavaMethodDescriptor]

'+' @ [182:41] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'TYPE_RENDERER' @ [182:48] ==> private final val TYPE_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[PropertyDescriptorImpl]

'renderType' @ [182:62] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'parameterType' @ [182:73] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'template' @ [186:9] ==> val template: (Template..Template?) defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'addTextSegment' @ [186:18] ==> public abstract fun addTextSegment(@NotNull p0: String): Unit defined in com.intellij.codeInsight.template.Template[JavaMethodDescriptor]

'template' @ [187:9] ==> val template: (Template..Template?) defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'addEndVariable' @ [187:18] ==> public abstract fun addEndVariable(): Unit defined in com.intellij.codeInsight.template.Template[JavaMethodDescriptor]

'!' @ [189:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'signatureOnly' @ [189:14] ==> value-parameter signatureOnly: Boolean defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[ValueParameterDescriptorImpl]

'template' @ [190:13] ==> val template: (Template..Template?) defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'addTextSegment' @ [190:22] ==> public abstract fun addTextSegment(@NotNull p0: String): Unit defined in com.intellij.codeInsight.template.Template[JavaMethodDescriptor]

'template' @ [193:16] ==> val template: (Template..Template?) defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.buildTemplate[LocalVariableDescriptor]

'KotlinNameSuggester' @ [196:62] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesByType' @ [196:82] ==> public final fun suggestNamesByType(type: KotlinType, validator: (String) -> Boolean, defaultName: String? = ...): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'parameterType' @ [196:101] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.nameSuggestions[ValueParameterDescriptorImpl]

'nameSuggestions' @ [197:61] ==> private final fun nameSuggestions(parameterType: KotlinType): List<String> defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[SimpleFunctionDescriptorImpl]

'parameterType' @ [197:77] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.nameSuggestion[ValueParameterDescriptorImpl]

'functionType' @ [200:16] ==> value-parameter functionType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.functionParameterTypes[ValueParameterDescriptorImpl]

'getValueParameterTypesFromFunctionType' @ [200:29] ==> public fun KotlinType.getValueParameterTypesFromFunctionType(): List<TypeProjection> defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'map' @ [200:70] ==> public inline fun <T, R> Iterable<TypeProjection>.map(transform: (TypeProjection) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> KotlinType

'getType' @ [200:90] ==> @NotNull public abstract fun getType(): KotlinType defined in org.jetbrains.kotlin.types.TypeProjection[JavaMethodDescriptor]

