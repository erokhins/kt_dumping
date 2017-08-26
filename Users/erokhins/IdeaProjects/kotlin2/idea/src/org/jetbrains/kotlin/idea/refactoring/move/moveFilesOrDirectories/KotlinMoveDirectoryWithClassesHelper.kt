'MoveDirectoryWithClassesHelper' @ [39:46] ==> public constructor MoveDirectoryWithClassesHelper() defined in com.intellij.refactoring.move.moveClassesOrPackages.MoveDirectoryWithClassesHelper[JavaClassConstructorDescriptor]

'UsageInfo' @ [44:9] ==> public constructor UsageInfo(@NotNull p0: PsiFile) defined in com.intellij.usageView.UsageInfo[JavaClassConstructorDescriptor]

'psiFile' @ [44:19] ==> value-parameter psiFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper.<init>[ValueParameterDescriptorImpl]

'MoveKotlinFileHandler' @ [51:31] ==> public constructor MoveKotlinFileHandler() defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler[ClassConstructorDescriptorImpl]

'fileToMoveContext' @ [56:16] ==> private final var fileToMoveContext: MutableMap<PsiFile, KotlinMoveDirectoryWithClassesHelper.MoveContext>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper[PropertyDescriptorImpl]

'HashMap' @ [56:37] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiFile
    <V : (Any..Any?)> -> MoveContext

'apply' @ [56:69] ==> @InlineOnly public inline fun <T> HashMap<PsiFile, KotlinMoveDirectoryWithClassesHelper.MoveContext>.apply(block: HashMap<PsiFile, KotlinMoveDirectoryWithClassesHelper.MoveContext>.() -> Unit): HashMap<PsiFile, KotlinMoveDirectoryWithClassesHelper.MoveContext> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HashMap<PsiFile, MoveContext>

'fileToMoveContext' @ [57:13] ==> private final var fileToMoveContext: MutableMap<PsiFile, KotlinMoveDirectoryWithClassesHelper.MoveContext>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper[PropertyDescriptorImpl]

'this' @ [57:33] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.getOrCreateMoveContextMap.<anonymous>[ReceiverParameterDescriptorImpl]

'invokeOnceOnCommandFinish' @ [58:13] ==> public fun invokeOnceOnCommandFinish(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]

'fileToMoveContext' @ [58:41] ==> private final var fileToMoveContext: MutableMap<PsiFile, KotlinMoveDirectoryWithClassesHelper.MoveContext>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper[PropertyDescriptorImpl]

'filesToMove' @ [69:9] ==> value-parameter filesToMove: MutableCollection<PsiFile> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.findUsages[ValueParameterDescriptorImpl]

'filterIsInstance' @ [70:18] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtFile

'mapTo' @ [71:18] ==> public inline fun <T, R, C : MutableCollection<in KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper>> Iterable<KtFile>.mapTo(destination: MutableCollection<UsageInfo>, transform: (KtFile) -> KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper): MutableCollection<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> FileUsagesWrapper
    <C : MutableCollection<in R>> -> MutableCollection<UsageInfo>

'result' @ [71:24] ==> value-parameter result: MutableCollection<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.findUsages[ValueParameterDescriptorImpl]

'FileUsagesWrapper' @ [71:34] ==> public constructor FileUsagesWrapper(psiFile: KtFile, usages: List<UsageInfo>, moveDeclarationsProcessor: MoveKotlinDeclarationsProcessor?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper[ClassConstructorDescriptorImpl]

'it' @ [71:52] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.findUsages.<anonymous>[ValueParameterDescriptorImpl]

'fileHandler' @ [71:56] ==> private final val fileHandler: MoveKotlinFileHandler defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper[PropertyDescriptorImpl]

'findUsages' @ [71:68] ==> public open fun findUsages(psiFile: PsiFile, newParent: PsiDirectory?, searchInComments: Boolean, searchInNonJavaFiles: Boolean): List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler[SimpleFunctionDescriptorImpl]

'it' @ [71:79] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.findUsages.<anonymous>[ValueParameterDescriptorImpl]

'searchInComments' @ [71:89] ==> value-parameter searchInComments: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.findUsages[ValueParameterDescriptorImpl]

'searchInNonJavaFiles' @ [71:107] ==> value-parameter searchInNonJavaFiles: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.findUsages[ValueParameterDescriptorImpl]

'directory' @ [81:26] ==> value-parameter directory: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.preprocessUsages[ValueParameterDescriptorImpl]

'getPackage' @ [81:37] ==> public fun PsiDirectory.getPackage(): PsiPackage? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'KotlinDirectoryMoveTarget' @ [82:26] ==> public constructor KotlinDirectoryMoveTarget(targetContainerFqName: FqName, directory: PsiDirectory) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinDirectoryMoveTarget[ClassConstructorDescriptorImpl]

'FqName' @ [82:52] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'psiPackage' @ [82:59] ==> val psiPackage: PsiPackage defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.preprocessUsages[LocalVariableDescriptor]

'qualifiedName' @ [82:70] ==> public final val PsiPackage.qualifiedName: String[MyPropertyDescriptor]

'directory' @ [82:86] ==> value-parameter directory: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.preprocessUsages[ValueParameterDescriptorImpl]

'component1' @ [83:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [83:22] ==> public final operator fun component2(): UsageInfo defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'infos' @ [83:36] ==> value-parameter infos: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.preprocessUsages[ValueParameterDescriptorImpl]

'withIndex' @ [83:42] ==> public fun <T> Array<out UsageInfo>.withIndex(): Iterable<IndexedValue<UsageInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'usageInfo' @ [84:17] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.preprocessUsages[LocalVariableDescriptor]

'analyzeConflictsInFile' @ [86:13] ==> public fun analyzeConflictsInFile(file: KtFile, usages: Collection<UsageInfo>, moveTarget: KotlinMoveTarget, allElementsToMove: Collection<PsiElement>, conflicts: MultiMap<PsiElement, String>, onUsageUpdate: (List<UsageInfo>) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations[SimpleFunctionDescriptorImpl]

'usageInfo' @ [86:36] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.preprocessUsages[LocalVariableDescriptor]

'psiFile' @ [86:46] ==> public final val psiFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper[PropertyDescriptorImpl]

'usageInfo' @ [86:55] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.preprocessUsages[LocalVariableDescriptor]

'usages' @ [86:65] ==> public final val usages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper[PropertyDescriptorImpl]

'moveTarget' @ [86:73] ==> val moveTarget: KotlinDirectoryMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.preprocessUsages[LocalVariableDescriptor]

'files' @ [86:85] ==> value-parameter files: MutableSet<PsiFile> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.preprocessUsages[ValueParameterDescriptorImpl]

'conflicts' @ [86:92] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.preprocessUsages[ValueParameterDescriptorImpl]

'infos' @ [87:17] ==> value-parameter infos: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.preprocessUsages[ValueParameterDescriptorImpl]

'index' @ [87:23] ==> val index: Int defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.preprocessUsages[LocalVariableDescriptor]

'usageInfo' @ [87:32] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.preprocessUsages[LocalVariableDescriptor]

'copy' @ [87:42] ==> public final fun copy(psiFile: KtFile = ..., usages: List<UsageInfo> = ..., moveDeclarationsProcessor: MoveKotlinDeclarationsProcessor? = ...): KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper[SimpleFunctionDescriptorImpl]

'it' @ [87:56] ==> value-parameter it: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.preprocessUsages.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [104:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.move[ValueParameterDescriptorImpl]

'fileHandler' @ [106:41] ==> private final val fileHandler: MoveKotlinFileHandler defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper[PropertyDescriptorImpl]

'initMoveProcessor' @ [106:53] ==> public final fun initMoveProcessor(psiFile: PsiFile, newParent: PsiDirectory?): MoveKotlinDeclarationsProcessor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler[SimpleFunctionDescriptorImpl]

'file' @ [106:71] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.move[ValueParameterDescriptorImpl]

'moveDestination' @ [106:77] ==> value-parameter moveDestination: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.move[ValueParameterDescriptorImpl]

'getOrCreateMoveContextMap' @ [107:30] ==> private final fun getOrCreateMoveContextMap(): MutableMap<PsiFile, KotlinMoveDirectoryWithClassesHelper.MoveContext> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper[SimpleFunctionDescriptorImpl]

'moveContextMap' @ [108:9] ==> val moveContextMap: MutableMap<PsiFile, KotlinMoveDirectoryWithClassesHelper.MoveContext> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.move[LocalVariableDescriptor]

'file' @ [108:24] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.move[ValueParameterDescriptorImpl]

'MoveContext' @ [108:32] ==> public constructor MoveContext(newParent: PsiDirectory, moveDeclarationsProcessor: MoveKotlinDeclarationsProcessor?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.MoveContext[ClassConstructorDescriptorImpl]

'moveDestination' @ [108:44] ==> value-parameter moveDestination: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.move[ValueParameterDescriptorImpl]

'moveDeclarationsProcessor' @ [108:61] ==> val moveDeclarationsProcessor: MoveKotlinDeclarationsProcessor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.move[LocalVariableDescriptor]

'moveDeclarationsProcessor' @ [109:13] ==> val moveDeclarationsProcessor: MoveKotlinDeclarationsProcessor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.move[LocalVariableDescriptor]

'moveDestination' @ [110:13] ==> value-parameter moveDestination: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.move[ValueParameterDescriptorImpl]

'getPackage' @ [110:29] ==> public fun PsiDirectory.getPackage(): PsiPackage? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'let' @ [110:43] ==> @InlineOnly public inline fun <T, R> PsiPackage.let(block: (PsiPackage) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiPackage
    <R> -> Unit

'file' @ [111:17] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.move[ValueParameterDescriptorImpl]

'packageDirective' @ [111:22] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

'fqName' @ [111:40] ==> public final var KtPackageDirective.fqName: FqName[MyPropertyDescriptor]

'FqName' @ [111:49] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'newPackage' @ [111:56] ==> value-parameter newPackage: PsiPackage defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.move.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedName' @ [111:67] ==> public final val PsiPackage.qualifiedName: String[MyPropertyDescriptor]

'quoteIfNeeded' @ [111:82] ==> public fun FqName.quoteIfNeeded(): FqName defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'fileToMoveContext' @ [122:33] ==> private final var fileToMoveContext: MutableMap<PsiFile, KotlinMoveDirectoryWithClassesHelper.MoveContext>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper[PropertyDescriptorImpl]

'ArrayList' @ [124:35] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FileUsagesWrapper

'usages' @ [125:13] ==> value-parameter usages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.postProcessUsages[ValueParameterDescriptorImpl]

'filterIsInstance' @ [126:18] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> FileUsagesWrapper

'forEach' @ [127:18] ==> @HidesMembers public inline fun <T> Iterable<KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper>.forEach(action: (KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileUsagesWrapper

'it' @ [128:32] ==> value-parameter it: KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.postProcessUsages.<anonymous>[ValueParameterDescriptorImpl]

'psiFile' @ [128:35] ==> public final val psiFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper[PropertyDescriptorImpl]

'fileToMoveContext' @ [129:39] ==> val fileToMoveContext: MutableMap<PsiFile, KotlinMoveDirectoryWithClassesHelper.MoveContext> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.postProcessUsages[LocalVariableDescriptor]

'file' @ [129:57] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.postProcessUsages.<anonymous>[LocalVariableDescriptor]

'doMoveFile' @ [131:48] ==> public open fun doMoveFile(@NotNull p0: PsiFile, @NotNull p1: PsiDirectory): Unit defined in com.intellij.refactoring.move.moveFilesOrDirectories.MoveFilesOrDirectoriesUtil[JavaMethodDescriptor]

'file' @ [131:59] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.postProcessUsages.<anonymous>[LocalVariableDescriptor]

'moveContext' @ [131:65] ==> val moveContext: KotlinMoveDirectoryWithClassesHelper.MoveContext defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.postProcessUsages.<anonymous>[LocalVariableDescriptor]

'newParent' @ [131:77] ==> public final val newParent: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.MoveContext[PropertyDescriptorImpl]

'moveContext' @ [133:53] ==> val moveContext: KotlinMoveDirectoryWithClassesHelper.MoveContext defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.postProcessUsages.<anonymous>[LocalVariableDescriptor]

'moveDeclarationsProcessor' @ [133:65] ==> public final val moveDeclarationsProcessor: MoveKotlinDeclarationsProcessor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.MoveContext[PropertyDescriptorImpl]

'moveContext' @ [134:37] ==> val moveContext: KotlinMoveDirectoryWithClassesHelper.MoveContext defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.postProcessUsages.<anonymous>[LocalVariableDescriptor]

'newParent' @ [134:49] ==> public final val newParent: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.MoveContext[PropertyDescriptorImpl]

'findFile' @ [134:59] ==> @Nullable public abstract fun findFile(@NotNull @NonNls p0: String): PsiFile? defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'file' @ [134:68] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.postProcessUsages.<anonymous>[LocalVariableDescriptor]

'name' @ [134:73] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'usagesToProcess' @ [136:21] ==> val usagesToProcess: ArrayList<KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.postProcessUsages[LocalVariableDescriptor]

'FileUsagesWrapper' @ [136:40] ==> public constructor FileUsagesWrapper(psiFile: KtFile, usages: List<UsageInfo>, moveDeclarationsProcessor: MoveKotlinDeclarationsProcessor?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper[ClassConstructorDescriptorImpl]

'movedFile' @ [136:58] ==> val movedFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.postProcessUsages.<anonymous>[LocalVariableDescriptor]

'it' @ [136:79] ==> value-parameter it: KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.postProcessUsages.<anonymous>[ValueParameterDescriptorImpl]

'usages' @ [136:82] ==> public final val usages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper[PropertyDescriptorImpl]

'moveDeclarationsProcessor' @ [136:90] ==> val moveDeclarationsProcessor: MoveKotlinDeclarationsProcessor defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.postProcessUsages.<anonymous>[LocalVariableDescriptor]

'usagesToProcess' @ [138:13] ==> val usagesToProcess: ArrayList<KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.postProcessUsages[LocalVariableDescriptor]

'forEach' @ [138:29] ==> @HidesMembers public inline fun <T> Iterable<KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper>.forEach(action: (KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileUsagesWrapper

'fileHandler' @ [138:39] ==> private final val fileHandler: MoveKotlinFileHandler defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper[PropertyDescriptorImpl]

'retargetUsages' @ [138:51] ==> public final fun retargetUsages(usageInfos: List<UsageInfo>?, moveDeclarationsProcessor: MoveKotlinDeclarationsProcessor): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler[SimpleFunctionDescriptorImpl]

'it' @ [138:66] ==> value-parameter it: KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.postProcessUsages.<anonymous>[ValueParameterDescriptorImpl]

'usages' @ [138:69] ==> public final val usages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper[PropertyDescriptorImpl]

'it' @ [138:77] ==> value-parameter it: KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.postProcessUsages.<anonymous>[ValueParameterDescriptorImpl]

'moveDeclarationsProcessor' @ [138:80] ==> public final val moveDeclarationsProcessor: MoveKotlinDeclarationsProcessor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper.FileUsagesWrapper[PropertyDescriptorImpl]

'this' @ [141:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper[LazyClassReceiverParameterDescriptor]

'fileToMoveContext' @ [141:18] ==> private final var fileToMoveContext: MutableMap<PsiFile, KotlinMoveDirectoryWithClassesHelper.MoveContext>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveDirectoryWithClassesHelper[PropertyDescriptorImpl]

