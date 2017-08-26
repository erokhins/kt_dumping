'autoImportReferenceAtCursor' @ [41:15] ==> public final fun autoImportReferenceAtCursor(editor: Editor, file: PsiFile, allowCaretNearRef: Boolean): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion[SimpleFunctionDescriptorImpl]

'editor' @ [41:43] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.autoImportReferenceAtCursor[ValueParameterDescriptorImpl]

'file' @ [41:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.autoImportReferenceAtCursor[ValueParameterDescriptorImpl]

'file' @ [44:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.autoImportReferenceAt[ValueParameterDescriptorImpl]

'file' @ [46:30] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.autoImportReferenceAt[ValueParameterDescriptorImpl]

'findElementAt' @ [46:35] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'offset' @ [46:49] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.autoImportReferenceAt[ValueParameterDescriptorImpl]

'parent' @ [46:58] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'nameExpression' @ [48:16] ==> val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.autoImportReferenceAt[LocalVariableDescriptor]

'autoImport' @ [48:31] ==> private final fun KtSimpleNameExpression.autoImport(editor: Editor, file: KtFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion[SimpleFunctionDescriptorImpl]

'editor' @ [48:42] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.autoImportReferenceAt[ValueParameterDescriptorImpl]

'file' @ [48:50] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.autoImportReferenceAt[ValueParameterDescriptorImpl]

'file' @ [55:17] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[ValueParameterDescriptorImpl]

'editor' @ [57:31] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[ValueParameterDescriptorImpl]

'caretModel' @ [57:38] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [57:49] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'editor' @ [58:28] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[ValueParameterDescriptorImpl]

'document' @ [58:35] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'document' @ [59:30] ==> val document: Document defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[LocalVariableDescriptor]

'getLineNumber' @ [59:39] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'caretOffset' @ [59:53] ==> val caretOffset: Int defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[LocalVariableDescriptor]

'document' @ [60:31] ==> val document: Document defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[LocalVariableDescriptor]

'getLineStartOffset' @ [60:40] ==> @Contract public abstract fun getLineStartOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'lineNumber' @ [60:59] ==> val lineNumber: Int defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[LocalVariableDescriptor]

'document' @ [61:29] ==> val document: Document defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[LocalVariableDescriptor]

'getLineEndOffset' @ [61:38] ==> @Contract public abstract fun getLineEndOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'lineNumber' @ [61:55] ==> val lineNumber: Int defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[LocalVariableDescriptor]

'file' @ [63:28] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[ValueParameterDescriptorImpl]

'elementsInRange' @ [63:33] ==> public fun PsiFile.elementsInRange(range: TextRange): List<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'TextRange' @ [63:49] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'startOffset' @ [63:59] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[LocalVariableDescriptor]

'endOffset' @ [63:72] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[LocalVariableDescriptor]

'flatMap' @ [64:22] ==> public inline fun <T, R> Iterable<PsiElement>.flatMap(transform: (PsiElement) -> Iterable<KtSimpleNameExpression>): List<KtSimpleNameExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> KtSimpleNameExpression

'it' @ [64:32] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor.<anonymous>[ValueParameterDescriptorImpl]

'collectDescendantsOfType' @ [64:35] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(noinline predicate: (KtSimpleNameExpression) -> Boolean = ...): List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'elements' @ [65:29] ==> val elements: List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[LocalVariableDescriptor]

'!' @ [66:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'allowCaretNearRef' @ [66:22] ==> value-parameter allowCaretNearRef: Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[ValueParameterDescriptorImpl]

'element' @ [66:43] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[LocalVariableDescriptor]

'endOffset' @ [66:51] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'caretOffset' @ [66:64] ==> val caretOffset: Int defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[LocalVariableDescriptor]

'element' @ [68:21] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[LocalVariableDescriptor]

'autoImport' @ [68:29] ==> private final fun KtSimpleNameExpression.autoImport(editor: Editor, file: KtFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion[SimpleFunctionDescriptorImpl]

'editor' @ [68:40] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[ValueParameterDescriptorImpl]

'file' @ [68:48] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImportReferenceAtCursor[ValueParameterDescriptorImpl]

'file' @ [77:20] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.hasUnresolvedImportWhichCanImport[ValueParameterDescriptorImpl]

'importDirectives' @ [77:25] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'any' @ [77:42] ==> public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.any(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'it' @ [78:17] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.hasUnresolvedImportWhichCanImport.<anonymous>[ValueParameterDescriptorImpl]

'targetDescriptors' @ [78:20] ==> public fun KtImportDirective.targetDescriptors(resolutionFacade: ResolutionFacade = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'isEmpty' @ [78:40] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'it' @ [78:54] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.hasUnresolvedImportWhichCanImport.<anonymous>[ValueParameterDescriptorImpl]

'isAllUnder' @ [78:57] ==> public final val KtImportDirective.isAllUnder: Boolean[MyPropertyDescriptor]

'it' @ [78:71] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.hasUnresolvedImportWhichCanImport.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [78:74] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'importedName' @ [78:86] ==> public final val importedName: Name? defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'asString' @ [78:100] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [78:114] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.hasUnresolvedImportWhichCanImport[ValueParameterDescriptorImpl]

'!' @ [83:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [83:38] ==> public open fun getInstance(): (CodeInsightSettings..CodeInsightSettings?) defined in com.intellij.codeInsight.CodeInsightSettings[JavaMethodDescriptor]

'ADD_UNAMBIGIOUS_IMPORTS_ON_THE_FLY' @ [83:52] ==> public final var ADD_UNAMBIGIOUS_IMPORTS_ON_THE_FLY: Boolean defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'!' @ [84:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canChangeFileSilently' @ [84:34] ==> public open fun canChangeFileSilently(@NotNull p0: PsiFileSystemItem): Boolean defined in com.intellij.codeInsight.daemon.impl.DaemonListeners[JavaMethodDescriptor]

'file' @ [84:56] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImport[ValueParameterDescriptorImpl]

'hasUnresolvedImportWhichCanImport' @ [85:17] ==> private final fun hasUnresolvedImportWhichCanImport(file: KtFile, name: String): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion[SimpleFunctionDescriptorImpl]

'file' @ [85:51] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImport[ValueParameterDescriptorImpl]

'getReferencedName' @ [85:57] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'analyze' @ [87:34] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [87:58] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'mainReference' @ [88:17] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolveToDescriptors' @ [88:31] ==> public open fun resolveToDescriptors(bindingContext: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [88:52] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImport[LocalVariableDescriptor]

'isNotEmpty' @ [88:68] ==> @InlineOnly public inline fun <T> Collection<DeclarationDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'ImportFix' @ [90:31] ==> public constructor ImportFix(expression: KtSimpleNameExpression) defined in org.jetbrains.kotlin.idea.quickfix.ImportFix[ClassConstructorDescriptorImpl]

'this' @ [90:41] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImport[ReceiverParameterDescriptorImpl]

'collectSuggestions' @ [90:47] ==> public final fun collectSuggestions(): Collection<FqName> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix[SimpleFunctionDescriptorImpl]

'suggestions' @ [91:17] ==> val suggestions: Collection<FqName> defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImport[LocalVariableDescriptor]

'size' @ [91:29] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'file' @ [92:31] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImport[ValueParameterDescriptorImpl]

'resolveImportReference' @ [92:36] ==> public fun KtFile.resolveImportReference(fqName: FqName): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'suggestions' @ [92:59] ==> val suggestions: Collection<FqName> defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImport[LocalVariableDescriptor]

'single' @ [92:71] ==> public fun <T> Iterable<FqName>.single(): FqName defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'descriptors' @ [95:17] ==> val descriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImport[LocalVariableDescriptor]

'any' @ [95:29] ==> public inline fun <T> Iterable<DeclarationDescriptor>.any(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [95:35] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImport.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [95:60] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImport.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [95:63] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'getInstance' @ [98:30] ==> public open fun getInstance(): (CommandProcessor..CommandProcessor?) defined in com.intellij.openapi.command.CommandProcessor[JavaMethodDescriptor]

'runUndoTransparentAction' @ [98:44] ==> public final fun runUndoTransparentAction(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.command.CommandProcessor[MyFunctionDescriptor]

'result' @ [99:17] ==> var result: Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImport[LocalVariableDescriptor]

'createSingleImportAction' @ [99:26] ==> internal fun createSingleImportAction(project: Project, editor: Editor, element: KtElement, fqNames: Collection<FqName>): KotlinAddImportAction defined in org.jetbrains.kotlin.idea.actions[SimpleFunctionDescriptorImpl]

'project' @ [99:51] ==> public final val KtSimpleNameExpression.project: Project[MyPropertyDescriptor]

'editor' @ [99:60] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImport[ValueParameterDescriptorImpl]

'this' @ [99:68] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImport[ReceiverParameterDescriptorImpl]

'suggestions' @ [99:74] ==> val suggestions: Collection<FqName> defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImport[LocalVariableDescriptor]

'execute' @ [99:87] ==> public open fun execute(): Boolean defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[SimpleFunctionDescriptorImpl]

'result' @ [101:20] ==> var result: Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinReferenceImporter.Companion.autoImport[LocalVariableDescriptor]

