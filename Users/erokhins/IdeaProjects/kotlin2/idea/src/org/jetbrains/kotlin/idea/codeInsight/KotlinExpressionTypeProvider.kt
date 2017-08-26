'ExpressionTypeProvider<KtExpression>' @ [42:38] ==> public constructor ExpressionTypeProvider<T : (PsiElement..PsiElement?)>() defined in com.intellij.lang.ExpressionTypeProvider[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtExpression

'DescriptorRenderer' @ [43:32] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'COMPACT_WITH_SHORT_TYPES' @ [43:51] ==> @field:JvmField public final val COMPACT_WITH_SHORT_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'withOptions' @ [43:76] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'textFormat' @ [44:9] ==> public abstract var textFormat: RenderingFormat defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'HTML' @ [44:38] ==> enum entry HTML defined in org.jetbrains.kotlin.renderer.RenderingFormat[FakeCallableDescriptorForObject]

'classifierNamePolicy' @ [45:9] ==> public abstract var classifierNamePolicy: ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'isAnonymousObject' @ [47:37] ==> public open fun isAnonymousObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classifier' @ [47:55] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.typeRenderer.<anonymous>.<no name provided>.renderClassifier[ValueParameterDescriptorImpl]

'renderClassifier' @ [50:51] ==> public open fun renderClassifier(classifier: ClassifierDescriptor, renderer: DescriptorRenderer): String defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SHORT[DeserializedSimpleFunctionDescriptor]

'classifier' @ [50:68] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.typeRenderer.<anonymous>.<no name provided>.renderClassifier[ValueParameterDescriptorImpl]

'renderer' @ [50:80] ==> value-parameter renderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.typeRenderer.<anonymous>.<no name provided>.renderClassifier[ValueParameterDescriptorImpl]

'elementAt' @ [56:26] ==> value-parameter elementAt: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getExpressionsAt[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [56:36] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'filterIsInstance' @ [56:52] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<KtExpression> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtExpression

'filter' @ [56:85] ==> public fun <T> Sequence<KtExpression>.filter(predicate: (KtExpression) -> Boolean): Sequence<KtExpression> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [56:94] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getExpressionsAt.<anonymous>[ValueParameterDescriptorImpl]

'shouldShowType' @ [56:97] ==> private final fun KtExpression.shouldShowType(): Boolean defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider[SimpleFunctionDescriptorImpl]

'toList' @ [56:116] ==> public fun <T> Sequence<KtExpression>.toList(): List<KtExpression> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'elementAt' @ [57:26] ==> value-parameter elementAt: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getExpressionsAt[ValueParameterDescriptorImpl]

'containingFile' @ [57:36] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [57:52] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'let' @ [57:65] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> FileEditor?): FileEditor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> FileEditor?

'getInstance' @ [57:89] ==> public open fun getInstance(@NotNull p0: Project): (FileEditorManager..FileEditorManager?) defined in com.intellij.openapi.fileEditor.FileEditorManager[JavaMethodDescriptor]

'elementAt' @ [57:101] ==> value-parameter elementAt: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getExpressionsAt[ValueParameterDescriptorImpl]

'project' @ [57:111] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'getSelectedEditor' @ [57:120] ==> @Nullable public abstract fun getSelectedEditor(@NotNull p0: VirtualFile): FileEditor? defined in com.intellij.openapi.fileEditor.FileEditorManager[JavaMethodDescriptor]

'it' @ [57:138] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getExpressionsAt.<anonymous>[ValueParameterDescriptorImpl]

'if (fileEditor is TextEditor) {
            EditorUtil.getSelectionInAnyMode(fileEditor.editor)
        } else {
            TextRange.EMPTY_RANGE
        }' @ [58:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (TextRange..TextRange?), elseBranch: (TextRange..TextRange?)): (TextRange..TextRange?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.openapi.util.TextRange..com.intellij.openapi.util.TextRange?)

'fileEditor' @ [58:38] ==> val fileEditor: FileEditor? defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getExpressionsAt[LocalVariableDescriptor]

'getSelectionInAnyMode' @ [59:24] ==> @NotNull public open fun getSelectionInAnyMode(p0: (Editor..Editor?)): TextRange defined in com.intellij.openapi.editor.ex.util.EditorUtil[JavaMethodDescriptor]

'fileEditor' @ [59:46] ==> val fileEditor: FileEditor? defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getExpressionsAt[LocalVariableDescriptor]

'editor' @ [59:57] ==> public final val TextEditor.editor: Editor[MyPropertyDescriptor]

'EMPTY_RANGE' @ [61:23] ==> public final val EMPTY_RANGE: (TextRange..TextRange?) defined in com.intellij.openapi.util.TextRange[JavaPropertyDescriptor]

'candidates' @ [63:22] ==> val candidates: List<KtExpression> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getExpressionsAt[LocalVariableDescriptor]

'firstOrNull' @ [63:33] ==> public inline fun <T> Iterable<KtExpression>.firstOrNull(predicate: (KtExpression) -> Boolean): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'selectionTextRange' @ [63:47] ==> val selectionTextRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getExpressionsAt[LocalVariableDescriptor]

'isEmpty' @ [63:66] ==> public final val TextRange.isEmpty: Boolean[MyPropertyDescriptor]

'it' @ [63:77] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getExpressionsAt.<anonymous>[ValueParameterDescriptorImpl]

'textRange' @ [63:80] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'contains' @ [63:90] ==> public open operator fun contains(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'selectionTextRange' @ [63:99] ==> val selectionTextRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getExpressionsAt[LocalVariableDescriptor]

'emptyList' @ [63:131] ==> public fun <T> emptyList(): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'candidates' @ [64:16] ==> val candidates: List<KtExpression> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getExpressionsAt[LocalVariableDescriptor]

'filter' @ [64:27] ==> public inline fun <T> Iterable<KtExpression>.filter(predicate: (KtExpression) -> Boolean): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [64:36] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getExpressionsAt.<anonymous>[ValueParameterDescriptorImpl]

'textRange' @ [64:39] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [64:49] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'anchor' @ [64:64] ==> val anchor: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getExpressionsAt[LocalVariableDescriptor]

'textRange' @ [64:71] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [64:81] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'when (this) {
        is KtFunctionLiteral -> false
        is KtFunction -> !hasBlockBody() && !hasDeclaredReturnType()
        is KtProperty -> typeReference == null
        is KtPropertyAccessor -> false
        is KtDestructuringDeclarationEntry -> true
        is KtStatementExpression, is KtDestructuringDeclaration -> false
        is KtIfExpression, is KtWhenExpression, is KtTryExpression -> shouldShowStatementType()
        is KtLoopExpression -> false
        is KtConstantExpression -> false
        is KtThisExpression -> false
        else -> getQualifiedExpressionForSelector() == null && parent !is KtCallableReferenceExpression && !isFunctionCallee()
    }' @ [67:49] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean, entry5: Boolean, entry6: Boolean, entry7: Boolean, entry8: Boolean, entry9: Boolean, entry10: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [67:55] ==> <this> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.shouldShowType[ReceiverParameterDescriptorImpl]

'!' @ [69:26] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasBlockBody' @ [69:27] ==> public abstract fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'!' @ [69:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasDeclaredReturnType' @ [69:46] ==> public abstract fun hasDeclaredReturnType(): Boolean defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'typeReference' @ [70:26] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'shouldShowStatementType' @ [74:71] ==> private final fun KtExpression.shouldShowStatementType(): Boolean defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider[SimpleFunctionDescriptorImpl]

'getQualifiedExpressionForSelector' @ [78:17] ==> public fun KtElement.getQualifiedExpressionForSelector(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'parent' @ [78:64] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!' @ [78:108] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isFunctionCallee' @ [78:109] ==> private final fun KtExpression.isFunctionCallee(): Boolean defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider[SimpleFunctionDescriptorImpl]

'parent' @ [82:13] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [83:13] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'children' @ [83:20] ==> public final val PsiElement.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'lastOrNull' @ [83:29] ==> public fun <T> Array<out (PsiElement..PsiElement?)>.lastOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'this' @ [83:45] ==> <this> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.shouldShowStatementType[ReceiverParameterDescriptorImpl]

'analyze' @ [84:20] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [84:44] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'USED_AS_EXPRESSION' @ [84:68] ==> public final val USED_AS_EXPRESSION: (WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>..WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [84:88] ==> <this> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.shouldShowStatementType[ReceiverParameterDescriptorImpl]

'parent' @ [90:30] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callExpression' @ [91:13] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.isFunctionCallee[LocalVariableDescriptor]

'calleeExpression' @ [91:28] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'this' @ [91:48] ==> <this> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.isFunctionCallee[ReceiverParameterDescriptorImpl]

'mainReference' @ [92:16] ==> public val KtElement.mainReference: KtReference? defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolve' @ [92:31] ==> @Nullable public abstract fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtReference[JavaMethodDescriptor]

'element' @ [96:30] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getInformationHint[ValueParameterDescriptorImpl]

'analyze' @ [96:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [96:62] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'renderExpressionType' @ [98:25] ==> private final fun renderExpressionType(element: KtExpression, bindingContext: BindingContext): String defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider[SimpleFunctionDescriptorImpl]

'element' @ [98:46] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getInformationHint[ValueParameterDescriptorImpl]

'bindingContext' @ [98:55] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.getInformationHint[LocalVariableDescriptor]

'element' @ [102:13] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[ValueParameterDescriptorImpl]

'bindingContext' @ [103:30] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[ValueParameterDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [103:60] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [103:87] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[ValueParameterDescriptorImpl]

'descriptor' @ [104:17] ==> val descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[LocalVariableDescriptor]

'descriptor' @ [105:24] ==> val descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[LocalVariableDescriptor]

'returnType' @ [105:35] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'let' @ [105:47] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'typeRenderer' @ [105:53] ==> private final val typeRenderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider[PropertyDescriptorImpl]

'renderType' @ [105:66] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [105:77] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType.<anonymous>[ValueParameterDescriptorImpl]

'bindingContext' @ [109:34] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[ValueParameterDescriptorImpl]

'EXPRESSION_TYPE_INFO' @ [109:64] ==> public final val EXPRESSION_TYPE_INFO: (WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [109:86] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[ValueParameterDescriptorImpl]

'element' @ [110:30] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[ValueParameterDescriptorImpl]

'getType' @ [110:38] ==> public fun KtExpression.getType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [110:46] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[ValueParameterDescriptorImpl]

'expressionType' @ [111:22] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[LocalVariableDescriptor]

'let' @ [111:38] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'typeRenderer' @ [111:44] ==> private final val typeRenderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider[PropertyDescriptorImpl]

'renderType' @ [111:57] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [111:68] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType.<anonymous>[ValueParameterDescriptorImpl]

'DataFlowValueFactory' @ [113:29] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [113:50] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [113:70] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[ValueParameterDescriptorImpl]

'expressionType' @ [113:79] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[LocalVariableDescriptor]

'bindingContext' @ [113:95] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[ValueParameterDescriptorImpl]

'element' @ [113:111] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[ValueParameterDescriptorImpl]

'findModuleDescriptor' @ [113:119] ==> public fun KtElement.findModuleDescriptor(): ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'expressionTypeInfo' @ [114:21] ==> val expressionTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[LocalVariableDescriptor]

'dataFlowInfo' @ [114:40] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[DeserializedPropertyDescriptor]

'getStableTypes' @ [114:53] ==> public abstract fun getStableTypes(key: DataFlowValue): Set<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[DeserializedSimpleFunctionDescriptor]

'dataFlowValue' @ [114:68] ==> val dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[LocalVariableDescriptor]

'!' @ [115:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'types' @ [115:14] ==> val types: Set<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[LocalVariableDescriptor]

'isEmpty' @ [115:20] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'types' @ [116:20] ==> val types: Set<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[LocalVariableDescriptor]

'joinToString' @ [116:26] ==> public fun <T> Iterable<KotlinType>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((KotlinType) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'typeRenderer' @ [116:60] ==> private final val typeRenderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider[PropertyDescriptorImpl]

'renderType' @ [116:73] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [116:84] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [116:115] ==> val result: String defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[LocalVariableDescriptor]

'bindingContext' @ [119:25] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[ValueParameterDescriptorImpl]

'SMARTCAST' @ [119:55] ==> public final val SMARTCAST: (WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>..WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [119:66] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[ValueParameterDescriptorImpl]

'smartCast' @ [120:13] ==> val smartCast: ExplicitSmartCasts? defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[LocalVariableDescriptor]

'element' @ [120:34] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[ValueParameterDescriptorImpl]

'bindingContext' @ [121:33] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [121:63] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [121:81] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[ValueParameterDescriptorImpl]

'returnType' @ [121:115] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'declaredType' @ [122:17] ==> val declaredType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[LocalVariableDescriptor]

'result' @ [123:24] ==> val result: String defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[LocalVariableDescriptor]

'typeRenderer' @ [123:56] ==> private final val typeRenderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider[PropertyDescriptorImpl]

'renderType' @ [123:69] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'declaredType' @ [123:80] ==> val declaredType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[LocalVariableDescriptor]

'result' @ [126:16] ==> val result: String defined in org.jetbrains.kotlin.idea.codeInsight.KotlinExpressionTypeProvider.renderExpressionType[LocalVariableDescriptor]

