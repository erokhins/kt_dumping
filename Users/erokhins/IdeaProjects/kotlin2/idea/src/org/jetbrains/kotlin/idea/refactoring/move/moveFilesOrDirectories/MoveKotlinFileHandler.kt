'UserDataProperty' @ [44:61] ==> public constructor UserDataProperty<in R : UserDataHolder, T : Any>(key: Key<List<PsiElement>>) defined in org.jetbrains.kotlin.psi.UserDataProperty[DeserializedClassConstructorDescriptor]
Inferred types:
    <in R : UserDataHolder> -> KtFile
    <T : Any> -> List<PsiElement>

'create' @ [44:82] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(List<PsiElement>..List<PsiElement>?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<PsiElement>

'MoveFileHandler' @ [46:31] ==> public constructor MoveFileHandler() defined in com.intellij.refactoring.move.moveFilesOrDirectories.MoveFileHandler[JavaClassConstructorDescriptor]

'UsageInfo' @ [47:45] ==> public constructor UsageInfo(@NotNull p0: PsiFile) defined in com.intellij.usageView.UsageInfo[JavaClassConstructorDescriptor]

'file' @ [47:55] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.FileInfo.<init>[ValueParameterDescriptorImpl]

'LightElement' @ [54:8] ==> protected/*protected and package*/ constructor LightElement(@NotNull p0: PsiManager, @NotNull p1: Language) defined in com.intellij.psi.impl.light.LightElement[JavaClassConstructorDescriptor]

'file' @ [54:21] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.MoveContext.<init>[ValueParameterDescriptorImpl]

'manager' @ [54:26] ==> public final val PsiFile.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'INSTANCE' @ [54:50] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'updatePackageDirective' @ [59:44] ==> public var KtFile.updatePackageDirective: Boolean? defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[PropertyDescriptorImpl]

'packageMatchesDirectory' @ [59:70] ==> public fun KtFile.packageMatchesDirectory(): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'updatePackageDirective' @ [60:9] ==> public var KtFile.updatePackageDirective: Boolean? defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[PropertyDescriptorImpl]

'if (clearUserData) null else shouldUpdatePackageDirective' @ [60:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean?, elseBranch: Boolean?): Boolean?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean?

'clearUserData' @ [60:38] ==> value-parameter clearUserData: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.getPackageNameInfo[ValueParameterDescriptorImpl]

'shouldUpdatePackageDirective' @ [60:63] ==> val shouldUpdatePackageDirective: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.getPackageNameInfo[LocalVariableDescriptor]

'!' @ [62:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'shouldUpdatePackageDirective' @ [62:14] ==> val shouldUpdatePackageDirective: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.getPackageNameInfo[LocalVariableDescriptor]

'packageFqName' @ [64:30] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'newParent' @ [65:26] ==> value-parameter newParent: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.getPackageNameInfo[ValueParameterDescriptorImpl]

'getPackage' @ [65:37] ==> public fun PsiDirectory.getPackage(): PsiPackage? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'ContainerChangeInfo' @ [65:60] ==> public constructor ContainerChangeInfo(oldContainer: ContainerInfo, newContainer: ContainerInfo) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerChangeInfo[ClassConstructorDescriptorImpl]

'Package' @ [65:94] ==> public constructor Package(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package[ClassConstructorDescriptorImpl]

'oldPackageName' @ [65:102] ==> val oldPackageName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.getPackageNameInfo[LocalVariableDescriptor]

'UnknownPackage' @ [66:94] ==> public object UnknownPackage : ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo[FakeCallableDescriptorForObject]

'FqNameUnsafe' @ [68:30] ==> public constructor FqNameUnsafe(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaClassConstructorDescriptor]

'newPackage' @ [68:43] ==> val newPackage: PsiPackage defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.getPackageNameInfo[LocalVariableDescriptor]

'qualifiedName' @ [68:54] ==> public final val PsiPackage.qualifiedName: String[MyPropertyDescriptor]

'oldPackageName' @ [69:13] ==> val oldPackageName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.getPackageNameInfo[LocalVariableDescriptor]

'asString' @ [69:28] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'newPackageName' @ [69:42] ==> val newPackageName: FqNameUnsafe defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.getPackageNameInfo[LocalVariableDescriptor]

'asString' @ [69:57] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'==' @ [70:16] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.openapi.module.Module[DeserializedSimpleFunctionDescriptor]

'findModuleForPsiElement' @ [70:31] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'this' @ [70:55] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.getPackageNameInfo[ReceiverParameterDescriptorImpl]

'findModuleForPsiElement' @ [70:79] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'newParent' @ [70:103] ==> value-parameter newParent: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.getPackageNameInfo[ValueParameterDescriptorImpl]

'!' @ [71:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'newPackageName' @ [71:14] ==> val newPackageName: FqNameUnsafe defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.getPackageNameInfo[LocalVariableDescriptor]

'hasIdentifiersOnly' @ [71:29] ==> public fun FqNameUnsafe.hasIdentifiersOnly(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'ContainerChangeInfo' @ [73:16] ==> public constructor ContainerChangeInfo(oldContainer: ContainerInfo, newContainer: ContainerInfo) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerChangeInfo[ClassConstructorDescriptorImpl]

'Package' @ [73:50] ==> public constructor Package(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package[ClassConstructorDescriptorImpl]

'oldPackageName' @ [73:58] ==> val oldPackageName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.getPackageNameInfo[LocalVariableDescriptor]

'Package' @ [73:89] ==> public constructor Package(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package[ClassConstructorDescriptorImpl]

'newPackageName' @ [73:97] ==> val newPackageName: FqNameUnsafe defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.getPackageNameInfo[LocalVariableDescriptor]

'toSafe' @ [73:112] ==> @NotNull public open fun toSafe(): FqName defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'psiFile' @ [77:13] ==> value-parameter psiFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor[ValueParameterDescriptorImpl]

'psiFile' @ [78:31] ==> value-parameter psiFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor[ValueParameterDescriptorImpl]

'getPackageNameInfo' @ [78:39] ==> private final fun KtFile.getPackageNameInfo(newParent: PsiDirectory?, clearUserData: Boolean): ContainerChangeInfo? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler[SimpleFunctionDescriptorImpl]

'newParent' @ [78:58] ==> value-parameter newParent: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor[ValueParameterDescriptorImpl]

'psiFile' @ [80:23] ==> value-parameter psiFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor[ValueParameterDescriptorImpl]

'project' @ [80:31] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'packageNameInfo' @ [82:26] ==> val packageNameInfo: ContainerChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor[LocalVariableDescriptor]

'newContainer' @ [82:42] ==> public final val newContainer: ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerChangeInfo[PropertyDescriptorImpl]

'when (newPackage) {
            ContainerInfo.UnknownPackage -> EmptyKotlinMoveTarget

            else -> KotlinMoveTargetForDeferredFile(newPackage.fqName!!, newParent) {
                newParent?.let {
                    MoveFilesOrDirectoriesUtil.doMoveFile(psiFile, it)
                    it.findFile(psiFile.name) as? KtFile
                }
            }
        }' @ [83:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinMoveTarget, entry1: KotlinMoveTarget): KotlinMoveTarget[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinMoveTarget

'newPackage' @ [83:32] ==> val newPackage: ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor[LocalVariableDescriptor]

'UnknownPackage' @ [84:27] ==> public object UnknownPackage : ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo[FakeCallableDescriptorForObject]

'EmptyKotlinMoveTarget' @ [84:45] ==> public object EmptyKotlinMoveTarget : KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations in file KotlinMoveTarget.kt[FakeCallableDescriptorForObject]

'KotlinMoveTargetForDeferredFile' @ [86:21] ==> public constructor KotlinMoveTargetForDeferredFile(targetContainerFqName: FqName, directory: PsiDirectory?, targetFile: VirtualFile? = ..., createFile: (KtFile) -> KtFile?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTargetForDeferredFile[ClassConstructorDescriptorImpl]

'newPackage' @ [86:53] ==> val newPackage: ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor[LocalVariableDescriptor]

'fqName' @ [86:64] ==> public abstract val fqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo[PropertyDescriptorImpl]

'newParent' @ [86:74] ==> value-parameter newParent: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor[ValueParameterDescriptorImpl]

'newParent' @ [87:17] ==> value-parameter newParent: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor[ValueParameterDescriptorImpl]

'let' @ [87:28] ==> @InlineOnly public inline fun <T, R> PsiDirectory.let(block: (PsiDirectory) -> KtFile?): KtFile? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiDirectory
    <R> -> KtFile?

'doMoveFile' @ [88:48] ==> public open fun doMoveFile(@NotNull p0: PsiFile, @NotNull p1: PsiDirectory): Unit defined in com.intellij.refactoring.move.moveFilesOrDirectories.MoveFilesOrDirectoriesUtil[JavaMethodDescriptor]

'psiFile' @ [88:59] ==> value-parameter psiFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor[ValueParameterDescriptorImpl]

'it' @ [88:68] ==> value-parameter it: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [89:21] ==> value-parameter it: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'findFile' @ [89:24] ==> @Nullable public abstract fun findFile(@NotNull @NonNls p0: String): PsiFile? defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'psiFile' @ [89:33] ==> value-parameter psiFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor[ValueParameterDescriptorImpl]

'name' @ [89:41] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'MoveKotlinDeclarationsProcessor' @ [94:16] ==> public constructor MoveKotlinDeclarationsProcessor(descriptor: MoveDeclarationsDescriptor, mover: Mover = ...) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[ClassConstructorDescriptorImpl]

'MoveDeclarationsDescriptor' @ [95:17] ==> @JvmOverloads public constructor MoveDeclarationsDescriptor(project: Project, elementsToMove: Collection<KtNamedDeclaration>, moveTarget: KotlinMoveTarget, delegate: MoveDeclarationsDelegate, searchInCommentsAndStrings: Boolean = ..., searchInNonCode: Boolean = ..., scanEntireFile: Boolean = ..., deleteSourceFiles: Boolean = ..., moveCallback: MoveCallback? = ..., openInEditor: Boolean = ..., allElementsToMove: List<PsiElement>? = ...) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[ClassConstructorDescriptorImpl]

'project' @ [96:35] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor[LocalVariableDescriptor]

'psiFile' @ [97:42] ==> value-parameter psiFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor[ValueParameterDescriptorImpl]

'declarations' @ [97:50] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'filterIsInstance' @ [97:63] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtNamedDeclaration

'moveTarget' @ [98:38] ==> val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor[LocalVariableDescriptor]

'TopLevel' @ [99:61] ==> public object TopLevel : MoveDeclarationsDelegate defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate[FakeCallableDescriptorForObject]

'psiFile' @ [101:45] ==> value-parameter psiFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.initMoveProcessor[ValueParameterDescriptorImpl]

'allElementsToMove' @ [101:53] ==> internal var KtFile.allElementsToMove: List<PsiElement>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories in file MoveKotlinFileHandler.kt[PropertyDescriptorImpl]

'Idle' @ [103:23] ==> public object Idle : Mover defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover[FakeCallableDescriptorForObject]

'element' @ [108:13] ==> value-parameter element: PsiFile? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.canProcessElement[ValueParameterDescriptorImpl]

'element' @ [108:46] ==> value-parameter element: PsiFile? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.canProcessElement[ValueParameterDescriptorImpl]

'!' @ [109:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isOutsideJavaSourceRoot' @ [109:38] ==> public open fun isOutsideJavaSourceRoot(@Nullable p0: PsiFile?): Boolean defined in com.intellij.openapi.roots.JavaProjectRootsUtil[JavaMethodDescriptor]

'element' @ [109:62] ==> value-parameter element: PsiFile? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.canProcessElement[ValueParameterDescriptorImpl]

'psiFile' @ [118:13] ==> value-parameter psiFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.findUsages[ValueParameterDescriptorImpl]

'emptyList' @ [118:40] ==> public fun <T> emptyList(): List<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'arrayListOf' @ [120:22] ==> public fun <T> arrayListOf(vararg elements: UsageInfo): ArrayList<UsageInfo> /* = ArrayList<UsageInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'FileInfo' @ [120:45] ==> public constructor FileInfo(file: KtFile) defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.FileInfo[ClassConstructorDescriptorImpl]

'psiFile' @ [120:54] ==> value-parameter psiFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.findUsages[ValueParameterDescriptorImpl]

'initMoveProcessor' @ [121:9] ==> public final fun initMoveProcessor(psiFile: PsiFile, newParent: PsiDirectory?): MoveKotlinDeclarationsProcessor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler[SimpleFunctionDescriptorImpl]

'psiFile' @ [121:27] ==> value-parameter psiFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.findUsages[ValueParameterDescriptorImpl]

'newParent' @ [121:36] ==> value-parameter newParent: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.findUsages[ValueParameterDescriptorImpl]

'let' @ [121:48] ==> @InlineOnly public inline fun <T, R> MoveKotlinDeclarationsProcessor.let(block: (MoveKotlinDeclarationsProcessor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MoveKotlinDeclarationsProcessor
    <R> -> Unit

'usages' @ [122:13] ==> val usages: ArrayList<UsageInfo> /* = ArrayList<UsageInfo> */ defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.findUsages[LocalVariableDescriptor]

'it' @ [122:23] ==> value-parameter it: MoveKotlinDeclarationsProcessor defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.findUsages.<anonymous>[ValueParameterDescriptorImpl]

'findUsages' @ [122:26] ==> public open fun findUsages(): Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[SimpleFunctionDescriptorImpl]

'usages' @ [123:13] ==> val usages: ArrayList<UsageInfo> /* = ArrayList<UsageInfo> */ defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.findUsages[LocalVariableDescriptor]

'it' @ [123:23] ==> value-parameter it: MoveKotlinDeclarationsProcessor defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.findUsages.<anonymous>[ValueParameterDescriptorImpl]

'getConflictsAsUsages' @ [123:26] ==> public final fun getConflictsAsUsages(): List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[SimpleFunctionDescriptorImpl]

'usages' @ [125:16] ==> val usages: ArrayList<UsageInfo> /* = ArrayList<UsageInfo> */ defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.findUsages[LocalVariableDescriptor]

'file' @ [129:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.prepareMovedFile[ValueParameterDescriptorImpl]

'initMoveProcessor' @ [130:29] ==> public final fun initMoveProcessor(psiFile: PsiFile, newParent: PsiDirectory?): MoveKotlinDeclarationsProcessor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler[SimpleFunctionDescriptorImpl]

'file' @ [130:47] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.prepareMovedFile[ValueParameterDescriptorImpl]

'moveDestination' @ [130:53] ==> value-parameter moveDestination: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.prepareMovedFile[ValueParameterDescriptorImpl]

'MoveContext' @ [131:27] ==> public constructor MoveContext(file: PsiFile, declarationMoveProcessor: MoveKotlinDeclarationsProcessor) defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.MoveContext[ClassConstructorDescriptorImpl]

'file' @ [131:39] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.prepareMovedFile[ValueParameterDescriptorImpl]

'moveProcessor' @ [131:45] ==> val moveProcessor: MoveKotlinDeclarationsProcessor defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.prepareMovedFile[LocalVariableDescriptor]

'oldToNewMap' @ [132:9] ==> value-parameter oldToNewMap: MutableMap<PsiElement, PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.prepareMovedFile[ValueParameterDescriptorImpl]

'moveContext' @ [132:21] ==> val moveContext: MoveKotlinFileHandler.MoveContext defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.prepareMovedFile[LocalVariableDescriptor]

'moveContext' @ [132:36] ==> val moveContext: MoveKotlinFileHandler.MoveContext defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.prepareMovedFile[LocalVariableDescriptor]

'file' @ [133:31] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.prepareMovedFile[ValueParameterDescriptorImpl]

'getPackageNameInfo' @ [133:36] ==> private final fun KtFile.getPackageNameInfo(newParent: PsiDirectory?, clearUserData: Boolean): ContainerChangeInfo? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler[SimpleFunctionDescriptorImpl]

'moveDestination' @ [133:55] ==> value-parameter moveDestination: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.prepareMovedFile[ValueParameterDescriptorImpl]

'packageNameInfo' @ [134:25] ==> val packageNameInfo: ContainerChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.prepareMovedFile[LocalVariableDescriptor]

'newContainer' @ [134:41] ==> public final val newContainer: ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerChangeInfo[PropertyDescriptorImpl]

'fqName' @ [134:54] ==> public abstract val fqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo[PropertyDescriptorImpl]

'newFqName' @ [135:13] ==> val newFqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.prepareMovedFile[LocalVariableDescriptor]

'file' @ [136:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.prepareMovedFile[ValueParameterDescriptorImpl]

'packageDirective' @ [136:18] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

'fqName' @ [136:36] ==> public final var KtPackageDirective.fqName: FqName[MyPropertyDescriptor]

'newFqName' @ [136:45] ==> val newFqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.prepareMovedFile[LocalVariableDescriptor]

'quoteIfNeeded' @ [136:55] ==> public fun FqName.quoteIfNeeded(): FqName defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'usageInfos' @ [145:28] ==> value-parameter usageInfos: List<UsageInfo>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.retargetUsages[ValueParameterDescriptorImpl]

'firstOrNull' @ [145:40] ==> public fun <T> List<UsageInfo>.firstOrNull(): UsageInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'element' @ [145:69] ==> public final val MoveKotlinFileHandler.FileInfo.element: PsiElement?[MyPropertyDescriptor]

'oldToNewMap' @ [146:27] ==> value-parameter oldToNewMap: Map<PsiElement, PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.retargetUsages[ValueParameterDescriptorImpl]

'keys' @ [146:39] ==> public abstract val keys: Set<PsiElement> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'firstOrNull' @ [146:44] ==> public inline fun <T> Iterable<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [146:58] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.retargetUsages.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [146:79] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.retargetUsages.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [146:82] ==> public final val file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.MoveContext[PropertyDescriptorImpl]

'currentFile' @ [146:90] ==> val currentFile: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.retargetUsages[LocalVariableDescriptor]

'retargetUsages' @ [147:9] ==> public final fun retargetUsages(usageInfos: List<UsageInfo>?, moveDeclarationsProcessor: MoveKotlinDeclarationsProcessor): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler[SimpleFunctionDescriptorImpl]

'usageInfos' @ [147:24] ==> value-parameter usageInfos: List<UsageInfo>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.retargetUsages[ValueParameterDescriptorImpl]

'moveContext' @ [147:36] ==> val moveContext: MoveKotlinFileHandler.MoveContext defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.retargetUsages[LocalVariableDescriptor]

'declarationMoveProcessor' @ [147:48] ==> public final val declarationMoveProcessor: MoveKotlinDeclarationsProcessor defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.MoveContext[PropertyDescriptorImpl]

'usageInfos' @ [151:9] ==> value-parameter usageInfos: List<UsageInfo>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.retargetUsages[ValueParameterDescriptorImpl]

'let' @ [151:21] ==> @InlineOnly public inline fun <T, R> List<UsageInfo>.let(block: (List<UsageInfo>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<UsageInfo>
    <R> -> Unit

'moveDeclarationsProcessor' @ [151:27] ==> value-parameter moveDeclarationsProcessor: MoveKotlinDeclarationsProcessor defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.retargetUsages[ValueParameterDescriptorImpl]

'doPerformRefactoring' @ [151:53] ==> internal final fun doPerformRefactoring(usages: List<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[SimpleFunctionDescriptorImpl]

'it' @ [151:74] ==> value-parameter it: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.MoveKotlinFileHandler.retargetUsages.<anonymous>[ValueParameterDescriptorImpl]

