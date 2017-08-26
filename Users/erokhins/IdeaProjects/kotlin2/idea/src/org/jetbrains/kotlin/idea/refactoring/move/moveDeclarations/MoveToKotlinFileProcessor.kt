'JvmOverloads' @ [32:33] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'INSTANCE' @ [40:61] ==> public final val INSTANCE: (Runnable..Runnable?) defined in com.intellij.openapi.util.EmptyRunnable[JavaPropertyDescriptor]

'MoveFilesOrDirectoriesProcessor' @ [41:5] ==> public constructor MoveFilesOrDirectoriesProcessor(p0: (Project..Project?), p1: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?), p2: (PsiDirectory..PsiDirectory?), p3: Boolean, p4: Boolean, p5: Boolean, p6: (MoveCallback..MoveCallback?), p7: (Runnable..Runnable?)) defined in com.intellij.refactoring.move.moveFilesOrDirectories.MoveFilesOrDirectoriesProcessor[JavaClassConstructorDescriptor]

'project' @ [41:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.<init>[ValueParameterDescriptorImpl]

'arrayOf' @ [42:37] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KtFile): Array<KtFile> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KtFile

'sourceFile' @ [42:45] ==> value-parameter sourceFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.<init>[ValueParameterDescriptorImpl]

'targetDirectory' @ [43:37] ==> value-parameter targetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.<init>[ValueParameterDescriptorImpl]

'searchInComments' @ [45:37] ==> value-parameter searchInComments: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.<init>[ValueParameterDescriptorImpl]

'searchInNonJavaFiles' @ [46:37] ==> value-parameter searchInNonJavaFiles: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.<init>[ValueParameterDescriptorImpl]

'moveCallback' @ [47:37] ==> value-parameter moveCallback: MoveCallback? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.<init>[ValueParameterDescriptorImpl]

'prepareSuccessfulCallback' @ [48:37] ==> value-parameter prepareSuccessfulCallback: Runnable = ... defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.<init>[ValueParameterDescriptorImpl]

'sourceFile' @ [49:45] ==> private final val sourceFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor[PropertyDescriptorImpl]

'name' @ [49:56] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'MoveFilesWithDeclarationsViewDescriptor' @ [52:16] ==> public constructor MoveFilesWithDeclarationsViewDescriptor(myElementsToMove: Array<PsiElement>, newParent: PsiDirectory) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor[ClassConstructorDescriptorImpl]

'arrayOf' @ [52:56] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'sourceFile' @ [52:64] ==> private final val sourceFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor[PropertyDescriptorImpl]

'targetDirectory' @ [52:77] ==> private final val targetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor[PropertyDescriptorImpl]

'refUsages' @ [56:22] ==> value-parameter refUsages: Ref<Array<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.preprocessUsages[ValueParameterDescriptorImpl]

'get' @ [56:32] ==> public final fun get(): (Array<UsageInfo>..Array<UsageInfo>?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'component1' @ [58:14] ==> public final operator fun component1(): List<UsageInfo> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [58:30] ==> public final operator fun component2(): List<UsageInfo> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'usages' @ [58:49] ==> val usages: (Array<UsageInfo>..Array<UsageInfo>?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.preprocessUsages[LocalVariableDescriptor]

'partition' @ [58:56] ==> public inline fun <T> Array<out UsageInfo>.partition(predicate: (UsageInfo) -> Boolean): Pair<List<UsageInfo>, List<UsageInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'it' @ [58:68] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.preprocessUsages.<anonymous>[ValueParameterDescriptorImpl]

'MultiMap' @ [60:25] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> String

'conflictUsages' @ [61:31] ==> val conflictUsages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.preprocessUsages[LocalVariableDescriptor]

'conflicts' @ [62:13] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.preprocessUsages[LocalVariableDescriptor]

'putValues' @ [62:23] ==> public open fun putValues(p0: (PsiElement..PsiElement?), @NotNull p1: (MutableCollection<out (String..String?)>..Collection<(String..String?)>)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'conflictUsage' @ [62:33] ==> val conflictUsage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.preprocessUsages[LocalVariableDescriptor]

'element' @ [62:47] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'conflictUsage' @ [62:57] ==> val conflictUsage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.preprocessUsages[LocalVariableDescriptor]

'messages' @ [62:93] ==> public final val messages: Collection<String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ConflictUsageInfo[PropertyDescriptorImpl]

'refUsages' @ [65:9] ==> value-parameter refUsages: Ref<Array<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.preprocessUsages[ValueParameterDescriptorImpl]

'set' @ [65:19] ==> public final fun set(@Nullable p0: Array<UsageInfo>?): Unit defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'usagesToProcess' @ [65:23] ==> val usagesToProcess: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.preprocessUsages[LocalVariableDescriptor]

'toTypedArray' @ [65:39] ==> public inline fun <reified T> Collection<UsageInfo>.toTypedArray(): Array<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> UsageInfo

'showConflicts' @ [67:16] ==> protected/*protected and package*/ open fun showConflicts(@NotNull p0: MultiMap<(PsiElement..PsiElement?), (String..String?)>, @Nullable p1: (Array<(UsageInfo..UsageInfo?)>?..Array<out (UsageInfo..UsageInfo?)>?)): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor[JavaMethodDescriptor]

'conflicts' @ [67:30] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.preprocessUsages[LocalVariableDescriptor]

'usages' @ [67:41] ==> val usages: (Array<UsageInfo>..Array<UsageInfo>?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.preprocessUsages[LocalVariableDescriptor]

'targetDirectory' @ [72:13] ==> private final val targetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor[PropertyDescriptorImpl]

'findFile' @ [72:29] ==> @Nullable public abstract fun findFile(@NotNull @NonNls p0: String): PsiFile? defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'targetFileName' @ [72:38] ==> private final val targetFileName: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor[PropertyDescriptorImpl]

'generateUniqueName' @ [74:49] ==> @NotNull public final fun generateUniqueName(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: (((String..String?)) -> Boolean..(((String..String?)) -> Boolean)?)): String defined in com.intellij.util.text.UniqueNameGenerator[SamAdapterFunctionDescriptor]

'sourceFile' @ [75:13] ==> private final val sourceFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor[PropertyDescriptorImpl]

'containingDirectory' @ [75:24] ==> public final val KtFile.containingDirectory: PsiDirectory?[MyPropertyDescriptor]

'findFile' @ [75:46] ==> @Nullable public abstract fun findFile(@NotNull @NonNls p0: String): PsiFile? defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'it' @ [75:55] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.renameFileTemporarily.<anonymous>[ValueParameterDescriptorImpl]

'sourceFile' @ [77:9] ==> private final val sourceFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor[PropertyDescriptorImpl]

'name' @ [77:20] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'temporaryName' @ [77:27] ==> val temporaryName: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.renameFileTemporarily[LocalVariableDescriptor]

'targetDirectory' @ [81:35] ==> private final val targetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor[PropertyDescriptorImpl]

'findFile' @ [81:51] ==> @Nullable public abstract fun findFile(@NotNull @NonNls p0: String): PsiFile? defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'targetFileName' @ [81:60] ==> private final val targetFileName: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor[PropertyDescriptorImpl]

'needTemporaryRename' @ [82:13] ==> val needTemporaryRename: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.performRefactoring[LocalVariableDescriptor]

'renameFileTemporarily' @ [83:13] ==> private final fun renameFileTemporarily(): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor[SimpleFunctionDescriptorImpl]

'super' @ [87:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor[LazyClassReceiverParameterDescriptor]

'performRefactoring' @ [87:19] ==> protected/*protected and package*/ open fun performRefactoring(@NotNull p0: (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>)): Unit defined in com.intellij.refactoring.move.moveFilesOrDirectories.MoveFilesOrDirectoriesProcessor[JavaMethodDescriptor]

'usages' @ [87:38] ==> value-parameter usages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.performRefactoring[ValueParameterDescriptorImpl]

'needTemporaryRename' @ [90:17] ==> val needTemporaryRename: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor.performRefactoring[LocalVariableDescriptor]

'sourceFile' @ [91:17] ==> private final val sourceFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor[PropertyDescriptorImpl]

'name' @ [91:28] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'targetFileName' @ [91:35] ==> private final val targetFileName: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveToKotlinFileProcessor[PropertyDescriptorImpl]

