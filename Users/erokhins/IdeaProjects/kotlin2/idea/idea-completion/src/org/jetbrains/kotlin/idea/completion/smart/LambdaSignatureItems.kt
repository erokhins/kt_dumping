'position' @ [43:21] ==> value-parameter position: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[ValueParameterDescriptorImpl]

'parent' @ [43:30] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'position' @ [44:13] ==> value-parameter position: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[ValueParameterDescriptorImpl]

'block' @ [44:25] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[LocalVariableDescriptor]

'statements' @ [44:31] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'first' @ [44:42] ==> public fun <T> List<(KtExpression..KtExpression?)>.first(): (KtExpression..KtExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'block' @ [45:31] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[LocalVariableDescriptor]

'parent' @ [45:37] ==> public final val KtBlockExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'functionLiteral' @ [46:13] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[LocalVariableDescriptor]

'arrow' @ [46:29] ==> public final val KtFunctionLiteral.arrow: PsiElement?[MyPropertyDescriptor]

'functionLiteral' @ [47:33] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[LocalVariableDescriptor]

'parent' @ [47:49] ==> public final val KtFunctionLiteral.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'ExpectedInfos' @ [49:37] ==> public constructor ExpectedInfos(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, indicesHelper: KotlinIndicesHelper?, useHeuristicSignatures: Boolean = ..., useOuterCallsExpectedTypeCount: Int = ...) defined in org.jetbrains.kotlin.idea.core.ExpectedInfos[DeserializedClassConstructorDescriptor]

'bindingContext' @ [49:51] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[ValueParameterDescriptorImpl]

'resolutionFacade' @ [49:67] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[ValueParameterDescriptorImpl]

'calculate' @ [49:91] ==> public final fun calculate(expressionWithType: KtExpression): Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.core.ExpectedInfos[DeserializedSimpleFunctionDescriptor]

'literalExpression' @ [49:101] ==> val literalExpression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[LocalVariableDescriptor]

'mapNotNull' @ [50:18] ==> public inline fun <T, R : Any> Iterable<ExpectedInfo>.mapNotNull(transform: (ExpectedInfo) -> KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo
    <R : Any> -> KotlinType

'it' @ [50:31] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection.<anonymous>[ValueParameterDescriptorImpl]

'fuzzyType' @ [50:34] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'type' @ [50:45] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'filter' @ [51:18] ==> public inline fun <T> Iterable<KotlinType>.filter(predicate: (KotlinType) -> Boolean): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'it' @ [51:27] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection.<anonymous>[ValueParameterDescriptorImpl]

'isFunctionType' @ [51:30] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'toSet' @ [52:18] ==> public fun <T> Iterable<KotlinType>.toSet(): Set<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'expectedFunctionTypes' @ [53:30] ==> val expectedFunctionTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[LocalVariableDescriptor]

'functionType' @ [54:17] ==> val functionType: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[LocalVariableDescriptor]

'getValueParameterTypesFromFunctionType' @ [54:30] ==> public fun KotlinType.getValueParameterTypesFromFunctionType(): List<TypeProjection> defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'isEmpty' @ [54:71] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'if (LambdaSignatureTemplates.explicitParameterTypesRequired(expectedFunctionTypes, functionType)) {
                collection.add(createLookupElement(functionType, LambdaSignatureTemplates.SignaturePresentation.NAMES_OR_TYPES, explicitParameterTypes = true))
            }
            else {
                collection.add(createLookupElement(functionType, LambdaSignatureTemplates.SignaturePresentation.NAMES, explicitParameterTypes = false))
                collection.add(createLookupElement(functionType, LambdaSignatureTemplates.SignaturePresentation.NAMES_AND_TYPES, explicitParameterTypes = true))
            }' @ [56:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'LambdaSignatureTemplates' @ [56:17] ==> public object LambdaSignatureTemplates defined in org.jetbrains.kotlin.idea.completion in file LambdaSignatureTemplates.kt[FakeCallableDescriptorForObject]

'explicitParameterTypesRequired' @ [56:42] ==> public final fun explicitParameterTypesRequired(expectedFunctionTypes: Set<KotlinType>, lambdaType: KotlinType): Boolean defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[SimpleFunctionDescriptorImpl]

'expectedFunctionTypes' @ [56:73] ==> val expectedFunctionTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[LocalVariableDescriptor]

'functionType' @ [56:96] ==> val functionType: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[LocalVariableDescriptor]

'collection' @ [57:17] ==> value-parameter collection: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[ValueParameterDescriptorImpl]

'add' @ [57:28] ==> public abstract fun add(element: LookupElement): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'createLookupElement' @ [57:32] ==> private final fun createLookupElement(functionType: KotlinType, signaturePresentation: LambdaSignatureTemplates.SignaturePresentation, explicitParameterTypes: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems[SimpleFunctionDescriptorImpl]

'functionType' @ [57:52] ==> val functionType: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[LocalVariableDescriptor]

'NAMES_OR_TYPES' @ [57:113] ==> enum entry NAMES_OR_TYPES defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.SignaturePresentation[FakeCallableDescriptorForObject]

'collection' @ [60:17] ==> value-parameter collection: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[ValueParameterDescriptorImpl]

'add' @ [60:28] ==> public abstract fun add(element: LookupElement): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'createLookupElement' @ [60:32] ==> private final fun createLookupElement(functionType: KotlinType, signaturePresentation: LambdaSignatureTemplates.SignaturePresentation, explicitParameterTypes: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems[SimpleFunctionDescriptorImpl]

'functionType' @ [60:52] ==> val functionType: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[LocalVariableDescriptor]

'NAMES' @ [60:113] ==> enum entry NAMES defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.SignaturePresentation[FakeCallableDescriptorForObject]

'collection' @ [61:17] ==> value-parameter collection: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[ValueParameterDescriptorImpl]

'add' @ [61:28] ==> public abstract fun add(element: LookupElement): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'createLookupElement' @ [61:32] ==> private final fun createLookupElement(functionType: KotlinType, signaturePresentation: LambdaSignatureTemplates.SignaturePresentation, explicitParameterTypes: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems[SimpleFunctionDescriptorImpl]

'functionType' @ [61:52] ==> val functionType: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.addToCollection[LocalVariableDescriptor]

'NAMES_AND_TYPES' @ [61:113] ==> enum entry NAMES_AND_TYPES defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.SignaturePresentation[FakeCallableDescriptorForObject]

'LambdaSignatureTemplates' @ [71:28] ==> public object LambdaSignatureTemplates defined in org.jetbrains.kotlin.idea.completion in file LambdaSignatureTemplates.kt[FakeCallableDescriptorForObject]

'signaturePresentation' @ [71:53] ==> public final fun signaturePresentation(lambdaType: KotlinType, presentationKind: LambdaSignatureTemplates.SignaturePresentation): String defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[SimpleFunctionDescriptorImpl]

'functionType' @ [71:75] ==> value-parameter functionType: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.createLookupElement[ValueParameterDescriptorImpl]

'signaturePresentation' @ [71:89] ==> value-parameter signaturePresentation: LambdaSignatureTemplates.SignaturePresentation defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.createLookupElement[ValueParameterDescriptorImpl]

'if (explicitParameterTypes)
            SmartCompletionItemPriority.LAMBDA_SIGNATURE_EXPLICIT_PARAMETER_TYPES
        else
            SmartCompletionItemPriority.LAMBDA_SIGNATURE' @ [72:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SmartCompletionItemPriority, elseBranch: SmartCompletionItemPriority): SmartCompletionItemPriority[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SmartCompletionItemPriority

'explicitParameterTypes' @ [72:28] ==> value-parameter explicitParameterTypes: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.createLookupElement[ValueParameterDescriptorImpl]

'LAMBDA_SIGNATURE_EXPLICIT_PARAMETER_TYPES' @ [73:41] ==> enum entry LAMBDA_SIGNATURE_EXPLICIT_PARAMETER_TYPES defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'LAMBDA_SIGNATURE' @ [75:41] ==> enum entry LAMBDA_SIGNATURE defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'create' @ [76:37] ==> @NotNull public open fun create(@NotNull p0: String): LookupElementBuilder defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'lookupString' @ [76:44] ==> val lookupString: String defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.createLookupElement[LocalVariableDescriptor]

'withInsertHandler' @ [77:18] ==> @Contract public final fun withInsertHandler(@Nullable p0: (((InsertionContext..InsertionContext?), (LookupElement..LookupElement?)) -> Unit)?): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[MyFunctionDescriptor]

'context' @ [78:53] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.createLookupElement.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [78:61] ==> public final val InsertionContext.startOffset: Int[MyPropertyDescriptor]

'context' @ [80:40] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.createLookupElement.<anonymous>[ValueParameterDescriptorImpl]

'document' @ [80:48] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'replaceString' @ [80:57] ==> public abstract fun replaceString(p0: Int, p1: Int, @NotNull p2: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'offset' @ [80:71] ==> val offset: Int defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.createLookupElement.<anonymous>[LocalVariableDescriptor]

'context' @ [80:79] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.createLookupElement.<anonymous>[ValueParameterDescriptorImpl]

'tailOffset' @ [80:87] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'placeholder' @ [80:99] ==> val placeholder: String defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.createLookupElement.<anonymous>[LocalVariableDescriptor]

'LambdaSignatureTemplates' @ [81:40] ==> public object LambdaSignatureTemplates defined in org.jetbrains.kotlin.idea.completion in file LambdaSignatureTemplates.kt[FakeCallableDescriptorForObject]

'insertTemplate' @ [81:65] ==> public final fun insertTemplate(context: InsertionContext, placeholderRange: TextRange, lambdaType: KotlinType, explicitParameterTypes: Boolean, signatureOnly: Boolean): Unit defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[SimpleFunctionDescriptorImpl]

'context' @ [81:80] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.createLookupElement.<anonymous>[ValueParameterDescriptorImpl]

'TextRange' @ [81:89] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'offset' @ [81:99] ==> val offset: Int defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.createLookupElement.<anonymous>[LocalVariableDescriptor]

'offset' @ [81:107] ==> val offset: Int defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.createLookupElement.<anonymous>[LocalVariableDescriptor]

'placeholder' @ [81:116] ==> val placeholder: String defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.createLookupElement.<anonymous>[LocalVariableDescriptor]

'length' @ [81:128] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'functionType' @ [81:137] ==> value-parameter functionType: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.createLookupElement[ValueParameterDescriptorImpl]

'explicitParameterTypes' @ [81:151] ==> value-parameter explicitParameterTypes: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.createLookupElement[ValueParameterDescriptorImpl]

'suppressAutoInsertion' @ [83:18] ==> public fun LookupElement.suppressAutoInsertion(): LookupElement defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'assignSmartCompletionPriority' @ [84:18] ==> public fun LookupElement.assignSmartCompletionPriority(priority: SmartCompletionItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'priority' @ [84:48] ==> val priority: SmartCompletionItemPriority defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems.createLookupElement[LocalVariableDescriptor]

