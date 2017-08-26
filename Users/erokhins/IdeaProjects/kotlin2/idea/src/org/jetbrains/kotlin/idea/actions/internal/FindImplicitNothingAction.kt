'AnAction' @ [49:35] ==> public constructor AnAction() defined in com.intellij.openapi.actionSystem.AnAction[JavaClassConstructorDescriptor]

'getInstance' @ [50:30] ==> @NotNull public open fun getInstance(@NotNull @NonNls p0: String): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'selectedKotlinFiles' @ [53:29] ==> private final fun selectedKotlinFiles(e: AnActionEvent): Sequence<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction[SimpleFunctionDescriptorImpl]

'e' @ [53:49] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.actionPerformed[ValueParameterDescriptorImpl]

'toList' @ [53:52] ==> public fun <T> Sequence<KtFile>.toList(): List<KtFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'!!' @ [54:23] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Project?): Project[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Project

'PROJECT' @ [54:38] ==> public final val PROJECT: (DataKey<(Project..Project?)>..DataKey<(Project..Project?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'getData' @ [54:46] ==> @Nullable public open fun getData(@NotNull p0: DataContext): Project? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'e' @ [54:54] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.actionPerformed[ValueParameterDescriptorImpl]

'dataContext' @ [54:56] ==> public final val AnActionEvent.dataContext: DataContext[MyPropertyDescriptor]

'getInstance' @ [56:25] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'runProcessWithProgressSynchronously' @ [56:39] ==> public abstract fun runProcessWithProgressSynchronously(@NotNull p0: Runnable, @NotNull @Nls p1: String, p2: Boolean, @Nullable p3: Project?): Boolean defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'Runnable' @ [57:17] ==> @FunctionalInterface public fun Runnable(function: () -> Unit): Runnable defined in java.lang[SamConstructorDescriptorImpl]

'find' @ [57:28] ==> private final fun find(files: Collection<KtFile>, project: Project): Unit defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction[SimpleFunctionDescriptorImpl]

'selectedFiles' @ [57:33] ==> val selectedFiles: List<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.actionPerformed[LocalVariableDescriptor]

'project' @ [57:48] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.actionPerformed[LocalVariableDescriptor]

'project' @ [60:17] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.actionPerformed[LocalVariableDescriptor]

'getInstance' @ [64:49] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'progressIndicator' @ [64:63] ==> public final val ProgressManager.progressIndicator: (ProgressIndicator..ProgressIndicator?)[MyPropertyDescriptor]

'ArrayList' @ [65:21] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtCallExpression

'component1' @ [66:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [66:18] ==> public final operator fun component2(): KtFile defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'files' @ [66:27] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[ValueParameterDescriptorImpl]

'withIndex' @ [66:33] ==> public fun <T> Iterable<KtFile>.withIndex(): Iterable<IndexedValue<KtFile>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'progressIndicator' @ [67:13] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[LocalVariableDescriptor]

'text' @ [67:32] ==> public final var ProgressIndicator.text: (String..String?)[MyPropertyDescriptor]

'i' @ [67:57] ==> val i: Int defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[LocalVariableDescriptor]

'files' @ [67:64] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[ValueParameterDescriptorImpl]

'size' @ [67:70] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'found' @ [67:84] ==> val found: ArrayList<KtCallExpression> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[LocalVariableDescriptor]

'size' @ [67:90] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'progressIndicator' @ [68:13] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[LocalVariableDescriptor]

'text2' @ [68:32] ==> public final var ProgressIndicator.text2: (String..String?)[MyPropertyDescriptor]

'file' @ [68:40] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[LocalVariableDescriptor]

'virtualFile' @ [68:45] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'path' @ [68:57] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'file' @ [70:36] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[LocalVariableDescriptor]

'getResolutionFacade' @ [70:41] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'file' @ [71:13] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[LocalVariableDescriptor]

'acceptChildren' @ [71:18] ==> public open fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'KtVisitorVoid' @ [71:42] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'checkCanceled' @ [73:37] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'element' @ [74:21] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [74:29] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'this' @ [74:44] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<no name provided>[LazyClassReceiverParameterDescriptor]

'expression' @ [78:21] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'acceptChildren' @ [78:32] ==> public open fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtCallExpression[JavaMethodDescriptor]

'this' @ [78:47] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<no name provided>[LazyClassReceiverParameterDescriptor]

'resolutionFacade' @ [81:46] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[LocalVariableDescriptor]

'analyze' @ [81:63] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'expression' @ [81:71] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'bindingContext' @ [82:36] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'getType' @ [82:51] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'expression' @ [82:59] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'isNothing' @ [83:44] ==> public open fun isNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [83:54] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'!' @ [83:63] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expression' @ [83:64] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'hasExplicitNothing' @ [83:75] ==> private final fun KtExpression.hasExplicitNothing(bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction[SimpleFunctionDescriptorImpl]

'bindingContext' @ [83:94] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'found' @ [84:29] ==> val found: ArrayList<KtCallExpression> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[LocalVariableDescriptor]

'add' @ [84:35] ==> public open fun add(element: KtCallExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expression' @ [84:39] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'e' @ [88:31] ==> val e: ProcessCanceledException defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'LOG' @ [91:25] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction[PropertyDescriptorImpl]

'error' @ [91:29] ==> public open fun error(@NotNull p0: Throwable): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

't' @ [91:35] ==> val t: Throwable defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'progressIndicator' @ [96:13] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[LocalVariableDescriptor]

'fraction' @ [96:32] ==> public final var ProgressIndicator.fraction: Double[MyPropertyDescriptor]

'/' @ [96:43] ==> public final operator fun div(other: Double): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'i' @ [96:44] ==> val i: Int defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[LocalVariableDescriptor]

'files' @ [96:53] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[ValueParameterDescriptorImpl]

'size' @ [96:59] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'toDouble' @ [96:64] ==> public open fun toDouble(): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'invokeLater' @ [99:24] ==> public final fun invokeLater(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javax.swing.SwingUtilities[SamAdapterFunctionDescriptor]

'if (found.isNotEmpty()) {
                val usages = found.map { UsageInfo2UsageAdapter(UsageInfo(it)) }.toTypedArray()
                val presentation = UsageViewPresentation()
                presentation.tabName = "Implicit Nothing's"
                UsageViewManager.getInstance(project).showUsages(arrayOf<UsageTarget>(), usages, presentation)
            }
            else {
                Messages.showInfoMessage(project, "Not found in ${files.size} file(s)", "Not Found")
            }' @ [100:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'found' @ [100:17] ==> val found: ArrayList<KtCallExpression> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[LocalVariableDescriptor]

'isNotEmpty' @ [100:23] ==> @InlineOnly public inline fun <T> Collection<KtCallExpression>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression

'found' @ [101:30] ==> val found: ArrayList<KtCallExpression> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[LocalVariableDescriptor]

'map' @ [101:36] ==> public inline fun <T, R> Iterable<KtCallExpression>.map(transform: (KtCallExpression) -> UsageInfo2UsageAdapter): List<UsageInfo2UsageAdapter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression
    <R> -> UsageInfo2UsageAdapter

'UsageInfo2UsageAdapter' @ [101:42] ==> public constructor UsageInfo2UsageAdapter(@NotNull p0: UsageInfo) defined in com.intellij.usages.UsageInfo2UsageAdapter[JavaClassConstructorDescriptor]

'UsageInfo' @ [101:65] ==> public constructor UsageInfo(@NotNull p0: PsiElement) defined in com.intellij.usageView.UsageInfo[JavaClassConstructorDescriptor]

'it' @ [101:75] ==> value-parameter it: KtCallExpression defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [101:82] ==> public inline fun <reified T> Collection<UsageInfo2UsageAdapter>.toTypedArray(): Array<UsageInfo2UsageAdapter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> UsageInfo2UsageAdapter

'UsageViewPresentation' @ [102:36] ==> public constructor UsageViewPresentation() defined in com.intellij.usages.UsageViewPresentation[JavaClassConstructorDescriptor]

'presentation' @ [103:17] ==> val presentation: UsageViewPresentation defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<anonymous>[LocalVariableDescriptor]

'tabName' @ [103:30] ==> public final var UsageViewPresentation.tabName: (String..String?)[MyPropertyDescriptor]

'getInstance' @ [104:34] ==> public open fun getInstance(p0: (Project..Project?)): (UsageViewManager..UsageViewManager?) defined in com.intellij.usages.UsageViewManager[JavaMethodDescriptor]

'project' @ [104:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[ValueParameterDescriptorImpl]

'showUsages' @ [104:55] ==> @NotNull public abstract fun showUsages(@NotNull p0: (Array<(UsageTarget..UsageTarget?)>..Array<out (UsageTarget..UsageTarget?)>), @NotNull p1: (Array<(Usage..Usage?)>..Array<out (Usage..Usage?)>), @NotNull p2: UsageViewPresentation): UsageView defined in com.intellij.usages.UsageViewManager[JavaMethodDescriptor]

'arrayOf' @ [104:66] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: UsageTarget): Array<UsageTarget> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> UsageTarget

'usages' @ [104:90] ==> val usages: Array<UsageInfo2UsageAdapter> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<anonymous>[LocalVariableDescriptor]

'presentation' @ [104:98] ==> val presentation: UsageViewPresentation defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find.<anonymous>[LocalVariableDescriptor]

'showInfoMessage' @ [107:26] ==> public open fun showInfoMessage(@Nullable p0: Project?, @Nls p1: (String..String?), @NotNull @Nls p2: String): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [107:42] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[ValueParameterDescriptorImpl]

'files' @ [107:67] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.find[ValueParameterDescriptorImpl]

'size' @ [107:73] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'getCalleeExpressionIfAny' @ [113:22] ==> public fun KtElement?.getCalleeExpressionIfAny(): KtExpression? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'when (callee) {
            is KtSimpleNameExpression -> {
                val target = bindingContext[BindingContext.REFERENCE_TARGET, callee] ?: return false
                val callableDescriptor = (target as? CallableDescriptor ?: return false).original
                val declaration = DescriptorToSourceUtils.descriptorToDeclaration(callableDescriptor) as? KtCallableDeclaration
                if (declaration != null && declaration.typeReference == null) return false // implicit type
                val type = callableDescriptor.returnType ?: return false
                return type.isNothingOrNothingFunctionType()
            }

            else -> {
                return callee.hasExplicitNothing(bindingContext)
            }
        }' @ [114:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'callee' @ [114:15] ==> val callee: KtExpression defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.hasExplicitNothing[LocalVariableDescriptor]

'bindingContext' @ [116:30] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.hasExplicitNothing[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [116:60] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'callee' @ [116:78] ==> val callee: KtExpression defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.hasExplicitNothing[LocalVariableDescriptor]

'target' @ [117:43] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.hasExplicitNothing[LocalVariableDescriptor]

'original' @ [117:90] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'DescriptorToSourceUtils' @ [118:35] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [118:59] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'callableDescriptor' @ [118:83] ==> val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.hasExplicitNothing[LocalVariableDescriptor]

'declaration' @ [119:21] ==> val declaration: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.hasExplicitNothing[LocalVariableDescriptor]

'declaration' @ [119:44] ==> val declaration: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.hasExplicitNothing[LocalVariableDescriptor]

'typeReference' @ [119:56] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'callableDescriptor' @ [120:28] ==> val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.hasExplicitNothing[LocalVariableDescriptor]

'returnType' @ [120:47] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'type' @ [121:24] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.hasExplicitNothing[LocalVariableDescriptor]

'isNothingOrNothingFunctionType' @ [121:29] ==> private final fun KotlinType.isNothingOrNothingFunctionType(): Boolean defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction[SimpleFunctionDescriptorImpl]

'callee' @ [125:24] ==> val callee: KtExpression defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.hasExplicitNothing[LocalVariableDescriptor]

'hasExplicitNothing' @ [125:31] ==> private final fun KtExpression.hasExplicitNothing(bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction[SimpleFunctionDescriptorImpl]

'bindingContext' @ [125:50] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.hasExplicitNothing[ValueParameterDescriptorImpl]

'isNothing' @ [131:31] ==> public open fun isNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [131:41] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.isNothingOrNothingFunctionType[ReceiverParameterDescriptorImpl]

'isFunctionType' @ [132:17] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'this' @ [132:35] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.isNothingOrNothingFunctionType[ReceiverParameterDescriptorImpl]

'getReturnTypeFromFunctionType' @ [132:40] ==> public fun KotlinType.getReturnTypeFromFunctionType(): KotlinType defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'isNothingOrNothingFunctionType' @ [132:72] ==> private final fun KotlinType.isNothingOrNothingFunctionType(): Boolean defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction[SimpleFunctionDescriptorImpl]

'if (!KotlinInternalMode.enabled) {
            e.presentation.isVisible = false
            e.presentation.isEnabled = false
        }
        else {
            e.presentation.isVisible = true
            e.presentation.isEnabled = selectedKotlinFiles(e).any()
        }' @ [136:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [136:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'KotlinInternalMode' @ [136:14] ==> public companion object Instance defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode[FakeCallableDescriptorForObject]

'enabled' @ [136:33] ==> public final var enabled: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode.Instance[DeserializedPropertyDescriptor]

'e' @ [137:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.update[ValueParameterDescriptorImpl]

'presentation' @ [137:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isVisible' @ [137:28] ==> public final var Presentation.isVisible: Boolean[MyPropertyDescriptor]

'e' @ [138:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.update[ValueParameterDescriptorImpl]

'presentation' @ [138:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isEnabled' @ [138:28] ==> public final var Presentation.isEnabled: Boolean[MyPropertyDescriptor]

'e' @ [141:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.update[ValueParameterDescriptorImpl]

'presentation' @ [141:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isVisible' @ [141:28] ==> public final var Presentation.isVisible: Boolean[MyPropertyDescriptor]

'e' @ [142:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.update[ValueParameterDescriptorImpl]

'presentation' @ [142:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isEnabled' @ [142:28] ==> public final var Presentation.isEnabled: Boolean[MyPropertyDescriptor]

'selectedKotlinFiles' @ [142:40] ==> private final fun selectedKotlinFiles(e: AnActionEvent): Sequence<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction[SimpleFunctionDescriptorImpl]

'e' @ [142:60] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.update[ValueParameterDescriptorImpl]

'any' @ [142:63] ==> public fun <T> Sequence<KtFile>.any(): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'e' @ [147:28] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.selectedKotlinFiles[ValueParameterDescriptorImpl]

'getData' @ [147:30] ==> @Nullable public open fun <T : (Any..Any?)> getData(@NotNull p0: DataKey<(Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)>): (Array<(VirtualFile..VirtualFile?)>?..Array<out (VirtualFile..VirtualFile?)>?) defined in com.intellij.openapi.actionSystem.AnActionEvent[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Array<(com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)>..kotlin.Array<out (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)>?)

'VIRTUAL_FILE_ARRAY' @ [147:53] ==> public final val VIRTUAL_FILE_ARRAY: (DataKey<(Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)>..DataKey<(Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'sequenceOf' @ [147:83] ==> public fun <T> sequenceOf(vararg elements: KtFile): Sequence<KtFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'?:' @ [148:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Project?, right: Project): Project[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Project

'PROJECT' @ [148:38] ==> public final val PROJECT: (DataKey<(Project..Project?)>..DataKey<(Project..Project?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'getData' @ [148:46] ==> @Nullable public open fun getData(@NotNull p0: DataContext): Project? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'e' @ [148:54] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.selectedKotlinFiles[ValueParameterDescriptorImpl]

'dataContext' @ [148:56] ==> public final val AnActionEvent.dataContext: DataContext[MyPropertyDescriptor]

'sequenceOf' @ [148:79] ==> public fun <T> sequenceOf(vararg elements: KtFile): Sequence<KtFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'allKotlinFiles' @ [149:16] ==> private final fun allKotlinFiles(filesOrDirs: Array<VirtualFile>, project: Project): Sequence<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction[SimpleFunctionDescriptorImpl]

'virtualFiles' @ [149:31] ==> val virtualFiles: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.selectedKotlinFiles[LocalVariableDescriptor]

'project' @ [149:45] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.selectedKotlinFiles[LocalVariableDescriptor]

'getInstance' @ [153:34] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [153:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.allKotlinFiles[ValueParameterDescriptorImpl]

'allFiles' @ [154:16] ==> private final fun allFiles(filesOrDirs: Array<VirtualFile>): Collection<VirtualFile> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction[SimpleFunctionDescriptorImpl]

'filesOrDirs' @ [154:25] ==> value-parameter filesOrDirs: Array<VirtualFile> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.allKotlinFiles[ValueParameterDescriptorImpl]

'asSequence' @ [155:18] ==> public fun <T> Iterable<VirtualFile>.asSequence(): Sequence<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'mapNotNull' @ [156:18] ==> public fun <T, R : Any> Sequence<VirtualFile>.mapNotNull(transform: (VirtualFile) -> KtFile?): Sequence<KtFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R : Any> -> KtFile

'manager' @ [156:31] ==> val manager: PsiManager defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.allKotlinFiles[LocalVariableDescriptor]

'findFile' @ [156:39] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'it' @ [156:48] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.allKotlinFiles.<anonymous>[ValueParameterDescriptorImpl]

'ArrayList' @ [160:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> VirtualFile

'filesOrDirs' @ [161:22] ==> value-parameter filesOrDirs: Array<VirtualFile> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.allFiles[ValueParameterDescriptorImpl]

'visitChildrenRecursively' @ [162:25] ==> @NotNull public open fun visitChildrenRecursively(@NotNull p0: VirtualFile, @NotNull p1: VirtualFileVisitor<*>): VirtualFileVisitor.Result defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'file' @ [162:50] ==> val file: VirtualFile defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.allFiles[LocalVariableDescriptor]

'VirtualFileVisitor<Unit>' @ [162:65] ==> protected/*protected and package*/ constructor VirtualFileVisitor<T : (Any..Any?)>(@NotNull vararg p0: (VirtualFileVisitor.Option..VirtualFileVisitor.Option?)) defined in com.intellij.openapi.vfs.VirtualFileVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'result' @ [164:21] ==> val result: ArrayList<VirtualFile> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.allFiles[LocalVariableDescriptor]

'add' @ [164:28] ==> public open fun add(element: VirtualFile): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'file' @ [164:32] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.allFiles.<no name provided>.visitFile[ValueParameterDescriptorImpl]

'result' @ [169:16] ==> val result: ArrayList<VirtualFile> defined in org.jetbrains.kotlin.idea.actions.internal.FindImplicitNothingAction.allFiles[LocalVariableDescriptor]

