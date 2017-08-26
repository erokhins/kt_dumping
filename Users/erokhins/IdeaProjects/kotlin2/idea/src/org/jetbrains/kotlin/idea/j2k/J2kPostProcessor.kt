'getApplication' @ [45:28] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'invokeAndWait' @ [45:45] ==> public final fun invokeAndWait(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'runWriteAction' @ [46:13] ==> public fun <T> runWriteAction(action: () -> ImportDescriptorResult?): ImportDescriptorResult? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportDescriptorResult?

'file' @ [47:35] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.insertImport[ValueParameterDescriptorImpl]

'resolveImportReference' @ [47:40] ==> public fun KtFile.resolveImportReference(fqName: FqName): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'fqName' @ [47:63] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.insertImport[ValueParameterDescriptorImpl]

'descriptors' @ [48:17] ==> val descriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.insertImport.<anonymous>.<anonymous>[LocalVariableDescriptor]

'firstOrNull' @ [48:29] ==> public fun <T> Iterable<DeclarationDescriptor>.firstOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'let' @ [48:44] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> ImportDescriptorResult): ImportDescriptorResult defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> ImportDescriptorResult

'ImportInsertHelper' @ [48:50] ==> public companion object defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[FakeCallableDescriptorForObject]

'getInstance' @ [48:69] ==> @JvmStatic public final fun getInstance(project: Project): ImportInsertHelper defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper.Companion[DeserializedSimpleFunctionDescriptor]

'file' @ [48:81] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.insertImport[ValueParameterDescriptorImpl]

'project' @ [48:86] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'importDescriptor' @ [48:95] ==> public abstract fun importDescriptor(file: KtFile, descriptor: DeclarationDescriptor, forceAllUnderImport: Boolean = ...): ImportDescriptorResult defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[DeserializedSimpleFunctionDescriptor]

'file' @ [48:112] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.insertImport[ValueParameterDescriptorImpl]

'it' @ [48:118] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.insertImport.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'runBlocking' @ [60:13] ==> public fun <T> runBlocking(context: CoroutineContext = ..., block: suspend CoroutineScope.() -> Unit): Unit defined in kotlinx.coroutines.experimental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'ModalityStateElement' @ [60:29] ==> public constructor ModalityStateElement(modalityState: ModalityState) defined in org.jetbrains.kotlin.idea.core.util.EDT.ModalityStateElement[DeserializedClassConstructorDescriptor]

'defaultModalityState' @ [60:64] ==> @NotNull public open fun defaultModalityState(): ModalityState defined in com.intellij.openapi.application.ModalityState[JavaMethodDescriptor]

'file' @ [62:52] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing[ValueParameterDescriptorImpl]

'modificationStamp' @ [62:57] ==> public final val KtFile.modificationStamp: Long[MyPropertyDescriptor]

'runReadAction' @ [63:44] ==> public fun <T> runReadAction(action: () -> List<J2kPostProcessor.ActionData>): List<J2kPostProcessor.ActionData> defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<ActionData>

'collectAvailableActions' @ [64:25] ==> private final fun collectAvailableActions(file: KtFile, rangeMarker: RangeMarker?): List<J2kPostProcessor.ActionData> defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor[SimpleFunctionDescriptorImpl]

'file' @ [64:49] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing[ValueParameterDescriptorImpl]

'rangeMarker' @ [64:55] ==> value-parameter rangeMarker: RangeMarker? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing[ValueParameterDescriptorImpl]

'run' @ [67:21] ==> public suspend fun <T> run(context: CoroutineContext, block: suspend () -> Unit): Unit defined in kotlinx.coroutines.experimental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'EDT' @ [67:25] ==> public object EDT : CoroutineDispatcher defined in org.jetbrains.kotlin.idea.core.util[FakeCallableDescriptorForObject]

'component1' @ [68:31] ==> public final operator fun component1(): KtElement defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.ActionData[SimpleFunctionDescriptorImpl]

'component2' @ [68:40] ==> public final operator fun component2(): () -> Unit defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.ActionData[SimpleFunctionDescriptorImpl]

'component3' @ [68:48] ==> public final operator fun component3(): Int defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.ActionData[SimpleFunctionDescriptorImpl]

'component4' @ [68:51] ==> public final operator fun component4(): Boolean defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.ActionData[SimpleFunctionDescriptorImpl]

'elementToActions' @ [68:73] ==> val elementToActions: List<J2kPostProcessor.ActionData> defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing.<anonymous>[LocalVariableDescriptor]

'if (element.isValid) {
                                if (writeActionNeeded) {
                                    runWriteAction {
                                        action()
                                    }
                                }
                                else {
                                    action()
                                }
                            }
                            else {
                                modificationStamp = null
                            }' @ [69:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'element' @ [69:33] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isValid' @ [69:41] ==> public final val KtElement.isValid: Boolean[MyPropertyDescriptor]

'if (writeActionNeeded) {
                                    runWriteAction {
                                        action()
                                    }
                                }
                                else {
                                    action()
                                }' @ [70:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'writeActionNeeded' @ [70:37] ==> val writeActionNeeded: Boolean defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing.<anonymous>.<anonymous>[LocalVariableDescriptor]

'runWriteAction' @ [71:37] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'invoke' @ [72:41] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'invoke' @ [76:37] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'modificationStamp' @ [80:33] ==> var modificationStamp: Long? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing.<anonymous>[LocalVariableDescriptor]

'modificationStamp' @ [85:25] ==> var modificationStamp: Long? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing.<anonymous>[LocalVariableDescriptor]

'file' @ [85:46] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing[ValueParameterDescriptorImpl]

'modificationStamp' @ [85:51] ==> public final val KtFile.modificationStamp: Long[MyPropertyDescriptor]

'elementToActions' @ [87:24] ==> val elementToActions: List<J2kPostProcessor.ActionData> defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [87:41] ==> @InlineOnly public inline fun <T> Collection<J2kPostProcessor.ActionData>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ActionData

'formatCode' @ [90:21] ==> private final val formatCode: Boolean defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor[PropertyDescriptorImpl]

'run' @ [91:21] ==> public suspend fun <T> run(context: CoroutineContext, block: suspend () -> Unit): Unit defined in kotlinx.coroutines.experimental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'EDT' @ [91:25] ==> public object EDT : CoroutineDispatcher defined in org.jetbrains.kotlin.idea.core.util[FakeCallableDescriptorForObject]

'runWriteAction' @ [92:25] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'getInstance' @ [93:69] ==> public open fun getInstance(@NotNull p0: Project): (CodeStyleManager..CodeStyleManager?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'file' @ [93:81] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing[ValueParameterDescriptorImpl]

'project' @ [93:86] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'if (rangeMarker != null) {
                                if (rangeMarker.isValid) {
                                    codeStyleManager.reformatRange(file, rangeMarker.startOffset, rangeMarker.endOffset)
                                }
                            }
                            else {
                                codeStyleManager.reformat(file)
                            }' @ [94:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'rangeMarker' @ [94:33] ==> value-parameter rangeMarker: RangeMarker? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing[ValueParameterDescriptorImpl]

'rangeMarker' @ [95:37] ==> value-parameter rangeMarker: RangeMarker? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing[ValueParameterDescriptorImpl]

'isValid' @ [95:49] ==> public final val RangeMarker.isValid: Boolean[MyPropertyDescriptor]

'codeStyleManager' @ [96:37] ==> val codeStyleManager: (CodeStyleManager..CodeStyleManager?) defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'reformatRange' @ [96:54] ==> public abstract fun reformatRange(@NotNull p0: PsiElement, p1: Int, p2: Int): (PsiElement..PsiElement?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'file' @ [96:68] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing[ValueParameterDescriptorImpl]

'rangeMarker' @ [96:74] ==> value-parameter rangeMarker: RangeMarker? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing[ValueParameterDescriptorImpl]

'startOffset' @ [96:86] ==> public final val RangeMarker.startOffset: Int[MyPropertyDescriptor]

'rangeMarker' @ [96:99] ==> value-parameter rangeMarker: RangeMarker? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing[ValueParameterDescriptorImpl]

'endOffset' @ [96:111] ==> public final val RangeMarker.endOffset: Int[MyPropertyDescriptor]

'codeStyleManager' @ [100:33] ==> val codeStyleManager: (CodeStyleManager..CodeStyleManager?) defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'reformat' @ [100:50] ==> @NotNull public abstract fun reformat(@NotNull p0: PsiElement): PsiElement defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'file' @ [100:59] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.doAdditionalProcessing[ValueParameterDescriptorImpl]

'Unit' @ [102:29] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'analyzeFileRange' @ [112:27] ==> private final fun analyzeFileRange(file: KtFile, rangeMarker: RangeMarker?): Diagnostics defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor[SimpleFunctionDescriptorImpl]

'file' @ [112:44] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions[ValueParameterDescriptorImpl]

'rangeMarker' @ [112:50] ==> value-parameter rangeMarker: RangeMarker? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions[ValueParameterDescriptorImpl]

'ArrayList' @ [114:32] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ActionData

'file' @ [116:9] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions[ValueParameterDescriptorImpl]

'accept' @ [116:14] ==> public open fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'PsiRecursiveElementVisitor' @ [116:30] ==> protected/*protected and package*/ constructor PsiRecursiveElementVisitor() defined in com.intellij.psi.PsiRecursiveElementVisitor[JavaClassConstructorDescriptor]

'element' @ [118:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'rangeFilter' @ [119:39] ==> private final fun rangeFilter(element: PsiElement, rangeMarker: RangeMarker?): J2kPostProcessor.RangeFilterResult defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor[SimpleFunctionDescriptorImpl]

'element' @ [119:51] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'rangeMarker' @ [119:60] ==> value-parameter rangeMarker: RangeMarker? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions[ValueParameterDescriptorImpl]

'rangeResult' @ [120:25] ==> val rangeResult: J2kPostProcessor.RangeFilterResult defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions.<no name provided>.visitElement[LocalVariableDescriptor]

'SKIP' @ [120:58] ==> enum entry SKIP defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.RangeFilterResult[FakeCallableDescriptorForObject]

'super' @ [122:21] ==> <this> defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitElement' @ [122:27] ==> public open fun visitElement(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiRecursiveElementVisitor[JavaMethodDescriptor]

'element' @ [122:40] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'rangeResult' @ [124:25] ==> val rangeResult: J2kPostProcessor.RangeFilterResult defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions.<no name provided>.visitElement[LocalVariableDescriptor]

'PROCESS' @ [124:58] ==> enum entry PROCESS defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.RangeFilterResult[FakeCallableDescriptorForObject]

'J2KPostProcessingRegistrar' @ [125:25] ==> public object J2KPostProcessingRegistrar defined in org.jetbrains.kotlin.idea.j2k in file J2kPostProcessings.kt[FakeCallableDescriptorForObject]

'processings' @ [125:52] ==> public final val processings: Collection<J2kPostProcessing> defined in org.jetbrains.kotlin.idea.j2k.J2KPostProcessingRegistrar[PropertyDescriptorImpl]

'forEach' @ [125:64] ==> @HidesMembers public inline fun <T> Iterable<J2kPostProcessing>.forEach(action: (J2kPostProcessing) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> J2kPostProcessing

'processing' @ [126:42] ==> value-parameter processing: J2kPostProcessing defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions.<no name provided>.visitElement.<anonymous>[ValueParameterDescriptorImpl]

'createAction' @ [126:53] ==> public abstract fun createAction(element: KtElement, diagnostics: Diagnostics): (() -> Unit)? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessing[SimpleFunctionDescriptorImpl]

'element' @ [126:66] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'diagnostics' @ [126:75] ==> val diagnostics: Diagnostics defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions[LocalVariableDescriptor]

'action' @ [127:33] ==> val action: (() -> Unit)? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions.<no name provided>.visitElement.<anonymous>[LocalVariableDescriptor]

'availableActions' @ [128:33] ==> val availableActions: ArrayList<J2kPostProcessor.ActionData> defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions[LocalVariableDescriptor]

'add' @ [128:50] ==> public open fun add(element: J2kPostProcessor.ActionData): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ActionData' @ [128:54] ==> public constructor ActionData(element: KtElement, action: () -> Unit, priority: Int, writeActionNeeded: Boolean) defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.ActionData[ClassConstructorDescriptorImpl]

'element' @ [128:65] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'action' @ [128:74] ==> val action: (() -> Unit)? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions.<no name provided>.visitElement.<anonymous>[LocalVariableDescriptor]

'priority' @ [129:92] ==> public final fun priority(processing: J2kPostProcessing): Int defined in org.jetbrains.kotlin.idea.j2k.J2KPostProcessingRegistrar[SimpleFunctionDescriptorImpl]

'processing' @ [129:101] ==> value-parameter processing: J2kPostProcessing defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions.<no name provided>.visitElement.<anonymous>[ValueParameterDescriptorImpl]

'processing' @ [130:65] ==> value-parameter processing: J2kPostProcessing defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions.<no name provided>.visitElement.<anonymous>[ValueParameterDescriptorImpl]

'writeActionNeeded' @ [130:76] ==> public abstract val writeActionNeeded: Boolean defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessing[PropertyDescriptorImpl]

'availableActions' @ [137:9] ==> val availableActions: ArrayList<J2kPostProcessor.ActionData> defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions[LocalVariableDescriptor]

'sortBy' @ [137:26] ==> public inline fun <T, R : Comparable<Int>> MutableList<J2kPostProcessor.ActionData>.sortBy(crossinline selector: (J2kPostProcessor.ActionData) -> Int?): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ActionData
    <R : Comparable<R>> -> Int

'it' @ [137:35] ==> value-parameter it: J2kPostProcessor.ActionData defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions.<anonymous>[ValueParameterDescriptorImpl]

'priority' @ [137:38] ==> public final val priority: Int defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.ActionData[PropertyDescriptorImpl]

'availableActions' @ [138:16] ==> val availableActions: ArrayList<J2kPostProcessor.ActionData> defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.collectAvailableActions[LocalVariableDescriptor]

'if (rangeMarker == null)
            listOf(file)
        else
            file.elementsInRange(rangeMarker.range!!).filterIsInstance<KtElement>()' @ [142:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<KtElement>, elseBranch: List<KtElement>): List<KtElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<KtElement>

'rangeMarker' @ [142:28] ==> value-parameter rangeMarker: RangeMarker? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.analyzeFileRange[ValueParameterDescriptorImpl]

'listOf' @ [143:13] ==> public fun <T> listOf(element: KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'file' @ [143:20] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.analyzeFileRange[ValueParameterDescriptorImpl]

'file' @ [145:13] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.analyzeFileRange[ValueParameterDescriptorImpl]

'elementsInRange' @ [145:18] ==> public fun PsiFile.elementsInRange(range: TextRange): List<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'rangeMarker' @ [145:34] ==> value-parameter rangeMarker: RangeMarker? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.analyzeFileRange[ValueParameterDescriptorImpl]

'range' @ [145:46] ==> public val RangeMarker.range: TextRange? defined in org.jetbrains.kotlin.idea.conversion.copy in file RangeUtils.kt[PropertyDescriptorImpl]

'filterIsInstance' @ [145:55] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtElement

'if (elements.isNotEmpty())
            file.getResolutionFacade().analyzeFullyAndGetResult(elements).bindingContext.diagnostics
        else
            Diagnostics.EMPTY' @ [147:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Diagnostics, elseBranch: Diagnostics): Diagnostics[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Diagnostics

'elements' @ [147:20] ==> val elements: List<KtElement> defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.analyzeFileRange[LocalVariableDescriptor]

'isNotEmpty' @ [147:29] ==> @InlineOnly public inline fun <T> Collection<KtElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'file' @ [148:13] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.analyzeFileRange[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [148:18] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'analyzeFullyAndGetResult' @ [148:40] ==> public abstract fun analyzeFullyAndGetResult(elements: Collection<KtElement>): AnalysisResult defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'elements' @ [148:65] ==> val elements: List<KtElement> defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.analyzeFileRange[LocalVariableDescriptor]

'bindingContext' @ [148:75] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'diagnostics' @ [148:90] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'EMPTY' @ [150:25] ==> public final val EMPTY: Diagnostics defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics.Companion[DeserializedPropertyDescriptor]

'rangeMarker' @ [154:13] ==> value-parameter rangeMarker: RangeMarker? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.rangeFilter[ValueParameterDescriptorImpl]

'PROCESS' @ [154:59] ==> enum entry PROCESS defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.RangeFilterResult[FakeCallableDescriptorForObject]

'!' @ [155:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'rangeMarker' @ [155:14] ==> value-parameter rangeMarker: RangeMarker? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.rangeFilter[ValueParameterDescriptorImpl]

'isValid' @ [155:26] ==> public final val RangeMarker.isValid: Boolean[MyPropertyDescriptor]

'SKIP' @ [155:60] ==> enum entry SKIP defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.RangeFilterResult[FakeCallableDescriptorForObject]

'TextRange' @ [156:21] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'rangeMarker' @ [156:31] ==> value-parameter rangeMarker: RangeMarker? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.rangeFilter[ValueParameterDescriptorImpl]

'startOffset' @ [156:43] ==> public final val RangeMarker.startOffset: Int[MyPropertyDescriptor]

'rangeMarker' @ [156:56] ==> value-parameter rangeMarker: RangeMarker? defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.rangeFilter[ValueParameterDescriptorImpl]

'endOffset' @ [156:68] ==> public final val RangeMarker.endOffset: Int[MyPropertyDescriptor]

'element' @ [157:28] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.rangeFilter[ValueParameterDescriptorImpl]

'textRange' @ [157:36] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'when {
            range.contains(elementRange) -> RangeFilterResult.PROCESS
            range.intersects(elementRange) -> RangeFilterResult.GO_INSIDE
            else -> RangeFilterResult.SKIP
        }' @ [158:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: J2kPostProcessor.RangeFilterResult, entry1: J2kPostProcessor.RangeFilterResult, entry2: J2kPostProcessor.RangeFilterResult): J2kPostProcessor.RangeFilterResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> RangeFilterResult

'range' @ [159:13] ==> val range: TextRange defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.rangeFilter[LocalVariableDescriptor]

'contains' @ [159:19] ==> public open operator fun contains(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'elementRange' @ [159:28] ==> val elementRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.rangeFilter[LocalVariableDescriptor]

'PROCESS' @ [159:63] ==> enum entry PROCESS defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.RangeFilterResult[FakeCallableDescriptorForObject]

'range' @ [160:13] ==> val range: TextRange defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.rangeFilter[LocalVariableDescriptor]

'intersects' @ [160:19] ==> public open fun intersects(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'elementRange' @ [160:30] ==> val elementRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.rangeFilter[LocalVariableDescriptor]

'GO_INSIDE' @ [160:65] ==> enum entry GO_INSIDE defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.RangeFilterResult[FakeCallableDescriptorForObject]

'SKIP' @ [161:39] ==> enum entry SKIP defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor.RangeFilterResult[FakeCallableDescriptorForObject]

