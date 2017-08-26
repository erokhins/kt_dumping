'BaseRefactoringProcessor' @ [44:5] ==> protected/*protected and package*/ constructor BaseRefactoringProcessor(@NotNull p0: Project) defined in com.intellij.refactoring.BaseRefactoringProcessor[JavaClassConstructorDescriptor]

'project' @ [44:30] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor.<init>[ValueParameterDescriptorImpl]

'when (declaration) {
        is KtNamedFunction -> "function"
        is KtProperty -> if (declaration.isLocal) "local variable" else "property"
        else -> "declaration"
    }' @ [46:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'declaration' @ [46:30] ==> private final val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'if (declaration.isLocal) "local variable" else "property"' @ [48:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'declaration' @ [48:30] ==> private final val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'isLocal' @ [48:42] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'kind' @ [52:42] ==> private final val kind: String defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'getDescriptiveName' @ [52:69] ==> @NotNull public open fun getDescriptiveName(@NotNull p0: PsiElement): String defined in com.intellij.lang.findUsages.DescriptiveNameUtil[JavaMethodDescriptor]

'declaration' @ [52:88] ==> private final val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'inlineThisOnly' @ [55:13] ==> private final val inlineThisOnly: Boolean defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'reference' @ [55:31] ==> private final val reference: KtSimpleNameReference? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'arrayOf' @ [55:57] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: UsageInfo): Array<UsageInfo> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> UsageInfo

'UsageInfo' @ [55:65] ==> public constructor UsageInfo(@NotNull p0: PsiReference) defined in com.intellij.usageView.UsageInfo[JavaClassConstructorDescriptor]

'reference' @ [55:75] ==> private final val reference: KtSimpleNameReference? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'runReadAction' @ [56:22] ==> public fun <T> runReadAction(action: () -> Query<(PsiReference..PsiReference?)>): Query<(PsiReference..PsiReference?)> defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Query<(com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)>

'KotlinSourceFilterScope' @ [57:31] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope[FakeCallableDescriptorForObject]

'projectSources' @ [57:55] ==> @JvmStatic public final fun projectSources(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[DeserializedSimpleFunctionDescriptor]

'projectScope' @ [57:88] ==> @NotNull public open fun projectScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'myProject' @ [57:101] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[JavaPropertyDescriptor]

'myProject' @ [57:113] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[JavaPropertyDescriptor]

'search' @ [58:30] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'declaration' @ [58:37] ==> private final val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'searchScope' @ [58:50] ==> val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor.findUsages.<anonymous>[LocalVariableDescriptor]

'usages' @ [60:16] ==> val usages: Query<(PsiReference..PsiReference?)> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor.findUsages[LocalVariableDescriptor]

'map' @ [60:23] ==> public inline fun <T, R> Iterable<(PsiReference..PsiReference?)>.map(transform: ((PsiReference..PsiReference?)) -> UsageInfo): List<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <R> -> UsageInfo

'toTypedArray' @ [60:40] ==> public inline fun <reified T> Collection<UsageInfo>.toTypedArray(): Array<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> UsageInfo

'usages' @ [64:32] ==> value-parameter usages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor.performRefactoring[ValueParameterDescriptorImpl]

'mapNotNull' @ [64:39] ==> public inline fun <T, R : Any> Array<out UsageInfo>.mapNotNull(transform: (UsageInfo) -> KtSimpleNameExpression?): List<KtSimpleNameExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo
    <R : Any> -> KtSimpleNameExpression

'it' @ [64:52] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor.performRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [64:55] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'replacementStrategy' @ [65:9] ==> private final val replacementStrategy: UsageReplacementStrategy defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'replaceUsages' @ [65:29] ==> public fun UsageReplacementStrategy.replaceUsages(usages: Collection<KtSimpleNameExpression>, targetPsiElement: PsiElement, project: Project, commandName: String, postAction: () -> Unit = ...): Unit defined in org.jetbrains.kotlin.idea.codeInliner[SimpleFunctionDescriptorImpl]

'simpleNameUsages' @ [66:17] ==> val simpleNameUsages: List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor.performRefactoring[LocalVariableDescriptor]

'declaration' @ [67:17] ==> private final val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'myProject' @ [68:17] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[JavaPropertyDescriptor]

'commandName' @ [69:17] ==> private final val commandName: String defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'deleteAfter' @ [71:25] ==> private final val deleteAfter: Boolean defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'if (usages.size == simpleNameUsages.size) {
                            declaration.delete()
                            statementToDelete?.delete()
                        }
                        else {
                            CommonRefactoringUtil.showErrorHint(
                                    declaration.project,
                                    null,
                                    "Cannot inline ${usages.size - simpleNameUsages.size}/${usages.size} usages",
                                    "Inline $kind",
                                    null
                            )
                        }' @ [72:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'usages' @ [72:29] ==> value-parameter usages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor.performRefactoring[ValueParameterDescriptorImpl]

'size' @ [72:36] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'simpleNameUsages' @ [72:44] ==> val simpleNameUsages: List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor.performRefactoring[LocalVariableDescriptor]

'size' @ [72:61] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'declaration' @ [73:29] ==> private final val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'delete' @ [73:41] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'statementToDelete' @ [74:29] ==> private final val statementToDelete: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'delete' @ [74:48] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaMethodDescriptor]

'showErrorHint' @ [77:51] ==> public open fun showErrorHint(@NotNull p0: Project, @Nullable p1: Editor?, @NotNull @Nls p2: String, @NotNull @Nls p3: String, @Nullable p4: String?): Unit defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'declaration' @ [78:37] ==> private final val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'project' @ [78:49] ==> public final val KtCallableDeclaration.project: Project[MyPropertyDescriptor]

'usages' @ [80:54] ==> value-parameter usages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor.performRefactoring[ValueParameterDescriptorImpl]

'size' @ [80:61] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'simpleNameUsages' @ [80:68] ==> val simpleNameUsages: List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor.performRefactoring[LocalVariableDescriptor]

'size' @ [80:85] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'usages' @ [80:93] ==> value-parameter usages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor.performRefactoring[ValueParameterDescriptorImpl]

'size' @ [80:100] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'kind' @ [81:46] ==> private final val kind: String defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'commandName' @ [90:45] ==> private final val commandName: String defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'message' @ [95:39] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'getOccurencesString' @ [95:91] ==> public open fun getOccurencesString(p0: Int, p1: Int): (String..String?) defined in com.intellij.usageView.UsageViewBundle[JavaMethodDescriptor]

'usagesCount' @ [95:111] ==> value-parameter usagesCount: Int defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor.createUsageViewDescriptor.<no name provided>.getCommentReferencesText[ValueParameterDescriptorImpl]

'filesCount' @ [95:124] ==> value-parameter filesCount: Int defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor.createUsageViewDescriptor.<no name provided>.getCommentReferencesText[ValueParameterDescriptorImpl]

'message' @ [98:39] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'getReferencesString' @ [98:92] ==> public open fun getReferencesString(p0: Int, p1: Int): (String..String?) defined in com.intellij.usageView.UsageViewBundle[JavaMethodDescriptor]

'usagesCount' @ [98:112] ==> value-parameter usagesCount: Int defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor.createUsageViewDescriptor.<no name provided>.getCodeReferencesText[ValueParameterDescriptorImpl]

'filesCount' @ [98:125] ==> value-parameter filesCount: Int defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor.createUsageViewDescriptor.<no name provided>.getCodeReferencesText[ValueParameterDescriptorImpl]

'arrayOf' @ [100:42] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KtCallableDeclaration): Array<KtCallableDeclaration> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KtCallableDeclaration

'declaration' @ [100:50] ==> private final val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'kind' @ [102:60] ==> private final val kind: String defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineCallableProcessor[PropertyDescriptorImpl]

'capitalize' @ [102:65] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

