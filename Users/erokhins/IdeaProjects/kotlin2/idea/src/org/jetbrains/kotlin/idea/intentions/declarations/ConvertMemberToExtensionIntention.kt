'SelfTargetingRangeIntention<KtCallableDeclaration>' @ [53:43] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtCallableDeclaration>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtCallableDeclaration

'java' @ [53:123] ==> public val <T> KClass<KtCallableDeclaration>.java: Class<KtCallableDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCallableDeclaration

'element' @ [55:25] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.isApplicable[ValueParameterDescriptorImpl]

'parent' @ [55:33] ==> public final val KtCallableDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'classBody' @ [56:13] ==> val classBody: KtClassBody defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.isApplicable[LocalVariableDescriptor]

'parent' @ [56:23] ==> public final val KtClassBody.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [57:13] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.isApplicable[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [57:21] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'element' @ [58:13] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.isApplicable[ValueParameterDescriptorImpl]

'hasModifier' @ [58:21] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [58:42] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'when (element) {
            is KtProperty -> if (element.hasInitializer()) return false
            is KtSecondaryConstructor -> return false
        }' @ [59:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [59:15] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.isApplicable[ValueParameterDescriptorImpl]

'element' @ [60:34] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.isApplicable[ValueParameterDescriptorImpl]

'hasInitializer' @ [60:42] ==> public open fun hasInitializer(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'!' @ [67:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [67:14] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applicabilityRange[ValueParameterDescriptorImpl]

'withHeaderImplementations' @ [67:22] ==> internal fun KtDeclaration.withHeaderImplementations(): List<KtDeclaration> defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'all' @ [67:50] ==> public inline fun <T> Iterable<KtDeclaration>.all(predicate: (KtDeclaration) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'it' @ [67:56] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applicabilityRange.<anonymous>[ValueParameterDescriptorImpl]

'isApplicable' @ [67:87] ==> private final fun isApplicable(element: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention[SimpleFunctionDescriptorImpl]

'it' @ [67:100] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applicabilityRange.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [68:17] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applicabilityRange[ValueParameterDescriptorImpl]

'nameIdentifier' @ [68:25] ==> public final val KtCallableDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'textRange' @ [68:56] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'element' @ [78:9] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo[ValueParameterDescriptorImpl]

'liftToHeader' @ [78:17] ==> internal fun KtDeclaration.liftToHeader(): KtDeclaration? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'headerImplementations' @ [78:33] ==> internal fun KtDeclaration.headerImplementations(): Set<KtDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers in file ImplementedHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'let' @ [78:58] ==> @InlineOnly public inline fun <T, R> Set<KtDeclaration>.let(block: (Set<KtDeclaration>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Set<KtDeclaration>
    <R> -> Unit

'it' @ [79:17] ==> value-parameter it: Set<KtDeclaration> defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'isEmpty' @ [79:20] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'allowHeader' @ [80:17] ==> var allowHeader: Boolean defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo[LocalVariableDescriptor]

'askIfHeaderIsAllowed' @ [80:31] ==> private final fun askIfHeaderIsAllowed(file: KtFile): Boolean defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention[SimpleFunctionDescriptorImpl]

'element' @ [80:52] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo[ValueParameterDescriptorImpl]

'containingKtFile' @ [80:60] ==> public final val KtCallableDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'runWriteAction' @ [84:9] ==> public fun <T> runWriteAction(action: () -> Editor?): Editor? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Editor?

'component1' @ [85:18] ==> public final operator fun component1(): KtCallableDeclaration defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [85:29] ==> public final operator fun component2(): KtExpression? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'createExtensionCallableAndPrepareBodyToSelect' @ [85:45] ==> private final fun createExtensionCallableAndPrepareBodyToSelect(element: KtCallableDeclaration, allowHeader: Boolean = ...): Pair<KtCallableDeclaration, KtExpression?> defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention[SimpleFunctionDescriptorImpl]

'element' @ [85:91] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo[ValueParameterDescriptorImpl]

'allowHeader' @ [85:100] ==> var allowHeader: Boolean defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo[LocalVariableDescriptor]

'editor' @ [87:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo[ValueParameterDescriptorImpl]

'apply' @ [87:21] ==> @InlineOnly public inline fun <T> Editor.apply(block: Editor.() -> Unit): Editor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Editor

'unblockDocument' @ [88:17] ==> public fun Editor.unblockDocument(): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'if (bodyToSelect != null) {
                    val range = bodyToSelect.textRange
                    moveCaret(range.startOffset, ScrollType.CENTER)

                    val parent = bodyToSelect.parent
                    val lastSibling =
                            if (parent is KtBlockExpression)
                                parent.rBrace?.siblings(forward = false, withItself = false)?.first { it !is PsiWhiteSpace }
                            else
                                bodyToSelect.siblings(forward = true, withItself = false).lastOrNull()
                    val endOffset = lastSibling?.endOffset ?: range.endOffset
                    selectionModel.setSelection(range.startOffset, endOffset)
                }
                else {
                    moveCaret(extension.textOffset, ScrollType.CENTER)
                }' @ [90:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'bodyToSelect' @ [90:21] ==> val bodyToSelect: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'bodyToSelect' @ [91:33] ==> val bodyToSelect: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'textRange' @ [91:46] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'moveCaret' @ [92:21] ==> public fun Editor.moveCaret(offset: Int, scrollType: ScrollType = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'range' @ [92:31] ==> val range: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [92:37] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'CENTER' @ [92:61] ==> enum entry CENTER defined in com.intellij.openapi.editor.ScrollType[FakeCallableDescriptorForObject]

'bodyToSelect' @ [94:34] ==> val bodyToSelect: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'parent' @ [94:47] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (parent is KtBlockExpression)
                                parent.rBrace?.siblings(forward = false, withItself = false)?.first { it !is PsiWhiteSpace }
                            else
                                bodyToSelect.siblings(forward = true, withItself = false).lastOrNull()' @ [96:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'parent' @ [96:33] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'parent' @ [97:33] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'rBrace' @ [97:40] ==> public final val KtBlockExpression.rBrace: PsiElement?[MyPropertyDescriptor]

'siblings' @ [97:48] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'first' @ [97:95] ==> public inline fun <T> Sequence<PsiElement>.first(predicate: (PsiElement) -> Boolean): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [97:103] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'bodyToSelect' @ [99:33] ==> val bodyToSelect: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'siblings' @ [99:46] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'lastOrNull' @ [99:91] ==> public fun <T> Sequence<PsiElement>.lastOrNull(): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'lastSibling' @ [100:37] ==> val lastSibling: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'endOffset' @ [100:50] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'range' @ [100:63] ==> val range: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'endOffset' @ [100:69] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'selectionModel' @ [101:21] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'setSelection' @ [101:36] ==> public abstract fun setSelection(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'range' @ [101:49] ==> val range: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [101:55] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'endOffset' @ [101:68] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'moveCaret' @ [104:21] ==> public fun Editor.moveCaret(offset: Int, scrollType: ScrollType = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'extension' @ [104:31] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'textOffset' @ [104:41] ==> public final val KtCallableDeclaration.textOffset: Int[MyPropertyDescriptor]

'CENTER' @ [104:64] ==> enum entry CENTER defined in com.intellij.openapi.editor.ScrollType[FakeCallableDescriptorForObject]

'element' @ [114:26] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [114:34] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [115:31] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'containingDeclaration' @ [115:42] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'allowHeader' @ [117:33] ==> value-parameter allowHeader: Boolean defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[ValueParameterDescriptorImpl]

'element' @ [117:48] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[ValueParameterDescriptorImpl]

'isHeaderOrHeaderClassMember' @ [117:56] ==> internal fun KtDeclaration.isHeaderOrHeaderClassMember(): Boolean defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'element' @ [119:20] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[ValueParameterDescriptorImpl]

'containingKtFile' @ [119:28] ==> public final val KtCallableDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'file' @ [120:23] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'project' @ [120:28] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'getOutermostParent' @ [121:41] ==> @Nullable public open fun getOutermostParent(@NotNull p0: PsiElement, @NotNull p1: PsiElement, p2: Boolean): PsiElement? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [121:60] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[ValueParameterDescriptorImpl]

'file' @ [121:69] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'SmartList' @ [123:35] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtFile

'SmartList' @ [124:30] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiMethodCallExpression

'iterator' @ [125:21] ==> public abstract fun iterator(): MutableIterator<(PsiReference..PsiReference?)> defined in com.intellij.util.Query[DeserializedSimpleFunctionDescriptor]

'search' @ [125:38] ==> @NotNull public open fun search(@NotNull p0: PsiElement): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'element' @ [125:45] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[ValueParameterDescriptorImpl]

'when (ref) {
                is KtReference -> {
                    val refFile = ref.element.containingKtFile
                    if (refFile != file) {
                        ktFilesToAddImports.add(refFile)
                    }
                }
                is PsiReferenceExpression -> javaCallsToFix.addIfNotNull(ref.parent as? PsiMethodCallExpression)
            }' @ [126:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'ref' @ [126:19] ==> val ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'ref' @ [128:35] ==> val ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'element' @ [128:39] ==> public final val KtReference.element: KtElement[MyPropertyDescriptor]

'containingKtFile' @ [128:47] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'refFile' @ [129:25] ==> val refFile: KtFile defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'file' @ [129:36] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'ktFilesToAddImports' @ [130:25] ==> val ktFilesToAddImports: SmartList<KtFile> defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'add' @ [130:45] ==> public open fun add(element: (KtFile..KtFile?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'refFile' @ [130:49] ==> val refFile: KtFile defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'javaCallsToFix' @ [133:46] ==> val javaCallsToFix: SmartList<PsiMethodCallExpression> defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'addIfNotNull' @ [133:61] ==> public fun <T : Any> MutableCollection<(PsiMethodCallExpression..PsiMethodCallExpression?)>.addIfNotNull(t: PsiMethodCallExpression?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> (com.intellij.psi.PsiMethodCallExpression..com.intellij.psi.PsiMethodCallExpression?)

'ref' @ [133:74] ==> val ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'parent' @ [133:78] ==> public final val PsiReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'newTypeParameterList' @ [137:33] ==> private final fun newTypeParameterList(member: KtCallableDeclaration): KtTypeParameterList? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention[SimpleFunctionDescriptorImpl]

'element' @ [137:54] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [139:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [139:39] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[ValueParameterDescriptorImpl]

'file' @ [141:25] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'addAfter' @ [141:30] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'element' @ [141:39] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[ValueParameterDescriptorImpl]

'outermostParent' @ [141:48] ==> val outermostParent: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'file' @ [142:9] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'addAfter' @ [142:14] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'psiFactory' @ [142:23] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'createNewLine' @ [142:34] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'outermostParent' @ [142:51] ==> val outermostParent: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'file' @ [143:9] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'addAfter' @ [143:14] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'psiFactory' @ [143:23] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'createNewLine' @ [143:34] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'outermostParent' @ [143:51] ==> val outermostParent: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'element' @ [144:9] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[ValueParameterDescriptorImpl]

'delete' @ [144:17] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'extension' @ [146:9] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'setReceiverType' @ [146:19] ==> public fun KtCallableDeclaration.setReceiverType(type: KotlinType): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [146:35] ==> val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'defaultType' @ [146:51] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'typeParameterList' @ [148:13] ==> val typeParameterList: KtTypeParameterList? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'if (extension.typeParameterList != null) {
                extension.typeParameterList!!.replace(typeParameterList)
            }
            else {
                extension.addBefore(typeParameterList, extension.receiverTypeReference)
                extension.addBefore(psiFactory.createWhiteSpace(), extension.receiverTypeReference)
            }' @ [149:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'extension' @ [149:17] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'typeParameterList' @ [149:27] ==> public final val KtCallableDeclaration.typeParameterList: KtTypeParameterList?[MyPropertyDescriptor]

'extension' @ [150:17] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'typeParameterList' @ [150:27] ==> public final val KtCallableDeclaration.typeParameterList: KtTypeParameterList?[MyPropertyDescriptor]

'replace' @ [150:47] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeParameterList[JavaMethodDescriptor]

'typeParameterList' @ [150:55] ==> val typeParameterList: KtTypeParameterList? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'extension' @ [153:17] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'addBefore' @ [153:27] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'typeParameterList' @ [153:37] ==> val typeParameterList: KtTypeParameterList? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'extension' @ [153:56] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'receiverTypeReference' @ [153:66] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'extension' @ [154:17] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'addBefore' @ [154:27] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'psiFactory' @ [154:37] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'createWhiteSpace' @ [154:48] ==> public final fun createWhiteSpace(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'extension' @ [154:68] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'receiverTypeReference' @ [154:78] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'extension' @ [158:9] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'modifierList' @ [158:19] ==> public final val KtCallableDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'getModifier' @ [158:33] ==> @Nullable public open fun getModifier(@NotNull p0: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'PROTECTED_KEYWORD' @ [158:54] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'delete' @ [158:74] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'extension' @ [159:9] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'modifierList' @ [159:19] ==> public final val KtCallableDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'getModifier' @ [159:33] ==> @Nullable public open fun getModifier(@NotNull p0: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [159:54] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'delete' @ [159:73] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'extension' @ [160:9] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'modifierList' @ [160:19] ==> public final val KtCallableDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'getModifier' @ [160:33] ==> @Nullable public open fun getModifier(@NotNull p0: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'OPEN_KEYWORD' @ [160:54] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'delete' @ [160:69] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'extension' @ [161:9] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'modifierList' @ [161:19] ==> public final val KtCallableDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'getModifier' @ [161:33] ==> @Nullable public open fun getModifier(@NotNull p0: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'FINAL_KEYWORD' @ [161:54] ==> public final val FINAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'delete' @ [161:70] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'isEffectiveHeader' @ [163:13] ==> val isEffectiveHeader: Boolean defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'!' @ [163:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'extension' @ [163:35] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'hasModifier' @ [163:45] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'HEADER_KEYWORD' @ [163:66] ==> public final val HEADER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'extension' @ [164:9] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'addModifier' @ [164:19] ==> public abstract fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'HEADER_KEYWORD' @ [164:40] ==> public final val HEADER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'bodyToSelect' @ [169:17] ==> var bodyToSelect: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'declaration' @ [170:28] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration.selectBody[ValueParameterDescriptorImpl]

'bodyExpression' @ [170:40] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'bodyToSelect' @ [171:17] ==> var bodyToSelect: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'?:' @ [171:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression?

'body' @ [171:33] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration.selectBody[LocalVariableDescriptor]

'statements' @ [171:62] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'single' @ [171:74] ==> public fun <T> List<(KtExpression..KtExpression?)>.single(): (KtExpression..KtExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'body' @ [171:86] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration.selectBody[LocalVariableDescriptor]

'getFunctionBodyTextFromTemplate' @ [175:24] ==> public fun getFunctionBodyTextFromTemplate(project: Project, kind: TemplateKind, name: String?, returnType: String, classFqName: FqName? = ...): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'project' @ [176:17] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'if (extension is KtFunction) TemplateKind.FUNCTION else TemplateKind.PROPERTY_INITIALIZER' @ [177:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TemplateKind, elseBranch: TemplateKind): TemplateKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TemplateKind

'extension' @ [177:21] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'FUNCTION' @ [177:59] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.core.TemplateKind[FakeCallableDescriptorForObject]

'PROPERTY_INITIALIZER' @ [177:86] ==> enum entry PROPERTY_INITIALIZER defined in org.jetbrains.kotlin.idea.core.TemplateKind[FakeCallableDescriptorForObject]

'extension' @ [178:17] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'name' @ [178:27] ==> public final val KtCallableDeclaration.name: String?[MyPropertyDescriptor]

'extension' @ [179:17] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'getReturnTypeReference' @ [179:27] ==> internal fun KtNamedDeclaration.getReturnTypeReference(): KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableBuilder.kt[SimpleFunctionDescriptorImpl]

'text' @ [179:53] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'extension' @ [180:17] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'containingClassOrObject' @ [180:27] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'fqName' @ [180:52] ==> public final val KtClassOrObject.fqName: FqName?[MyPropertyDescriptor]

'when (extension) {
            is KtFunction -> {
                if (!extension.hasBody() && !isEffectiveHeader) {
                    //TODO: methods in PSI for setBody
                    extension.add(psiFactory.createBlock(bodyText))
                    selectBody(extension)
                }
            }

            is KtProperty -> {
                val templateProperty = psiFactory.createDeclaration<KtProperty>("var v: Any\nget()=$bodyText\nset(value){\n$bodyText\n}")

                if (!isEffectiveHeader) {
                    val templateGetter = templateProperty.getter!!
                    val templateSetter = templateProperty.setter!!

                    var getter = extension.getter
                    if (getter == null) {
                        getter = extension.addAfter(templateGetter, extension.typeReference) as KtPropertyAccessor
                        extension.addBefore(psiFactory.createNewLine(), getter)
                        selectBody(getter)
                    }
                    else if (!getter.hasBody()) {
                        getter = getter.replace(templateGetter) as KtPropertyAccessor
                        selectBody(getter)
                    }

                    if (extension.isVar) {
                        var setter = extension.setter
                        if (setter == null) {
                            setter = extension.addAfter(templateSetter, getter) as KtPropertyAccessor
                            extension.addBefore(psiFactory.createNewLine(), setter)
                            selectBody(setter)
                        }
                        else if (!setter.hasBody()) {
                            setter = setter.replace(templateSetter) as KtPropertyAccessor
                            selectBody(setter)
                        }
                    }
                }
            }
        }' @ [183:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'extension' @ [183:15] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'!' @ [185:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'extension' @ [185:22] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'hasBody' @ [185:32] ==> public abstract fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'!' @ [185:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isEffectiveHeader' @ [185:46] ==> val isEffectiveHeader: Boolean defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'extension' @ [187:21] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'add' @ [187:31] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'psiFactory' @ [187:35] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'createBlock' @ [187:46] ==> public final fun createBlock(bodyText: String): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'bodyText' @ [187:58] ==> val bodyText: String defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'selectBody' @ [188:21] ==> local final fun selectBody(declaration: KtDeclarationWithBody): Unit defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[SimpleFunctionDescriptorImpl]

'extension' @ [188:32] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'psiFactory' @ [193:40] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'createDeclaration' @ [193:51] ==> public final fun <TDeclaration : KtDeclaration> createDeclaration(text: String): KtProperty defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TDeclaration : KtDeclaration> -> KtProperty

'bodyText' @ [193:101] ==> val bodyText: String defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'bodyText' @ [193:125] ==> val bodyText: String defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'!' @ [195:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isEffectiveHeader' @ [195:22] ==> val isEffectiveHeader: Boolean defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'templateProperty' @ [196:42] ==> val templateProperty: KtProperty defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'getter' @ [196:59] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'templateProperty' @ [197:42] ==> val templateProperty: KtProperty defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'setter' @ [197:59] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'extension' @ [199:34] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'getter' @ [199:44] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'if (getter == null) {
                        getter = extension.addAfter(templateGetter, extension.typeReference) as KtPropertyAccessor
                        extension.addBefore(psiFactory.createNewLine(), getter)
                        selectBody(getter)
                    }
                    else if (!getter.hasBody()) {
                        getter = getter.replace(templateGetter) as KtPropertyAccessor
                        selectBody(getter)
                    }' @ [200:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'getter' @ [200:25] ==> var getter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'getter' @ [201:25] ==> var getter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'extension' @ [201:34] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'addAfter' @ [201:44] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'templateGetter' @ [201:53] ==> val templateGetter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'extension' @ [201:69] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'typeReference' @ [201:79] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'extension' @ [202:25] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'addBefore' @ [202:35] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'psiFactory' @ [202:45] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'createNewLine' @ [202:56] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'getter' @ [202:73] ==> var getter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'selectBody' @ [203:25] ==> local final fun selectBody(declaration: KtDeclarationWithBody): Unit defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[SimpleFunctionDescriptorImpl]

'getter' @ [203:36] ==> var getter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'!' @ [205:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getter' @ [205:31] ==> var getter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'hasBody' @ [205:38] ==> public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'getter' @ [206:25] ==> var getter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'getter' @ [206:34] ==> var getter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'replace' @ [206:41] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'templateGetter' @ [206:49] ==> val templateGetter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'selectBody' @ [207:25] ==> local final fun selectBody(declaration: KtDeclarationWithBody): Unit defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[SimpleFunctionDescriptorImpl]

'getter' @ [207:36] ==> var getter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'extension' @ [210:25] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'isVar' @ [210:35] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'extension' @ [211:38] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'setter' @ [211:48] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'if (setter == null) {
                            setter = extension.addAfter(templateSetter, getter) as KtPropertyAccessor
                            extension.addBefore(psiFactory.createNewLine(), setter)
                            selectBody(setter)
                        }
                        else if (!setter.hasBody()) {
                            setter = setter.replace(templateSetter) as KtPropertyAccessor
                            selectBody(setter)
                        }' @ [212:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'setter' @ [212:29] ==> var setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'setter' @ [213:29] ==> var setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'extension' @ [213:38] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'addAfter' @ [213:48] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'templateSetter' @ [213:57] ==> val templateSetter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'getter' @ [213:73] ==> var getter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'extension' @ [214:29] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'addBefore' @ [214:39] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'psiFactory' @ [214:49] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'createNewLine' @ [214:60] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'setter' @ [214:77] ==> var setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'selectBody' @ [215:29] ==> local final fun selectBody(declaration: KtDeclarationWithBody): Unit defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[SimpleFunctionDescriptorImpl]

'setter' @ [215:40] ==> var setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'!' @ [217:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'setter' @ [217:35] ==> var setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'hasBody' @ [217:42] ==> public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'setter' @ [218:29] ==> var setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'setter' @ [218:38] ==> var setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'replace' @ [218:45] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'templateSetter' @ [218:53] ==> val templateSetter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'selectBody' @ [219:29] ==> local final fun selectBody(declaration: KtDeclarationWithBody): Unit defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[SimpleFunctionDescriptorImpl]

'setter' @ [219:40] ==> var setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'ktFilesToAddImports' @ [226:13] ==> val ktFilesToAddImports: SmartList<KtFile> defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'isNotEmpty' @ [226:33] ==> @InlineOnly public inline fun <T> Collection<(KtFile..KtFile?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)

'extension' @ [227:33] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'resolveToDescriptor' @ [227:43] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'ImportInsertHelper' @ [228:38] ==> public companion object defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[FakeCallableDescriptorForObject]

'getInstance' @ [228:57] ==> @JvmStatic public final fun getInstance(project: Project): ImportInsertHelper defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [228:69] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'ktFilesToAddImports' @ [229:39] ==> val ktFilesToAddImports: SmartList<KtFile> defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'importInsertHelper' @ [230:17] ==> val importInsertHelper: ImportInsertHelper defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'importDescriptor' @ [230:36] ==> public abstract fun importDescriptor(file: KtFile, descriptor: DeclarationDescriptor, forceAllUnderImport: Boolean = ...): ImportDescriptorResult defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[DeserializedSimpleFunctionDescriptor]

'ktFileToAddImport' @ [230:53] ==> val ktFileToAddImport: (KtFile..KtFile?) defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'newDescriptor' @ [230:72] ==> val newDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'javaCallsToFix' @ [234:13] ==> val javaCallsToFix: SmartList<PsiMethodCallExpression> defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'isNotEmpty' @ [234:28] ==> @InlineOnly public inline fun <T> Collection<(PsiMethodCallExpression..PsiMethodCallExpression?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethodCallExpression..com.intellij.psi.PsiMethodCallExpression?)

'extension' @ [235:31] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'toLightMethods' @ [235:41] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'first' @ [235:58] ==> public fun <T> List<PsiMethod>.first(): PsiMethod defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'javaCallsToFix' @ [236:35] ==> val javaCallsToFix: SmartList<PsiMethodCallExpression> defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'javaCallToFix' @ [237:17] ==> val javaCallToFix: (PsiMethodCallExpression..PsiMethodCallExpression?) defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'methodExpression' @ [237:31] ==> public final val PsiMethodCallExpression.methodExpression: PsiReferenceExpression[MyPropertyDescriptor]

'qualifierExpression' @ [237:48] ==> public final var PsiReferenceExpression.qualifierExpression: PsiExpression?[MyPropertyDescriptor]

'let' @ [237:69] ==> @InlineOnly public inline fun <T, R> PsiExpression.let(block: (PsiExpression) -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiExpression
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'javaCallToFix' @ [238:40] ==> val javaCallToFix: (PsiMethodCallExpression..PsiMethodCallExpression?) defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'argumentList' @ [238:54] ==> public final val PsiMethodCallExpression.argumentList: PsiExpressionList[MyPropertyDescriptor]

'argumentList' @ [239:21] ==> val argumentList: PsiExpressionList defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration.<anonymous>[LocalVariableDescriptor]

'addBefore' @ [239:34] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiExpressionList[JavaMethodDescriptor]

'it' @ [239:44] ==> value-parameter it: PsiExpression defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'argumentList' @ [239:48] ==> val argumentList: PsiExpressionList defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration.<anonymous>[LocalVariableDescriptor]

'expressions' @ [239:61] ==> public final val PsiExpressionList.expressions: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>)[MyPropertyDescriptor]

'firstOrNull' @ [239:73] ==> public fun <T> Array<out (PsiExpression..PsiExpression?)>.firstOrNull(): PsiExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiExpression..com.intellij.psi.PsiExpression?)

'javaCallToFix' @ [242:30] ==> val javaCallToFix: (PsiMethodCallExpression..PsiMethodCallExpression?) defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'methodExpression' @ [242:44] ==> public final val PsiMethodCallExpression.methodExpression: PsiReferenceExpression[MyPropertyDescriptor]

'bindToElement' @ [242:61] ==> public abstract fun bindToElement(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'lightMethod' @ [242:75] ==> val lightMethod: PsiMethod defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'getInstance' @ [243:38] ==> public open fun getInstance(p0: (Project..Project?)): (JavaCodeStyleManager..JavaCodeStyleManager?) defined in com.intellij.psi.codeStyle.JavaCodeStyleManager[JavaMethodDescriptor]

'project' @ [243:50] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'shortenClassReferences' @ [243:59] ==> @NotNull public abstract fun shortenClassReferences(@NotNull p0: PsiElement): PsiElement defined in com.intellij.psi.codeStyle.JavaCodeStyleManager[JavaMethodDescriptor]

'newRef' @ [243:82] ==> val newRef: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'extension' @ [247:16] ==> val extension: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'bodyToSelect' @ [247:29] ==> var bodyToSelect: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.processSingleDeclaration[LocalVariableDescriptor]

'getApplication' @ [251:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [251:49] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'file' @ [252:20] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.askIfHeaderIsAllowed[ValueParameterDescriptorImpl]

'allChildren' @ [252:25] ==> public val PsiElement.allChildren: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'any' @ [252:37] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [252:43] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.askIfHeaderIsAllowed.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [252:63] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.askIfHeaderIsAllowed.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [252:66] ==> public final val PsiComment.text: (String..String?)[MyPropertyDescriptor]

'trim' @ [252:71] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'==' @ [255:16] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'showYesNoDialog' @ [255:25] ==> @Messages.YesNoResult public open fun showYesNoDialog(p0: (String..String?), @NotNull @Nls p1: String, @Nullable p2: Icon?): Int defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'text' @ [257:17] ==> public final var ConvertMemberToExtensionIntention.text: String[MyPropertyDescriptor]

'getQuestionIcon' @ [258:26] ==> @NotNull public open fun getQuestionIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'YES' @ [259:23] ==> public const final val YES: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'element' @ [266:33] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.createExtensionCallableAndPrepareBodyToSelect[ValueParameterDescriptorImpl]

'liftToHeader' @ [266:41] ==> internal fun KtDeclaration.liftToHeader(): KtDeclaration? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'headerDeclaration' @ [267:13] ==> val headerDeclaration: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.createExtensionCallableAndPrepareBodyToSelect[LocalVariableDescriptor]

'element' @ [268:13] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.createExtensionCallableAndPrepareBodyToSelect[ValueParameterDescriptorImpl]

'withHeaderImplementations' @ [268:21] ==> internal fun KtDeclaration.withHeaderImplementations(): List<KtDeclaration> defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'filterIsInstance' @ [268:49] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtCallableDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtCallableDeclaration

'forEach' @ [268:91] ==> @HidesMembers public inline fun <T> Iterable<KtCallableDeclaration>.forEach(action: (KtCallableDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallableDeclaration

'it' @ [269:21] ==> value-parameter it: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.createExtensionCallableAndPrepareBodyToSelect.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [269:27] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.createExtensionCallableAndPrepareBodyToSelect[ValueParameterDescriptorImpl]

'processSingleDeclaration' @ [270:21] ==> private final fun processSingleDeclaration(element: KtCallableDeclaration, allowHeader: Boolean): Pair<KtCallableDeclaration, KtExpression?> defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention[SimpleFunctionDescriptorImpl]

'it' @ [270:46] ==> value-parameter it: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.createExtensionCallableAndPrepareBodyToSelect.<anonymous>[ValueParameterDescriptorImpl]

'allowHeader' @ [270:50] ==> value-parameter allowHeader: Boolean = ... defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.createExtensionCallableAndPrepareBodyToSelect[ValueParameterDescriptorImpl]

'processSingleDeclaration' @ [275:16] ==> private final fun processSingleDeclaration(element: KtCallableDeclaration, allowHeader: Boolean): Pair<KtCallableDeclaration, KtExpression?> defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention[SimpleFunctionDescriptorImpl]

'element' @ [275:41] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.createExtensionCallableAndPrepareBodyToSelect[ValueParameterDescriptorImpl]

'allowHeader' @ [275:50] ==> value-parameter allowHeader: Boolean = ... defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.createExtensionCallableAndPrepareBodyToSelect[ValueParameterDescriptorImpl]

'member' @ [279:28] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.newTypeParameterList[ValueParameterDescriptorImpl]

'parent' @ [279:35] ==> public final val KtCallableDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [279:42] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'classElement' @ [280:27] ==> val classElement: KtClass defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.newTypeParameterList[LocalVariableDescriptor]

'typeParameters' @ [280:40] ==> public final val KtClass.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'classParams' @ [281:13] ==> val classParams: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>) defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.newTypeParameterList[LocalVariableDescriptor]

'isEmpty' @ [281:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'classParams' @ [282:33] ==> val classParams: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>) defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.newTypeParameterList[LocalVariableDescriptor]

'member' @ [282:47] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.newTypeParameterList[ValueParameterDescriptorImpl]

'typeParameters' @ [282:54] ==> public final val KtCallableDeclaration.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'allTypeParameters' @ [283:20] ==> val allTypeParameters: List<(KtTypeParameter..KtTypeParameter?)> defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.newTypeParameterList[LocalVariableDescriptor]

'joinToString' @ [283:38] ==> public fun <T> Iterable<(KtTypeParameter..KtTypeParameter?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((KtTypeParameter..KtTypeParameter?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeParameter..org.jetbrains.kotlin.psi.KtTypeParameter?)

'it' @ [283:68] ==> value-parameter it: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.newTypeParameterList.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [283:71] ==> public final val KtTypeParameter.text: (String..String?)[MyPropertyDescriptor]

'KtPsiFactory' @ [284:16] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'member' @ [284:29] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.newTypeParameterList[ValueParameterDescriptorImpl]

'createDeclaration' @ [284:37] ==> public final fun <TDeclaration : KtDeclaration> createDeclaration(text: String): KtFunction defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TDeclaration : KtDeclaration> -> KtFunction

'text' @ [284:73] ==> val text: String defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.newTypeParameterList[LocalVariableDescriptor]

'typeParameterList' @ [284:86] ==> public final val KtFunction.typeParameterList: KtTypeParameterList?[MyPropertyDescriptor]

'ConvertMemberToExtensionIntention' @ [289:20] ==> public constructor ConvertMemberToExtensionIntention() defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention[ClassConstructorDescriptorImpl]

'createExtensionCallableAndPrepareBodyToSelect' @ [289:56] ==> private final fun createExtensionCallableAndPrepareBodyToSelect(element: KtCallableDeclaration, allowHeader: Boolean = ...): Pair<KtCallableDeclaration, KtExpression?> defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention[SimpleFunctionDescriptorImpl]

'element' @ [289:102] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.Companion.convert[ValueParameterDescriptorImpl]

'first' @ [289:111] ==> public final val first: KtCallableDeclaration defined in kotlin.Pair[DeserializedPropertyDescriptor]

