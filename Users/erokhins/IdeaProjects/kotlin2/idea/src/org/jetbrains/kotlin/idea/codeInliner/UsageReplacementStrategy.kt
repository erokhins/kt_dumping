'getInstance' @ [53:26] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'java' @ [53:70] ==> public val <T> KClass<UsageReplacementStrategy>.java: Class<UsageReplacementStrategy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UsageReplacementStrategy

'targetPsiElement' @ [61:19] ==> value-parameter targetPsiElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsagesInWholeProject[ValueParameterDescriptorImpl]

'project' @ [61:36] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'getInstance' @ [62:21] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'run' @ [62:35] ==> public abstract fun run(@NotNull p0: Task): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'Task.Modal' @ [63:22] ==> public constructor Modal(@Nullable p0: Project?, @Nls @NotNull p1: String, p2: Boolean) defined in com.intellij.openapi.progress.Task.Modal[JavaClassConstructorDescriptor]

'project' @ [63:33] ==> val project: Project defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsagesInWholeProject[LocalVariableDescriptor]

'progressTitle' @ [63:42] ==> value-parameter progressTitle: String defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsagesInWholeProject[ValueParameterDescriptorImpl]

'runReadAction' @ [65:34] ==> public fun <T> runReadAction(action: () -> List<KtSimpleNameExpression>): List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<KtSimpleNameExpression>

'KotlinSourceFilterScope' @ [66:43] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope[FakeCallableDescriptorForObject]

'projectSources' @ [66:67] ==> @JvmStatic public final fun projectSources(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[DeserializedSimpleFunctionDescriptor]

'projectScope' @ [66:100] ==> @NotNull public open fun projectScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [66:113] ==> val project: Project defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsagesInWholeProject[LocalVariableDescriptor]

'project' @ [66:123] ==> val project: Project defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsagesInWholeProject[LocalVariableDescriptor]

'search' @ [67:42] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'targetPsiElement' @ [67:49] ==> value-parameter targetPsiElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsagesInWholeProject[ValueParameterDescriptorImpl]

'searchScope' @ [67:67] ==> val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsagesInWholeProject.<no name provided>.run.<anonymous>[LocalVariableDescriptor]

'filterIsInstance' @ [68:34] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtSimpleNameReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtSimpleNameReference

'map' @ [69:34] ==> public inline fun <T, R> Iterable<KtSimpleNameReference>.map(transform: (KtSimpleNameReference) -> KtSimpleNameExpression): List<KtSimpleNameExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameReference
    <R> -> KtSimpleNameExpression

'ref' @ [69:47] ==> value-parameter ref: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsagesInWholeProject.<no name provided>.run.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [69:51] ==> public final val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedPropertyDescriptor]

'this@replaceUsagesInWholeProject' @ [71:21] ==> <this> defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsagesInWholeProject[ReceiverParameterDescriptorImpl]

'replaceUsages' @ [71:54] ==> public fun UsageReplacementStrategy.replaceUsages(usages: Collection<KtSimpleNameExpression>, targetPsiElement: PsiElement, project: Project, commandName: String, postAction: () -> Unit = ...): Unit defined in org.jetbrains.kotlin.idea.codeInliner[SimpleFunctionDescriptorImpl]

'usages' @ [71:68] ==> val usages: List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsagesInWholeProject.<no name provided>.run[LocalVariableDescriptor]

'targetPsiElement' @ [71:76] ==> value-parameter targetPsiElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsagesInWholeProject[ValueParameterDescriptorImpl]

'project' @ [71:94] ==> val project: Project defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsagesInWholeProject[LocalVariableDescriptor]

'commandName' @ [71:103] ==> value-parameter commandName: String defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsagesInWholeProject[ValueParameterDescriptorImpl]

'postAction' @ [71:116] ==> value-parameter postAction: () -> Unit = ... defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsagesInWholeProject[ValueParameterDescriptorImpl]

'invokeLaterIfNeeded' @ [83:14] ==> public final fun invokeLaterIfNeeded(@NotNull p0: () -> Unit, @NotNull p1: ModalityState): Unit defined in com.intellij.ui.GuiUtils[SamAdapterFunctionDescriptor]

'project' @ [84:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages[ValueParameterDescriptorImpl]

'executeWriteCommand' @ [84:17] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'commandName' @ [84:37] ==> value-parameter commandName: String defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages[ValueParameterDescriptorImpl]

'targetPsiElement' @ [85:37] ==> value-parameter targetPsiElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages[ValueParameterDescriptorImpl]

'usages' @ [87:32] ==> value-parameter usages: Collection<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages[ValueParameterDescriptorImpl]

'groupBy' @ [87:39] ==> public inline fun <T, K> Iterable<KtSimpleNameExpression>.groupBy(keySelector: (KtSimpleNameExpression) -> (PsiFile..PsiFile?)): Map<(PsiFile..PsiFile?), List<KtSimpleNameExpression>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression
    <K> -> (com.intellij.psi.PsiFile..com.intellij.psi.PsiFile?)

'it' @ [87:49] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [87:52] ==> public final val KtSimpleNameExpression.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'Key' @ [89:23] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'component1' @ [91:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(PsiFile..PsiFile?), List<KtSimpleNameExpression>>.component1(): (PsiFile..PsiFile?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.psi.PsiFile..com.intellij.psi.PsiFile?)
    <V> -> List<KtSimpleNameExpression>

'component2' @ [91:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(PsiFile..PsiFile?), List<KtSimpleNameExpression>>.component2(): List<KtSimpleNameExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.psi.PsiFile..com.intellij.psi.PsiFile?)
    <V> -> List<KtSimpleNameExpression>

'usagesByFile' @ [91:42] ==> val usagesByFile: Map<(PsiFile..PsiFile?), List<KtSimpleNameExpression>> defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'usagesInFile' @ [92:17] ==> val usagesInFile: List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'forEach' @ [92:30] ==> @HidesMembers public inline fun <T> Iterable<KtSimpleNameExpression>.forEach(action: (KtSimpleNameExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression

'it' @ [92:40] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'putCopyableUserData' @ [92:43] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(Unit..Unit?)>..Key<(Unit..Unit?)>?), @Nullable p1: Unit?): Unit defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'KEY' @ [92:63] ==> val KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'Unit' @ [92:68] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'mutableListOf' @ [95:39] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<KtImportDirective> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtImportDirective

'usagesInFile' @ [97:39] ==> val usagesInFile: List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'usagesToProcess' @ [98:24] ==> var usagesToProcess: List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [98:40] ==> @InlineOnly public inline fun <T> Collection<KtSimpleNameExpression>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression

'processUsages' @ [99:25] ==> private fun UsageReplacementStrategy.processUsages(usages: List<KtSimpleNameExpression>, targetDeclaration: KtNamedDeclaration?, importsToDelete: MutableList<KtImportDirective>): Boolean defined in org.jetbrains.kotlin.idea.codeInliner[SimpleFunctionDescriptorImpl]

'usagesToProcess' @ [99:39] ==> var usagesToProcess: List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'targetDeclaration' @ [99:56] ==> val targetDeclaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'importsToDelete' @ [99:75] ==> val importsToDelete: MutableList<KtImportDirective> defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'usagesToProcess' @ [102:21] ==> var usagesToProcess: List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'file' @ [102:39] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'collectDescendantsOfType' @ [102:44] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(noinline predicate: (KtSimpleNameExpression) -> Boolean = ...): List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'it' @ [102:95] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getCopyableUserData' @ [102:98] ==> @Nullable @Contract public abstract fun <T : (Any..Any?)> getCopyableUserData(p0: (Key<(Unit..Unit?)>..Key<(Unit..Unit?)>?)): Unit? defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'KEY' @ [102:118] ==> val KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'file' @ [105:17] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'forEachDescendantOfType' @ [105:22] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtSimpleNameExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'it' @ [105:72] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'putCopyableUserData' @ [105:75] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(Unit..Unit?)>..Key<(Unit..Unit?)>?), @Nullable p1: Unit?): Unit defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'KEY' @ [105:95] ==> val KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'importsToDelete' @ [107:17] ==> val importsToDelete: MutableList<KtImportDirective> defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'forEach' @ [107:33] ==> @HidesMembers public inline fun <T> Iterable<KtImportDirective>.forEach(action: (KtImportDirective) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtImportDirective

'it' @ [107:43] ==> value-parameter it: KtImportDirective defined in org.jetbrains.kotlin.idea.codeInliner.replaceUsages.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [107:46] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtImportDirective[JavaMethodDescriptor]

'invoke' @ [110:13] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'NON_MODAL' @ [112:22] ==> @NotNull public final val NON_MODAL: ModalityState defined in com.intellij.openapi.application.ModalityState[JavaPropertyDescriptor]

'usages' @ [124:19] ==> value-parameter usages: List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.codeInliner.processUsages[ValueParameterDescriptorImpl]

'!' @ [126:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'usage' @ [126:18] ==> val usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.processUsages[LocalVariableDescriptor]

'isValid' @ [126:24] ==> public final val KtSimpleNameExpression.isValid: Boolean[MyPropertyDescriptor]

'invalidUsagesFound' @ [127:17] ==> var invalidUsagesFound: Boolean defined in org.jetbrains.kotlin.idea.codeInliner.processUsages[LocalVariableDescriptor]

'specialUsageProcessing' @ [131:17] ==> private fun UsageReplacementStrategy.specialUsageProcessing(usage: KtSimpleNameExpression, targetDeclaration: KtNamedDeclaration?): Boolean defined in org.jetbrains.kotlin.idea.codeInliner in file UsageReplacementStrategy.kt[SimpleFunctionDescriptorImpl]

'usage' @ [131:40] ==> val usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.processUsages[LocalVariableDescriptor]

'targetDeclaration' @ [131:47] ==> value-parameter targetDeclaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.codeInliner.processUsages[ValueParameterDescriptorImpl]

'usage' @ [134:35] ==> val usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.processUsages[LocalVariableDescriptor]

'getStrictParentOfType' @ [134:41] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'importDirective' @ [135:17] ==> val importDirective: KtImportDirective? defined in org.jetbrains.kotlin.idea.codeInliner.processUsages[LocalVariableDescriptor]

'!' @ [136:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'importDirective' @ [136:22] ==> val importDirective: KtImportDirective? defined in org.jetbrains.kotlin.idea.codeInliner.processUsages[LocalVariableDescriptor]

'isAllUnder' @ [136:38] ==> public final val KtImportDirective.isAllUnder: Boolean[MyPropertyDescriptor]

'importDirective' @ [136:52] ==> val importDirective: KtImportDirective? defined in org.jetbrains.kotlin.idea.codeInliner.processUsages[LocalVariableDescriptor]

'targetDescriptors' @ [136:68] ==> public fun KtImportDirective.targetDescriptors(resolutionFacade: ResolutionFacade = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'size' @ [136:88] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'importsToDelete' @ [137:21] ==> value-parameter importsToDelete: MutableList<KtImportDirective> defined in org.jetbrains.kotlin.idea.codeInliner.processUsages[ValueParameterDescriptorImpl]

'add' @ [137:37] ==> public abstract fun add(element: KtImportDirective): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'importDirective' @ [137:41] ==> val importDirective: KtImportDirective? defined in org.jetbrains.kotlin.idea.codeInliner.processUsages[LocalVariableDescriptor]

'createReplacer' @ [142:13] ==> public abstract fun createReplacer(usage: KtSimpleNameExpression): (() -> KtElement?)? defined in org.jetbrains.kotlin.idea.codeInliner.UsageReplacementStrategy[SimpleFunctionDescriptorImpl]

'usage' @ [142:28] ==> val usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.processUsages[LocalVariableDescriptor]

'invoke' @ [142:36] ==> public abstract operator fun invoke(): KtElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'LOG' @ [145:13] ==> private val LOG: Logger defined in org.jetbrains.kotlin.idea.codeInliner in file UsageReplacementStrategy.kt[PropertyDescriptorImpl]

'error' @ [145:17] ==> public open fun error(@NotNull p0: Throwable): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'e' @ [145:23] ==> val e: Throwable defined in org.jetbrains.kotlin.idea.codeInliner.processUsages[LocalVariableDescriptor]

'!' @ [148:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invalidUsagesFound' @ [148:13] ==> var invalidUsagesFound: Boolean defined in org.jetbrains.kotlin.idea.codeInliner.processUsages[LocalVariableDescriptor]

'usage' @ [152:23] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[ValueParameterDescriptorImpl]

'parent' @ [152:29] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (usageParent) {
        is KtCallableReferenceExpression -> {
            val grandParent = usageParent.parent
            ConvertReferenceToLambdaIntention().applyTo(usageParent, null)
            (grandParent as? KtElement)?.let {
                doRefactoringInside(it, targetDeclaration?.name, targetDeclaration?.descriptor)
            }
            return true
        }

        is KtCallElement -> {
            val lambdaArguments = usageParent.lambdaArguments
            if (lambdaArguments.isNotEmpty()) {
                val grandParent = usageParent.parent
                val specifySignature = SpecifyExplicitLambdaSignatureIntention()
                for (lambdaArgument in lambdaArguments) {
                    val lambdaExpression = lambdaArgument.getLambdaExpression()
                    val functionDescriptor =
                            lambdaExpression.functionLiteral.resolveToDescriptorIfAny() as? FunctionDescriptor ?: continue
                    if (functionDescriptor.valueParameters.isNotEmpty()) {
                        specifySignature.applyTo(lambdaExpression, null)
                    }
                }
                (grandParent as? KtElement)?.let {
                    doRefactoringInside(it, targetDeclaration?.name, targetDeclaration?.descriptor)
                }
                return true
            }
        }

    }' @ [153:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'usageParent' @ [153:11] ==> val usageParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[LocalVariableDescriptor]

'usageParent' @ [155:31] ==> val usageParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[LocalVariableDescriptor]

'parent' @ [155:43] ==> public final val KtCallableReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'ConvertReferenceToLambdaIntention' @ [156:13] ==> public constructor ConvertReferenceToLambdaIntention() defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention[ClassConstructorDescriptorImpl]

'applyTo' @ [156:49] ==> public open fun applyTo(element: KtCallableReferenceExpression, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention[SimpleFunctionDescriptorImpl]

'usageParent' @ [156:57] ==> val usageParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[LocalVariableDescriptor]

'grandParent' @ [157:14] ==> val grandParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[LocalVariableDescriptor]

'let' @ [157:42] ==> @InlineOnly public inline fun <T, R> KtElement.let(block: (KtElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> Unit

'doRefactoringInside' @ [158:17] ==> private fun UsageReplacementStrategy.doRefactoringInside(element: KtElement, targetName: String?, targetDescriptor: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.idea.codeInliner in file UsageReplacementStrategy.kt[SimpleFunctionDescriptorImpl]

'it' @ [158:37] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing.<anonymous>[ValueParameterDescriptorImpl]

'targetDeclaration' @ [158:41] ==> value-parameter targetDeclaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[ValueParameterDescriptorImpl]

'name' @ [158:60] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'targetDeclaration' @ [158:66] ==> value-parameter targetDeclaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[ValueParameterDescriptorImpl]

'descriptor' @ [158:85] ==> public val KtDeclaration.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedPropertyDescriptor]

'usageParent' @ [164:35] ==> val usageParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[LocalVariableDescriptor]

'lambdaArguments' @ [164:47] ==> public final val KtCallElement.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'lambdaArguments' @ [165:17] ==> val lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>) defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[LocalVariableDescriptor]

'isNotEmpty' @ [165:33] ==> @InlineOnly public inline fun <T> Collection<(KtLambdaArgument..KtLambdaArgument?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'usageParent' @ [166:35] ==> val usageParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[LocalVariableDescriptor]

'parent' @ [166:47] ==> public final val KtCallElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'SpecifyExplicitLambdaSignatureIntention' @ [167:40] ==> public constructor SpecifyExplicitLambdaSignatureIntention() defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention[ClassConstructorDescriptorImpl]

'lambdaArguments' @ [168:40] ==> val lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>) defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[LocalVariableDescriptor]

'lambdaArgument' @ [169:44] ==> val lambdaArgument: (KtLambdaArgument..KtLambdaArgument?) defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[LocalVariableDescriptor]

'getLambdaExpression' @ [169:59] ==> public open fun getLambdaExpression(): KtLambdaExpression defined in org.jetbrains.kotlin.psi.KtLambdaArgument[DeserializedSimpleFunctionDescriptor]

'lambdaExpression' @ [171:29] ==> val lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[LocalVariableDescriptor]

'functionLiteral' @ [171:46] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'resolveToDescriptorIfAny' @ [171:62] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [172:25] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[LocalVariableDescriptor]

'valueParameters' @ [172:44] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [172:60] ==> @InlineOnly public inline fun <T> Collection<(ValueParameterDescriptor..ValueParameterDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'specifySignature' @ [173:25] ==> val specifySignature: SpecifyExplicitLambdaSignatureIntention defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[LocalVariableDescriptor]

'applyTo' @ [173:42] ==> public open fun applyTo(element: KtLambdaExpression, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention[SimpleFunctionDescriptorImpl]

'lambdaExpression' @ [173:50] ==> val lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[LocalVariableDescriptor]

'grandParent' @ [176:18] ==> val grandParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[LocalVariableDescriptor]

'let' @ [176:46] ==> @InlineOnly public inline fun <T, R> KtElement.let(block: (KtElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> Unit

'doRefactoringInside' @ [177:21] ==> private fun UsageReplacementStrategy.doRefactoringInside(element: KtElement, targetName: String?, targetDescriptor: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.idea.codeInliner in file UsageReplacementStrategy.kt[SimpleFunctionDescriptorImpl]

'it' @ [177:41] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing.<anonymous>[ValueParameterDescriptorImpl]

'targetDeclaration' @ [177:45] ==> value-parameter targetDeclaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[ValueParameterDescriptorImpl]

'name' @ [177:64] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'targetDeclaration' @ [177:70] ==> value-parameter targetDeclaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.codeInliner.specialUsageProcessing[ValueParameterDescriptorImpl]

'descriptor' @ [177:89] ==> public val KtDeclaration.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedPropertyDescriptor]

'element' @ [190:5] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.doRefactoringInside[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [190:13] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtSimpleNameExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'usage' @ [191:13] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.doRefactoringInside.<anonymous>[ValueParameterDescriptorImpl]

'isValid' @ [191:19] ==> public final val KtSimpleNameExpression.isValid: Boolean[MyPropertyDescriptor]

'usage' @ [191:30] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.doRefactoringInside.<anonymous>[ValueParameterDescriptorImpl]

'getReferencedName' @ [191:36] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'targetName' @ [191:59] ==> value-parameter targetName: String? defined in org.jetbrains.kotlin.idea.codeInliner.doRefactoringInside[ValueParameterDescriptorImpl]

'usage' @ [192:27] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.doRefactoringInside.<anonymous>[ValueParameterDescriptorImpl]

'analyze' @ [192:33] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [192:57] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'targetDescriptor' @ [193:17] ==> value-parameter targetDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.codeInliner.doRefactoringInside[ValueParameterDescriptorImpl]

'context' @ [193:37] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.doRefactoringInside.<anonymous>[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [193:60] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'usage' @ [193:78] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.doRefactoringInside.<anonymous>[ValueParameterDescriptorImpl]

'createReplacer' @ [194:17] ==> public abstract fun createReplacer(usage: KtSimpleNameExpression): (() -> KtElement?)? defined in org.jetbrains.kotlin.idea.codeInliner.UsageReplacementStrategy[SimpleFunctionDescriptorImpl]

'usage' @ [194:32] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.doRefactoringInside.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [194:40] ==> public abstract operator fun invoke(): KtElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

