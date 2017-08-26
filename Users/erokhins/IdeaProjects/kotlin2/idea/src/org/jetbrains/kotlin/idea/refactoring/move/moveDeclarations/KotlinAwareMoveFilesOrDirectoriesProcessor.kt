'JvmOverloads' @ [35:50] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'INSTANCE' @ [42:61] ==> public final val INSTANCE: (Runnable..Runnable?) defined in com.intellij.openapi.util.EmptyRunnable[JavaPropertyDescriptor]

'MoveFilesOrDirectoriesProcessor' @ [43:5] ==> public constructor MoveFilesOrDirectoriesProcessor(p0: (Project..Project?), p1: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?), p2: (PsiDirectory..PsiDirectory?), p3: Boolean, p4: Boolean, p5: Boolean, p6: (MoveCallback..MoveCallback?), p7: (Runnable..Runnable?)) defined in com.intellij.refactoring.move.moveFilesOrDirectories.MoveFilesOrDirectoriesProcessor[JavaClassConstructorDescriptor]

'project' @ [43:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.<init>[ValueParameterDescriptorImpl]

'elementsToMove' @ [44:37] ==> value-parameter elementsToMove: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.<init>[ValueParameterDescriptorImpl]

'toTypedArray' @ [44:52] ==> public inline fun <reified T> Collection<PsiElement>.toTypedArray(): Array<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiElement

'targetDirectory' @ [45:37] ==> value-parameter targetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.<init>[ValueParameterDescriptorImpl]

'searchInComments' @ [47:37] ==> value-parameter searchInComments: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.<init>[ValueParameterDescriptorImpl]

'searchInNonJavaFiles' @ [48:37] ==> value-parameter searchInNonJavaFiles: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.<init>[ValueParameterDescriptorImpl]

'moveCallback' @ [49:37] ==> value-parameter moveCallback: MoveCallback? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.<init>[ValueParameterDescriptorImpl]

'prepareSuccessfulCallback' @ [50:37] ==> value-parameter prepareSuccessfulCallback: Runnable = ... defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.<init>[ValueParameterDescriptorImpl]

'MoveFilesWithDeclarationsViewDescriptor' @ [52:16] ==> public constructor MoveFilesWithDeclarationsViewDescriptor(myElementsToMove: Array<PsiElement>, newParent: PsiDirectory) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor[ClassConstructorDescriptorImpl]

'elementsToMove' @ [52:56] ==> private final val elementsToMove: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor[PropertyDescriptorImpl]

'toTypedArray' @ [52:71] ==> public inline fun <reified T> Collection<PsiElement>.toTypedArray(): Array<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiElement

'targetDirectory' @ [52:99] ==> private final val targetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor[PropertyDescriptorImpl]

'markScopeToMove' @ [57:13] ==> private final fun markScopeToMove(allElementsToMove: List<PsiElement>?): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor[SimpleFunctionDescriptorImpl]

'elementsToMove' @ [57:29] ==> private final val elementsToMove: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor[PropertyDescriptorImpl]

'super' @ [58:20] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor[LazyClassReceiverParameterDescriptor]

'findUsages' @ [58:26] ==> @NotNull protected/*protected and package*/ open fun findUsages(): (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>) defined in com.intellij.refactoring.move.moveFilesOrDirectories.MoveFilesOrDirectoriesProcessor[JavaMethodDescriptor]

'markScopeToMove' @ [61:13] ==> private final fun markScopeToMove(allElementsToMove: List<PsiElement>?): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor[SimpleFunctionDescriptorImpl]

'refUsages' @ [66:22] ==> value-parameter refUsages: Ref<Array<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.preprocessUsages[ValueParameterDescriptorImpl]

'get' @ [66:32] ==> public final fun get(): (Array<UsageInfo>..Array<UsageInfo>?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'component1' @ [68:14] ==> public final operator fun component1(): List<UsageInfo> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [68:30] ==> public final operator fun component2(): List<UsageInfo> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'usages' @ [68:49] ==> val usages: (Array<UsageInfo>..Array<UsageInfo>?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.preprocessUsages[LocalVariableDescriptor]

'partition' @ [68:56] ==> public inline fun <T> Array<out UsageInfo>.partition(predicate: (UsageInfo) -> Boolean): Pair<List<UsageInfo>, List<UsageInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'it' @ [68:68] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.preprocessUsages.<anonymous>[ValueParameterDescriptorImpl]

'MultiMap' @ [70:25] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> String

'conflictUsages' @ [71:31] ==> val conflictUsages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.preprocessUsages[LocalVariableDescriptor]

'conflicts' @ [72:13] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.preprocessUsages[LocalVariableDescriptor]

'putValues' @ [72:23] ==> public open fun putValues(p0: (PsiElement..PsiElement?), @NotNull p1: (MutableCollection<out (String..String?)>..Collection<(String..String?)>)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'conflictUsage' @ [72:33] ==> val conflictUsage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.preprocessUsages[LocalVariableDescriptor]

'element' @ [72:47] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'conflictUsage' @ [72:57] ==> val conflictUsage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.preprocessUsages[LocalVariableDescriptor]

'messages' @ [72:93] ==> public final val messages: Collection<String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ConflictUsageInfo[PropertyDescriptorImpl]

'refUsages' @ [75:9] ==> value-parameter refUsages: Ref<Array<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.preprocessUsages[ValueParameterDescriptorImpl]

'set' @ [75:19] ==> public final fun set(@Nullable p0: Array<UsageInfo>?): Unit defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'usagesToProcess' @ [75:23] ==> val usagesToProcess: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.preprocessUsages[LocalVariableDescriptor]

'toTypedArray' @ [75:39] ==> public inline fun <reified T> Collection<UsageInfo>.toTypedArray(): Array<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> UsageInfo

'showConflicts' @ [77:16] ==> protected/*protected and package*/ open fun showConflicts(@NotNull p0: MultiMap<(PsiElement..PsiElement?), (String..String?)>, @Nullable p1: (Array<(UsageInfo..UsageInfo?)>?..Array<out (UsageInfo..UsageInfo?)>?)): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor[JavaMethodDescriptor]

'conflicts' @ [77:30] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.preprocessUsages[LocalVariableDescriptor]

'usages' @ [77:41] ==> val usages: (Array<UsageInfo>..Array<UsageInfo>?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.preprocessUsages[LocalVariableDescriptor]

'when (this) {
                is PsiFile -> mark()
                is PsiDirectory -> children.forEach { it.doMark(mark) }
            }' @ [82:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'this' @ [82:19] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.markPsiFiles.doMark[ReceiverParameterDescriptorImpl]

'invoke' @ [83:31] ==> public abstract operator fun PsiFile.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'children' @ [84:36] ==> public final val PsiDirectory.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'forEach' @ [84:45] ==> public inline fun <T> Array<out (PsiElement..PsiElement?)>.forEach(action: ((PsiElement..PsiElement?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [84:55] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.markPsiFiles.doMark.<anonymous>[ValueParameterDescriptorImpl]

'doMark' @ [84:58] ==> local final fun PsiElement.doMark(mark: PsiFile.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.markPsiFiles[SimpleFunctionDescriptorImpl]

'mark' @ [84:65] ==> value-parameter mark: PsiFile.() -> Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.markPsiFiles.doMark[ValueParameterDescriptorImpl]

'elementsToMove' @ [88:9] ==> private final val elementsToMove: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor[PropertyDescriptorImpl]

'forEach' @ [88:24] ==> @HidesMembers public inline fun <T> Iterable<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [88:34] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.markPsiFiles.<anonymous>[ValueParameterDescriptorImpl]

'doMark' @ [88:37] ==> local final fun PsiElement.doMark(mark: PsiFile.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.markPsiFiles[SimpleFunctionDescriptorImpl]

'mark' @ [88:44] ==> value-parameter mark: PsiFile.() -> Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.markPsiFiles[ValueParameterDescriptorImpl]

'markPsiFiles' @ [92:9] ==> private final fun markPsiFiles(mark: PsiFile.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor[SimpleFunctionDescriptorImpl]

'this' @ [92:25] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.markShouldFixFqName.<anonymous>[ReceiverParameterDescriptorImpl]

'shouldFixFqName' @ [92:48] ==> internal var PsiJavaFile.shouldFixFqName: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories in file FqNameFixingMoveJavaFIleHandler.kt[PropertyDescriptorImpl]

'value' @ [92:66] ==> value-parameter value: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.markShouldFixFqName[ValueParameterDescriptorImpl]

'markPsiFiles' @ [96:9] ==> private final fun markPsiFiles(mark: PsiFile.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor[SimpleFunctionDescriptorImpl]

'this' @ [96:25] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.markScopeToMove.<anonymous>[ReceiverParameterDescriptorImpl]

'allElementsToMove' @ [96:43] ==> internal var KtFile.allElementsToMove: List<PsiElement>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories in file MoveKotlinFileHandler.kt[PropertyDescriptorImpl]

'allElementsToMove' @ [96:63] ==> value-parameter allElementsToMove: List<PsiElement>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.markScopeToMove[ValueParameterDescriptorImpl]

'markShouldFixFqName' @ [101:13] ==> private final fun markShouldFixFqName(value: Boolean): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor[SimpleFunctionDescriptorImpl]

'super' @ [102:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor[LazyClassReceiverParameterDescriptor]

'performRefactoring' @ [102:19] ==> protected/*protected and package*/ open fun performRefactoring(@NotNull p0: (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>)): Unit defined in com.intellij.refactoring.move.moveFilesOrDirectories.MoveFilesOrDirectoriesProcessor[JavaMethodDescriptor]

'usages' @ [102:38] ==> value-parameter usages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor.performRefactoring[ValueParameterDescriptorImpl]

'markShouldFixFqName' @ [105:13] ==> private final fun markShouldFixFqName(value: Boolean): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor[SimpleFunctionDescriptorImpl]

