'AbstractMultifileRefactoringTest' @ [49:35] ==> public constructor AbstractMultifileRefactoringTest() defined in org.jetbrains.kotlin.idea.refactoring.AbstractMultifileRefactoringTest[ClassConstructorDescriptorImpl]

'runMoveRefactoring' @ [51:9] ==> public fun runMoveRefactoring(path: String, config: JsonObject, rootDir: VirtualFile, project: Project): Unit defined in org.jetbrains.kotlin.idea.refactoring.move in file AbstractMoveTest.kt[SimpleFunctionDescriptorImpl]

'path' @ [51:28] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMoveTest.runRefactoring[ValueParameterDescriptorImpl]

'config' @ [51:34] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMoveTest.runRefactoring[ValueParameterDescriptorImpl]

'rootDir' @ [51:42] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMoveTest.runRefactoring[ValueParameterDescriptorImpl]

'project' @ [51:51] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMoveTest.runRefactoring[ValueParameterDescriptorImpl]

'runRefactoringTest' @ [56:5] ==> public fun runRefactoringTest(path: String, config: JsonObject, rootDir: VirtualFile, project: Project, action: AbstractMultifileRefactoringTest.RefactoringAction): Unit defined in org.jetbrains.kotlin.idea.refactoring in file AbstractMultifileRefactoringTest.kt[SimpleFunctionDescriptorImpl]

'path' @ [56:24] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.move.runMoveRefactoring[ValueParameterDescriptorImpl]

'config' @ [56:30] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.runMoveRefactoring[ValueParameterDescriptorImpl]

'rootDir' @ [56:38] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.runMoveRefactoring[ValueParameterDescriptorImpl]

'project' @ [56:47] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.runMoveRefactoring[ValueParameterDescriptorImpl]

'valueOf' @ [56:67] ==> public final fun valueOf(value: String): MoveAction defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction[SimpleFunctionDescriptorImpl]

'config' @ [56:75] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.runMoveRefactoring[ValueParameterDescriptorImpl]

'getString' @ [56:82] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'elementsAtCaret' @ [62:27] ==> value-parameter elementsAtCaret: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_MEMBERS.runRefactoring[ValueParameterDescriptorImpl]

'map' @ [62:43] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> PsiMember): List<PsiMember> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> PsiMember

'it' @ [62:49] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_MEMBERS.runRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [62:52] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): PsiMember? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> PsiMember

'config' @ [63:35] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_MEMBERS.runRefactoring[ValueParameterDescriptorImpl]

'getString' @ [63:42] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'config' @ [64:30] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_MEMBERS.runRefactoring[ValueParameterDescriptorImpl]

'getNullableString' @ [64:37] ==> public fun JsonObject.getNullableString(name: String): String? defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'MockMoveMembersOptions' @ [66:27] ==> public constructor MockMoveMembersOptions(p0: (String..String?), p1: (Array<(PsiMember..PsiMember?)>..Array<out (PsiMember..PsiMember?)>?)) defined in com.intellij.refactoring.move.moveMembers.MockMoveMembersOptions[JavaClassConstructorDescriptor]

'targetClassName' @ [66:50] ==> val targetClassName: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_MEMBERS.runRefactoring[LocalVariableDescriptor]

'members' @ [66:67] ==> val members: List<PsiMember> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_MEMBERS.runRefactoring[LocalVariableDescriptor]

'toTypedArray' @ [66:75] ==> public inline fun <reified T> Collection<PsiMember>.toTypedArray(): Array<PsiMember> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiMember

'visibility' @ [67:17] ==> val visibility: String? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_MEMBERS.runRefactoring[LocalVariableDescriptor]

'options' @ [68:17] ==> val options: MockMoveMembersOptions defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_MEMBERS.runRefactoring[LocalVariableDescriptor]

'memberVisibility' @ [68:25] ==> public final var MockMoveMembersOptions.memberVisibility: String?[MyPropertyDescriptor]

'visibility' @ [68:44] ==> val visibility: String? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_MEMBERS.runRefactoring[LocalVariableDescriptor]

'MoveMembersProcessor' @ [71:13] ==> public constructor MoveMembersProcessor(p0: (Project..Project?), p1: (MoveMembersOptions..MoveMembersOptions?)) defined in com.intellij.refactoring.move.moveMembers.MoveMembersProcessor[JavaClassConstructorDescriptor]

'mainFile' @ [71:34] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_MEMBERS.runRefactoring[ValueParameterDescriptorImpl]

'project' @ [71:43] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'options' @ [71:52] ==> val options: MockMoveMembersOptions defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_MEMBERS.runRefactoring[LocalVariableDescriptor]

'run' @ [71:61] ==> public final fun run(): Unit defined in com.intellij.refactoring.move.moveMembers.MoveMembersProcessor[JavaMethodDescriptor]

'elementsAtCaret' @ [77:33] ==> value-parameter elementsAtCaret: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_TOP_LEVEL_CLASSES.runRefactoring[ValueParameterDescriptorImpl]

'map' @ [77:49] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> PsiClass): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> PsiClass

'it' @ [77:55] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_TOP_LEVEL_CLASSES.runRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [77:58] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): PsiClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> PsiClass

'config' @ [78:33] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_TOP_LEVEL_CLASSES.runRefactoring[ValueParameterDescriptorImpl]

'getString' @ [78:40] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'MoveClassesOrPackagesProcessor' @ [80:13] ==> public constructor MoveClassesOrPackagesProcessor(p0: (Project..Project?), p1: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?), @NotNull p2: MoveDestination, p3: Boolean, p4: Boolean, p5: (MoveCallback..MoveCallback?)) defined in com.intellij.refactoring.move.moveClassesOrPackages.MoveClassesOrPackagesProcessor[JavaClassConstructorDescriptor]

'mainFile' @ [81:21] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_TOP_LEVEL_CLASSES.runRefactoring[ValueParameterDescriptorImpl]

'project' @ [81:30] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'classesToMove' @ [82:21] ==> val classesToMove: List<PsiClass> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_TOP_LEVEL_CLASSES.runRefactoring[LocalVariableDescriptor]

'toTypedArray' @ [82:35] ==> public inline fun <reified T> Collection<PsiClass>.toTypedArray(): Array<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiClass

'MultipleRootsMoveDestination' @ [83:21] ==> public constructor MultipleRootsMoveDestination(p0: (PackageWrapper..PackageWrapper?)) defined in com.intellij.refactoring.move.moveClassesOrPackages.MultipleRootsMoveDestination[JavaClassConstructorDescriptor]

'PackageWrapper' @ [83:50] ==> public constructor PackageWrapper(p0: (PsiManager..PsiManager?), @NotNull p1: String) defined in com.intellij.refactoring.PackageWrapper[JavaClassConstructorDescriptor]

'mainFile' @ [83:65] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_TOP_LEVEL_CLASSES.runRefactoring[ValueParameterDescriptorImpl]

'manager' @ [83:74] ==> public final val PsiFile.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'targetPackage' @ [83:83] ==> val targetPackage: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_TOP_LEVEL_CLASSES.runRefactoring[LocalVariableDescriptor]

'run' @ [87:15] ==> public final fun run(): Unit defined in com.intellij.refactoring.move.moveClassesOrPackages.MoveClassesOrPackagesProcessor[JavaMethodDescriptor]

'mainFile' @ [93:27] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[ValueParameterDescriptorImpl]

'project' @ [93:36] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'config' @ [94:37] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[ValueParameterDescriptorImpl]

'getString' @ [94:44] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'config' @ [95:37] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[ValueParameterDescriptorImpl]

'getString' @ [95:44] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'!!' @ [97:33] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiPackage?): PsiPackage[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiPackage

'getInstance' @ [97:47] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [97:59] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'findPackage' @ [97:68] ==> @Nullable public abstract fun findPackage(@NonNls @NotNull p0: String): PsiPackage? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'sourcePackageName' @ [97:80] ==> val sourcePackageName: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'getInstance' @ [98:47] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [98:59] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'findPackage' @ [98:68] ==> @Nullable public abstract fun findPackage(@NonNls @NotNull p0: String): PsiPackage? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'targetPackageName' @ [98:80] ==> val targetPackageName: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'targetPackage' @ [99:35] ==> val targetPackage: PsiPackage? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'directories' @ [99:50] ==> public final val PsiPackage.directories: (Array<(PsiDirectory..PsiDirectory?)>..Array<out (PsiDirectory..PsiDirectory?)>)[MyPropertyDescriptor]

'first' @ [99:63] ==> public fun <T> Array<out (PsiDirectory..PsiDirectory?)>.first(): (PsiDirectory..PsiDirectory?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiDirectory..com.intellij.psi.PsiDirectory?)

'PackageWrapper' @ [101:40] ==> public constructor PackageWrapper(p0: (PsiManager..PsiManager?), @NotNull p1: String) defined in com.intellij.refactoring.PackageWrapper[JavaClassConstructorDescriptor]

'mainFile' @ [101:55] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[ValueParameterDescriptorImpl]

'manager' @ [101:64] ==> public final val PsiFile.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'targetPackageName' @ [101:73] ==> val targetPackageName: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'if (targetDirectory != null) {
                val targetSourceRoot = ProjectRootManager.getInstance(project).fileIndex.getSourceRootForFile(targetDirectory.virtualFile)!!
                KotlinAwareDelegatingMoveDestination(
                        AutocreatingSingleSourceRootMoveDestination(targetPackageWrapper, targetSourceRoot),
                        targetPackage,
                        targetDirectory
                )
            }
            else {
                MultipleRootsMoveDestination(targetPackageWrapper)
            }' @ [102:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MoveDestination, elseBranch: MoveDestination): MoveDestination[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MoveDestination

'targetDirectory' @ [102:39] ==> val targetDirectory: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'!!' @ [103:40] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: VirtualFile?): VirtualFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> VirtualFile

'getInstance' @ [103:59] ==> public open fun getInstance(@NotNull p0: Project): (ProjectRootManager..ProjectRootManager?) defined in com.intellij.openapi.roots.ProjectRootManager[JavaMethodDescriptor]

'project' @ [103:71] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'fileIndex' @ [103:80] ==> public final val ProjectRootManager.fileIndex: ProjectFileIndex[MyPropertyDescriptor]

'getSourceRootForFile' @ [103:90] ==> @Nullable public abstract fun getSourceRootForFile(@NotNull p0: VirtualFile): VirtualFile? defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'targetDirectory' @ [103:111] ==> val targetDirectory: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'virtualFile' @ [103:127] ==> public final val PsiDirectory.virtualFile: VirtualFile[MyPropertyDescriptor]

'KotlinAwareDelegatingMoveDestination' @ [104:17] ==> public constructor KotlinAwareDelegatingMoveDestination(delegate: MoveDestination, targetPackage: PsiPackage?, targetDirectory: PsiDirectory?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination[DeserializedClassConstructorDescriptor]

'AutocreatingSingleSourceRootMoveDestination' @ [105:25] ==> public constructor AutocreatingSingleSourceRootMoveDestination(p0: (PackageWrapper..PackageWrapper?), @NotNull p1: VirtualFile) defined in com.intellij.refactoring.move.moveClassesOrPackages.AutocreatingSingleSourceRootMoveDestination[JavaClassConstructorDescriptor]

'targetPackageWrapper' @ [105:69] ==> val targetPackageWrapper: PackageWrapper defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'targetSourceRoot' @ [105:91] ==> val targetSourceRoot: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'targetPackage' @ [106:25] ==> val targetPackage: PsiPackage? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'targetDirectory' @ [107:25] ==> val targetDirectory: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'MultipleRootsMoveDestination' @ [111:17] ==> public constructor MultipleRootsMoveDestination(p0: (PackageWrapper..PackageWrapper?)) defined in com.intellij.refactoring.move.moveClassesOrPackages.MultipleRootsMoveDestination[JavaClassConstructorDescriptor]

'targetPackageWrapper' @ [111:46] ==> val targetPackageWrapper: PackageWrapper defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'MoveClassesOrPackagesProcessor' @ [114:13] ==> public constructor MoveClassesOrPackagesProcessor(p0: (Project..Project?), p1: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?), @NotNull p2: MoveDestination, p3: Boolean, p4: Boolean, p5: (MoveCallback..MoveCallback?)) defined in com.intellij.refactoring.move.moveClassesOrPackages.MoveClassesOrPackagesProcessor[JavaClassConstructorDescriptor]

'project' @ [115:21] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'arrayOf' @ [116:21] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiPackage): Array<PsiPackage> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiPackage

'sourcePackage' @ [116:29] ==> val sourcePackage: PsiPackage defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'moveDestination' @ [117:21] ==> val moveDestination: MoveDestination defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_PACKAGES.runRefactoring[LocalVariableDescriptor]

'run' @ [121:15] ==> public final fun run(): Unit defined in com.intellij.refactoring.move.moveClassesOrPackages.MoveClassesOrPackagesProcessor[JavaMethodDescriptor]

'mainFile' @ [127:27] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_TOP_LEVEL_CLASSES_TO_INNER.runRefactoring[ValueParameterDescriptorImpl]

'project' @ [127:36] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'elementsAtCaret' @ [129:33] ==> value-parameter elementsAtCaret: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_TOP_LEVEL_CLASSES_TO_INNER.runRefactoring[ValueParameterDescriptorImpl]

'map' @ [129:49] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> PsiClass): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> PsiClass

'it' @ [129:55] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_TOP_LEVEL_CLASSES_TO_INNER.runRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [129:58] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): PsiClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> PsiClass

'config' @ [130:31] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_TOP_LEVEL_CLASSES_TO_INNER.runRefactoring[ValueParameterDescriptorImpl]

'getString' @ [130:38] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'MoveClassToInnerProcessor' @ [132:13] ==> public constructor MoveClassToInnerProcessor(p0: (Project..Project?), p1: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>?), @NotNull p2: PsiClass, p3: Boolean, p4: Boolean, p5: (MoveCallback..MoveCallback?)) defined in com.intellij.refactoring.move.moveClassesOrPackages.MoveClassToInnerProcessor[JavaClassConstructorDescriptor]

'project' @ [133:21] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_TOP_LEVEL_CLASSES_TO_INNER.runRefactoring[LocalVariableDescriptor]

'classesToMove' @ [134:21] ==> val classesToMove: List<PsiClass> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_TOP_LEVEL_CLASSES_TO_INNER.runRefactoring[LocalVariableDescriptor]

'toTypedArray' @ [134:35] ==> public inline fun <reified T> Collection<PsiClass>.toTypedArray(): Array<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiClass

'!!' @ [135:21] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiClass?): PsiClass[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiClass

'getInstance' @ [135:35] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [135:47] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_TOP_LEVEL_CLASSES_TO_INNER.runRefactoring[LocalVariableDescriptor]

'findClass' @ [135:56] ==> @Nullable public abstract fun findClass(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope): PsiClass? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'targetClass' @ [135:66] ==> val targetClass: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_TOP_LEVEL_CLASSES_TO_INNER.runRefactoring[LocalVariableDescriptor]

'project' @ [135:79] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_TOP_LEVEL_CLASSES_TO_INNER.runRefactoring[LocalVariableDescriptor]

'allScope' @ [135:87] ==> public fun Project.allScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search[DeserializedSimpleFunctionDescriptor]

'run' @ [139:15] ==> public final fun run(): Unit defined in com.intellij.refactoring.move.moveClassesOrPackages.MoveClassToInnerProcessor[JavaMethodDescriptor]

'mainFile' @ [145:27] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_INNER_CLASS.runRefactoring[ValueParameterDescriptorImpl]

'project' @ [145:36] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'elementsAtCaret' @ [147:31] ==> value-parameter elementsAtCaret: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_INNER_CLASS.runRefactoring[ValueParameterDescriptorImpl]

'single' @ [147:47] ==> public fun <T> List<PsiElement>.single(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'getNonStrictParentOfType' @ [147:56] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): PsiClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> PsiClass

'config' @ [148:32] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_INNER_CLASS.runRefactoring[ValueParameterDescriptorImpl]

'getNullableString' @ [148:39] ==> public fun JsonObject.getNullableString(name: String): String? defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'classToMove' @ [148:76] ==> val classToMove: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_INNER_CLASS.runRefactoring[LocalVariableDescriptor]

'name' @ [148:88] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'config' @ [149:46] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_INNER_CLASS.runRefactoring[ValueParameterDescriptorImpl]

'getNullableString' @ [149:53] ==> public fun JsonObject.getNullableString(name: String): String? defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'config' @ [150:33] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_INNER_CLASS.runRefactoring[ValueParameterDescriptorImpl]

'getString' @ [150:40] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'MoveInnerProcessor' @ [152:13] ==> public constructor MoveInnerProcessor(p0: (Project..Project?), p1: (PsiClass..PsiClass?), p2: (String..String?), p3: Boolean, p4: (String..String?), p5: (PsiElement..PsiElement?)) defined in com.intellij.refactoring.move.moveInner.MoveInnerProcessor[JavaClassConstructorDescriptor]

'project' @ [153:21] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_INNER_CLASS.runRefactoring[LocalVariableDescriptor]

'classToMove' @ [154:21] ==> val classToMove: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_INNER_CLASS.runRefactoring[LocalVariableDescriptor]

'newClassName' @ [155:21] ==> val newClassName: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_INNER_CLASS.runRefactoring[LocalVariableDescriptor]

'outerInstanceParameterName' @ [156:21] ==> val outerInstanceParameterName: String? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_INNER_CLASS.runRefactoring[LocalVariableDescriptor]

'outerInstanceParameterName' @ [157:21] ==> val outerInstanceParameterName: String? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_INNER_CLASS.runRefactoring[LocalVariableDescriptor]

'!!' @ [158:21] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiPackage?): PsiPackage[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiPackage

'getInstance' @ [158:35] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [158:47] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_INNER_CLASS.runRefactoring[LocalVariableDescriptor]

'findPackage' @ [158:56] ==> @Nullable public abstract fun findPackage(@NonNls @NotNull p0: String): PsiPackage? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'targetPackage' @ [158:68] ==> val targetPackage: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_INNER_CLASS.runRefactoring[LocalVariableDescriptor]

'directories' @ [158:85] ==> public final val PsiPackage.directories: (Array<(PsiDirectory..PsiDirectory?)>..Array<out (PsiDirectory..PsiDirectory?)>)[MyPropertyDescriptor]

'run' @ [159:15] ==> public final fun run(): Unit defined in com.intellij.refactoring.move.moveInner.MoveInnerProcessor[JavaMethodDescriptor]

'mainFile' @ [165:27] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[ValueParameterDescriptorImpl]

'project' @ [165:36] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'config' @ [167:33] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[ValueParameterDescriptorImpl]

'getNullableString' @ [167:40] ==> public fun JsonObject.getNullableString(name: String): String? defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'targetPackage' @ [168:33] ==> val targetPackage: String? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[LocalVariableDescriptor]

'replace' @ [168:48] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'config' @ [168:69] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[ValueParameterDescriptorImpl]

'getNullableString' @ [168:76] ==> public fun JsonObject.getNullableString(name: String): String? defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'if (targetDirPath != null) {
                ActionRunner.runInsideWriteAction { VfsUtil.createDirectoryIfMissing(rootDir, targetDirPath) }
                val newParent = if (targetPackage != null) {
                    JavaPsiFacade.getInstance(project).findPackage(targetPackage)!!.directories[0]
                }
                else {
                    rootDir.findFileByRelativePath(targetDirPath)!!.toPsiDirectory(project)!!
                }
                MoveFilesOrDirectoriesProcessor(
                        project,
                        arrayOf(mainFile),
                        newParent,
                        /* searchInComments = */ false,
                        /* searchInNonJavaFiles = */ true,
                        /* moveCallback = */ null,
                        /* prepareSuccessfulCallback = */ null
                ).run()
            }
            else {
                val targetFile = config.getString("targetFile")

                MoveHandler.doMove(
                        project,
                        arrayOf(mainFile),
                        PsiManager.getInstance(project).findFile(rootDir.findFileByRelativePath(targetFile)!!)!!,
                        /* dataContext = */ null,
                        /* callback = */ null
                )
            }' @ [169:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'targetDirPath' @ [169:17] ==> val targetDirPath: String? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[LocalVariableDescriptor]

'runInsideWriteAction' @ [170:30] ==> public final fun runInsideWriteAction(@NotNull p0: () -> Unit): Unit defined in com.intellij.util.ActionRunner[SamAdapterFunctionDescriptor]

'createDirectoryIfMissing' @ [170:61] ==> public open fun createDirectoryIfMissing(@Nullable p0: VirtualFile?, p1: (String..String?)): (VirtualFile..VirtualFile?) defined in com.intellij.openapi.vfs.VfsUtil[JavaMethodDescriptor]

'rootDir' @ [170:86] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[ValueParameterDescriptorImpl]

'targetDirPath' @ [170:95] ==> val targetDirPath: String? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[LocalVariableDescriptor]

'if (targetPackage != null) {
                    JavaPsiFacade.getInstance(project).findPackage(targetPackage)!!.directories[0]
                }
                else {
                    rootDir.findFileByRelativePath(targetDirPath)!!.toPsiDirectory(project)!!
                }' @ [171:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiDirectory..PsiDirectory?), elseBranch: (PsiDirectory..PsiDirectory?)): (PsiDirectory..PsiDirectory?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiDirectory..com.intellij.psi.PsiDirectory?)

'targetPackage' @ [171:37] ==> val targetPackage: String? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[LocalVariableDescriptor]

'!!' @ [172:21] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiPackage?): PsiPackage[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiPackage

'getInstance' @ [172:35] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [172:47] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[LocalVariableDescriptor]

'findPackage' @ [172:56] ==> @Nullable public abstract fun findPackage(@NonNls @NotNull p0: String): PsiPackage? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'targetPackage' @ [172:68] ==> val targetPackage: String? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[LocalVariableDescriptor]

'directories' @ [172:85] ==> public final val PsiPackage.directories: (Array<(PsiDirectory..PsiDirectory?)>..Array<out (PsiDirectory..PsiDirectory?)>)[MyPropertyDescriptor]

'rootDir' @ [175:21] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[ValueParameterDescriptorImpl]

'findFileByRelativePath' @ [175:29] ==> @Nullable public open fun findFileByRelativePath(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'targetDirPath' @ [175:52] ==> val targetDirPath: String? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[LocalVariableDescriptor]

'toPsiDirectory' @ [175:69] ==> public fun VirtualFile.toPsiDirectory(project: Project): PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring[DeserializedSimpleFunctionDescriptor]

'project' @ [175:84] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[LocalVariableDescriptor]

'MoveFilesOrDirectoriesProcessor' @ [177:17] ==> public constructor MoveFilesOrDirectoriesProcessor(p0: (Project..Project?), p1: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?), p2: (PsiDirectory..PsiDirectory?), p3: Boolean, p4: Boolean, p5: (MoveCallback..MoveCallback?), p6: (Runnable..Runnable?)) defined in com.intellij.refactoring.move.moveFilesOrDirectories.MoveFilesOrDirectoriesProcessor[JavaClassConstructorDescriptor]

'project' @ [178:25] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[LocalVariableDescriptor]

'arrayOf' @ [179:25] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiFile): Array<PsiFile> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiFile

'mainFile' @ [179:33] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[ValueParameterDescriptorImpl]

'newParent' @ [180:25] ==> val newParent: (PsiDirectory..PsiDirectory?) defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[LocalVariableDescriptor]

'run' @ [185:19] ==> public final fun run(): Unit defined in com.intellij.refactoring.move.moveFilesOrDirectories.MoveFilesOrDirectoriesProcessor[JavaMethodDescriptor]

'config' @ [188:34] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[ValueParameterDescriptorImpl]

'getString' @ [188:41] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'doMove' @ [190:29] ==> public open fun doMove(p0: (Project..Project?), @NotNull p1: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>), p2: (PsiElement..PsiElement?), p3: (DataContext..DataContext?), p4: (MoveCallback..MoveCallback?)): Unit defined in com.intellij.refactoring.move.MoveHandler[JavaMethodDescriptor]

'project' @ [191:25] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[LocalVariableDescriptor]

'arrayOf' @ [192:25] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiFile): Array<PsiFile> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiFile

'mainFile' @ [192:33] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[ValueParameterDescriptorImpl]

'!!' @ [193:25] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiFile?): PsiFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiFile

'getInstance' @ [193:36] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [193:48] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[LocalVariableDescriptor]

'findFile' @ [193:57] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'rootDir' @ [193:66] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[ValueParameterDescriptorImpl]

'findFileByRelativePath' @ [193:74] ==> @Nullable public open fun findFileByRelativePath(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'targetFile' @ [193:97] ==> val targetFile: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES.runRefactoring[LocalVariableDescriptor]

'mainFile' @ [203:27] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES_WITH_DECLARATIONS.runRefactoring[ValueParameterDescriptorImpl]

'project' @ [203:36] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'config' @ [204:34] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES_WITH_DECLARATIONS.runRefactoring[ValueParameterDescriptorImpl]

'getAsJsonArray' @ [204:41] ==> public open fun getAsJsonArray(p0: (String..String?)): (JsonArray..JsonArray?) defined in com.google.gson.JsonObject[JavaMethodDescriptor]

'map' @ [204:71] ==> public inline fun <T, R> Iterable<(JsonElement..JsonElement?)>.map(transform: ((JsonElement..JsonElement?)) -> PsiFileSystemItem): List<PsiFileSystemItem> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.google.gson.JsonElement..com.google.gson.JsonElement?)
    <R> -> PsiFileSystemItem

'rootDir' @ [205:35] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES_WITH_DECLARATIONS.runRefactoring[ValueParameterDescriptorImpl]

'findFileByRelativePath' @ [205:43] ==> @Nullable public open fun findFileByRelativePath(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'it' @ [205:66] ==> value-parameter it: (JsonElement..JsonElement?) defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES_WITH_DECLARATIONS.runRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [205:69] ==> public final val JsonElement.asString: (String..String?)[MyPropertyDescriptor]

'if (virtualFile.isDirectory) virtualFile.toPsiDirectory(project)!! else virtualFile.toPsiFile(project)!!' @ [206:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiFileSystemItem, elseBranch: PsiFileSystemItem): PsiFileSystemItem[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiFileSystemItem

'virtualFile' @ [206:21] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES_WITH_DECLARATIONS.runRefactoring.<anonymous>[LocalVariableDescriptor]

'isDirectory' @ [206:33] ==> public final val VirtualFile.isDirectory: Boolean[MyPropertyDescriptor]

'virtualFile' @ [206:46] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES_WITH_DECLARATIONS.runRefactoring.<anonymous>[LocalVariableDescriptor]

'toPsiDirectory' @ [206:58] ==> public fun VirtualFile.toPsiDirectory(project: Project): PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring[DeserializedSimpleFunctionDescriptor]

'project' @ [206:73] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES_WITH_DECLARATIONS.runRefactoring[LocalVariableDescriptor]

'virtualFile' @ [206:89] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES_WITH_DECLARATIONS.runRefactoring.<anonymous>[LocalVariableDescriptor]

'toPsiFile' @ [206:101] ==> public fun VirtualFile.toPsiFile(project: Project): PsiFile? defined in org.jetbrains.kotlin.idea.refactoring[DeserializedSimpleFunctionDescriptor]

'project' @ [206:111] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES_WITH_DECLARATIONS.runRefactoring[LocalVariableDescriptor]

'config' @ [208:33] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES_WITH_DECLARATIONS.runRefactoring[ValueParameterDescriptorImpl]

'getString' @ [208:40] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'rootDir' @ [209:29] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES_WITH_DECLARATIONS.runRefactoring[ValueParameterDescriptorImpl]

'findFileByRelativePath' @ [209:37] ==> @Nullable public open fun findFileByRelativePath(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'targetDirPath' @ [209:60] ==> val targetDirPath: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES_WITH_DECLARATIONS.runRefactoring[LocalVariableDescriptor]

'toPsiDirectory' @ [209:77] ==> public fun VirtualFile.toPsiDirectory(project: Project): PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring[DeserializedSimpleFunctionDescriptor]

'project' @ [209:92] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES_WITH_DECLARATIONS.runRefactoring[LocalVariableDescriptor]

'KotlinAwareMoveFilesOrDirectoriesProcessor' @ [210:13] ==> @JvmOverloads public constructor KotlinAwareMoveFilesOrDirectoriesProcessor(project: Project, elementsToMove: List<PsiElement>, targetDirectory: PsiDirectory, searchInComments: Boolean, searchInNonJavaFiles: Boolean, moveCallback: MoveCallback?, prepareSuccessfulCallback: Runnable = ...) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor[DeserializedClassConstructorDescriptor]

'project' @ [211:21] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES_WITH_DECLARATIONS.runRefactoring[LocalVariableDescriptor]

'elementsToMove' @ [212:21] ==> val elementsToMove: List<PsiFileSystemItem> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES_WITH_DECLARATIONS.runRefactoring[LocalVariableDescriptor]

'targetDir' @ [213:21] ==> val targetDir: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_FILES_WITH_DECLARATIONS.runRefactoring[LocalVariableDescriptor]

'run' @ [217:15] ==> public final fun run(): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinAwareMoveFilesOrDirectoriesProcessor[JavaMethodDescriptor]

'mainFile' @ [223:27] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[ValueParameterDescriptorImpl]

'project' @ [223:36] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'elementsAtCaret' @ [224:34] ==> value-parameter elementsAtCaret: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[ValueParameterDescriptorImpl]

'map' @ [224:50] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> KtNamedDeclaration): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> KtNamedDeclaration

'it' @ [224:56] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [224:59] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtNamedDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedDeclaration

'config' @ [226:30] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[ValueParameterDescriptorImpl]

'getNullableString' @ [226:37] ==> public fun JsonObject.getNullableString(name: String): String? defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'let' @ [226:73] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> KotlinMoveTargetForDeferredFile): KotlinMoveTargetForDeferredFile defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> KotlinMoveTargetForDeferredFile

'config' @ [227:44] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[ValueParameterDescriptorImpl]

'asString' @ [227:72] ==> public final val JsonElement.asString: (String..String?)[MyPropertyDescriptor]

'PackageWrapper' @ [228:38] ==> public constructor PackageWrapper(p0: (PsiManager..PsiManager?), @NotNull p1: String) defined in com.intellij.refactoring.PackageWrapper[JavaClassConstructorDescriptor]

'mainFile' @ [228:53] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[ValueParameterDescriptorImpl]

'manager' @ [228:62] ==> public final val PsiFile.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'packageName' @ [228:71] ==> value-parameter packageName: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'targetSourceRootPath' @ [229:56] ==> val targetSourceRootPath: String? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring.<anonymous>[LocalVariableDescriptor]

'let' @ [229:78] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> AutocreatingSingleSourceRootMoveDestination): AutocreatingSingleSourceRootMoveDestination defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> AutocreatingSingleSourceRootMoveDestination

'AutocreatingSingleSourceRootMoveDestination' @ [230:21] ==> public constructor AutocreatingSingleSourceRootMoveDestination(p0: (PackageWrapper..PackageWrapper?), @NotNull p1: VirtualFile) defined in com.intellij.refactoring.move.moveClassesOrPackages.AutocreatingSingleSourceRootMoveDestination[JavaClassConstructorDescriptor]

'packageWrapper' @ [230:65] ==> val packageWrapper: PackageWrapper defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring.<anonymous>[LocalVariableDescriptor]

'rootDir' @ [230:81] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[ValueParameterDescriptorImpl]

'findFileByRelativePath' @ [230:89] ==> @Nullable public open fun findFileByRelativePath(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'it' @ [230:112] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'MultipleRootsMoveDestination' @ [231:22] ==> public constructor MultipleRootsMoveDestination(p0: (PackageWrapper..PackageWrapper?)) defined in com.intellij.refactoring.move.moveClassesOrPackages.MultipleRootsMoveDestination[JavaClassConstructorDescriptor]

'packageWrapper' @ [231:51] ==> val packageWrapper: PackageWrapper defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring.<anonymous>[LocalVariableDescriptor]

'moveDestination' @ [232:33] ==> val moveDestination: MoveDestination defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring.<anonymous>[LocalVariableDescriptor]

'getTargetIfExists' @ [232:49] ==> public abstract fun getTargetIfExists(p0: (PsiFile..PsiFile?)): (PsiDirectory..PsiDirectory?) defined in com.intellij.refactoring.MoveDestination[JavaMethodDescriptor]

'mainFile' @ [232:67] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[ValueParameterDescriptorImpl]

'if (targetSourceRootPath != null) {
                    rootDir.findFileByRelativePath(targetSourceRootPath)!!
                } else {
                    targetDir?.virtualFile
                }' @ [233:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: VirtualFile?, elseBranch: VirtualFile?): VirtualFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> VirtualFile?

'targetSourceRootPath' @ [233:45] ==> val targetSourceRootPath: String? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring.<anonymous>[LocalVariableDescriptor]

'rootDir' @ [234:21] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[ValueParameterDescriptorImpl]

'findFileByRelativePath' @ [234:29] ==> @Nullable public open fun findFileByRelativePath(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'targetSourceRootPath' @ [234:52] ==> val targetSourceRootPath: String? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring.<anonymous>[LocalVariableDescriptor]

'targetDir' @ [236:21] ==> val targetDir: (PsiDirectory..PsiDirectory?) defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring.<anonymous>[LocalVariableDescriptor]

'virtualFile' @ [236:32] ==> public final val PsiDirectory.virtualFile: VirtualFile[MyPropertyDescriptor]

'KotlinMoveTargetForDeferredFile' @ [239:17] ==> public constructor KotlinMoveTargetForDeferredFile(targetContainerFqName: FqName, directory: PsiDirectory?, targetFile: VirtualFile? = ..., createFile: (KtFile) -> KtFile?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTargetForDeferredFile[DeserializedClassConstructorDescriptor]

'FqName' @ [239:49] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'packageName' @ [239:56] ==> value-parameter packageName: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'targetDir' @ [239:70] ==> val targetDir: (PsiDirectory..PsiDirectory?) defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring.<anonymous>[LocalVariableDescriptor]

'targetVirtualFile' @ [239:81] ==> val targetVirtualFile: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring.<anonymous>[LocalVariableDescriptor]

'createKotlinFile' @ [240:21] ==> public fun createKotlinFile(fileName: String, targetDir: PsiDirectory, packageName: String? = ...): KtFile defined in org.jetbrains.kotlin.idea.refactoring[DeserializedSimpleFunctionDescriptor]

'guessNewFileName' @ [240:38] ==> public fun guessNewFileName(declarationsToMove: Collection<KtNamedDeclaration>): String? defined in org.jetbrains.kotlin.idea.refactoring.move[DeserializedSimpleFunctionDescriptor]

'elementsToMove' @ [240:55] ==> val elementsToMove: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[LocalVariableDescriptor]

'moveDestination' @ [240:74] ==> val moveDestination: MoveDestination defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring.<anonymous>[LocalVariableDescriptor]

'getTargetDirectory' @ [240:90] ==> public abstract fun getTargetDirectory(p0: (PsiFile..PsiFile?)): (PsiDirectory..PsiDirectory?) defined in com.intellij.refactoring.MoveDestination[JavaMethodDescriptor]

'mainFile' @ [240:109] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[ValueParameterDescriptorImpl]

'config' @ [242:18] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[ValueParameterDescriptorImpl]

'getString' @ [242:25] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'let' @ [242:49] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> KotlinMoveTargetForExistingElement): KotlinMoveTargetForExistingElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> KotlinMoveTargetForExistingElement

'KotlinMoveTargetForExistingElement' @ [243:17] ==> public constructor KotlinMoveTargetForExistingElement(targetElement: KtElement) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTargetForExistingElement[DeserializedClassConstructorDescriptor]

'getInstance' @ [243:63] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [243:75] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[LocalVariableDescriptor]

'findFile' @ [243:84] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'rootDir' @ [243:93] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[ValueParameterDescriptorImpl]

'findFileByRelativePath' @ [243:101] ==> @Nullable public open fun findFileByRelativePath(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'filePath' @ [243:124] ==> value-parameter filePath: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'MoveDeclarationsDescriptor' @ [246:30] ==> @JvmOverloads public constructor MoveDeclarationsDescriptor(project: Project, elementsToMove: Collection<KtNamedDeclaration>, moveTarget: KotlinMoveTarget, delegate: MoveDeclarationsDelegate, searchInCommentsAndStrings: Boolean = ..., searchInNonCode: Boolean = ..., scanEntireFile: Boolean = ..., deleteSourceFiles: Boolean = ..., moveCallback: MoveCallback? = ..., openInEditor: Boolean = ..., allElementsToMove: List<PsiElement>? = ...) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[DeserializedClassConstructorDescriptor]

'project' @ [246:57] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[LocalVariableDescriptor]

'elementsToMove' @ [246:66] ==> val elementsToMove: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[LocalVariableDescriptor]

'moveTarget' @ [246:82] ==> val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[LocalVariableDescriptor]

'TopLevel' @ [246:119] ==> public object TopLevel : MoveDeclarationsDelegate defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate[FakeCallableDescriptorForObject]

'MoveKotlinDeclarationsProcessor' @ [247:13] ==> public constructor MoveKotlinDeclarationsProcessor(descriptor: MoveDeclarationsDescriptor, mover: Mover = ...) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[DeserializedClassConstructorDescriptor]

'descriptor' @ [247:45] ==> val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_TOP_LEVEL_DECLARATIONS.runRefactoring[LocalVariableDescriptor]

'run' @ [247:57] ==> public final fun run(): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[JavaMethodDescriptor]

'KotlinChangePackageRefactoring' @ [253:13] ==> public constructor KotlinChangePackageRefactoring(file: KtFile) defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring[DeserializedClassConstructorDescriptor]

'mainFile' @ [253:44] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.CHANGE_PACKAGE_DIRECTIVE.runRefactoring[ValueParameterDescriptorImpl]

'run' @ [253:64] ==> public final fun run(newFqName: FqName): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring[DeserializedSimpleFunctionDescriptor]

'FqName' @ [253:68] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'config' @ [253:75] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.CHANGE_PACKAGE_DIRECTIVE.runRefactoring[ValueParameterDescriptorImpl]

'getString' @ [253:82] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'mainFile' @ [259:27] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_DIRECTORY_WITH_CLASSES.runRefactoring[ValueParameterDescriptorImpl]

'project' @ [259:36] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'rootDir' @ [260:29] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_DIRECTORY_WITH_CLASSES.runRefactoring[ValueParameterDescriptorImpl]

'findFileByRelativePath' @ [260:37] ==> @Nullable public open fun findFileByRelativePath(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'config' @ [260:60] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_DIRECTORY_WITH_CLASSES.runRefactoring[ValueParameterDescriptorImpl]

'getString' @ [260:67] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'toPsiDirectory' @ [260:93] ==> public fun VirtualFile.toPsiDirectory(project: Project): PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring[DeserializedSimpleFunctionDescriptor]

'project' @ [260:108] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_DIRECTORY_WITH_CLASSES.runRefactoring[LocalVariableDescriptor]

'rootDir' @ [261:29] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_DIRECTORY_WITH_CLASSES.runRefactoring[ValueParameterDescriptorImpl]

'findFileByRelativePath' @ [261:37] ==> @Nullable public open fun findFileByRelativePath(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'config' @ [261:60] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_DIRECTORY_WITH_CLASSES.runRefactoring[ValueParameterDescriptorImpl]

'getString' @ [261:67] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'toPsiDirectory' @ [261:93] ==> public fun VirtualFile.toPsiDirectory(project: Project): PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring[DeserializedSimpleFunctionDescriptor]

'project' @ [261:108] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_DIRECTORY_WITH_CLASSES.runRefactoring[LocalVariableDescriptor]

'MoveDirectoryWithClassesProcessor' @ [262:13] ==> public constructor MoveDirectoryWithClassesProcessor(p0: (Project..Project?), p1: (Array<(PsiDirectory..PsiDirectory?)>..Array<out (PsiDirectory..PsiDirectory?)>?), p2: (PsiDirectory..PsiDirectory?), p3: Boolean, p4: Boolean, p5: Boolean, p6: (() -> Unit..(() -> Unit)?)) defined in com.intellij.refactoring.move.moveClassesOrPackages.MoveDirectoryWithClassesProcessor[SamAdapterClassConstructorDescriptor]

'project' @ [262:47] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_DIRECTORY_WITH_CLASSES.runRefactoring[LocalVariableDescriptor]

'arrayOf' @ [262:56] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiDirectory): Array<PsiDirectory> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiDirectory

'sourceDir' @ [262:64] ==> val sourceDir: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_DIRECTORY_WITH_CLASSES.runRefactoring[LocalVariableDescriptor]

'targetDir' @ [262:76] ==> val targetDir: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_DIRECTORY_WITH_CLASSES.runRefactoring[LocalVariableDescriptor]

'run' @ [262:109] ==> public final fun run(): Unit defined in com.intellij.refactoring.move.moveClassesOrPackages.MoveDirectoryWithClassesProcessor[JavaMethodDescriptor]

'mainFile' @ [268:27] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[ValueParameterDescriptorImpl]

'project' @ [268:36] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'elementsAtCaret' @ [269:33] ==> value-parameter elementsAtCaret: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[ValueParameterDescriptorImpl]

'single' @ [269:49] ==> public fun <T> List<PsiElement>.single(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'getNonStrictParentOfType' @ [269:58] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'config' @ [270:35] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[ValueParameterDescriptorImpl]

'getNullableString' @ [270:42] ==> public fun JsonObject.getNullableString(name: String): String? defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'if (targetClassName != null) {
                        KotlinFullClassNameIndex.getInstance().get(targetClassName, project, project.projectScope()).first()!!
                    }
                    else null' @ [272:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtClassOrObject?, elseBranch: KtClassOrObject?): KtClassOrObject?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtClassOrObject?

'targetClassName' @ [272:25] ==> val targetClassName: String? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'!!' @ [273:25] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtClassOrObject?): KtClassOrObject[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtClassOrObject

'getInstance' @ [273:50] ==> @NotNull public open fun getInstance(): KotlinFullClassNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinFullClassNameIndex[JavaMethodDescriptor]

'get' @ [273:64] ==> @NotNull public open fun get(@NotNull p0: String, @NotNull p1: Project, @NotNull p2: GlobalSearchScope): (MutableCollection<(KtClassOrObject..KtClassOrObject?)>..Collection<(KtClassOrObject..KtClassOrObject?)>) defined in org.jetbrains.kotlin.idea.stubindex.KotlinFullClassNameIndex[JavaMethodDescriptor]

'targetClassName' @ [273:68] ==> val targetClassName: String? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'project' @ [273:85] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'project' @ [273:94] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'projectScope' @ [273:102] ==> public fun Project.projectScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search[DeserializedSimpleFunctionDescriptor]

'first' @ [273:118] ==> public fun <T> Iterable<(KtClassOrObject..KtClassOrObject?)>.first(): (KtClassOrObject..KtClassOrObject?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)

'NestedClass' @ [276:53] ==> public constructor NestedClass(newClassName: String? = ..., outerInstanceParameterName: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass[DeserializedClassConstructorDescriptor]

'config' @ [276:65] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[ValueParameterDescriptorImpl]

'getNullableString' @ [276:72] ==> public fun JsonObject.getNullableString(name: String): String? defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'config' @ [277:65] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[ValueParameterDescriptorImpl]

'getNullableString' @ [277:72] ==> public fun JsonObject.getNullableString(name: String): String? defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'if (targetClass != null) {
                        KotlinMoveTargetForExistingElement(targetClass)
                    }
                    else {
                        val fileName = (delegate.newClassName ?: elementToMove.name!!) + ".kt"
                        val targetPackageFqName = (mainFile as KtFile).packageFqName
                        val targetDir = mainFile.containingDirectory!!
                        KotlinMoveTargetForDeferredFile(targetPackageFqName, targetDir, null) {
                            createKotlinFile(fileName, targetDir, targetPackageFqName.asString())
                        }
                    }' @ [279:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinMoveTarget, elseBranch: KotlinMoveTarget): KotlinMoveTarget[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinMoveTarget

'targetClass' @ [279:25] ==> val targetClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'KotlinMoveTargetForExistingElement' @ [280:25] ==> public constructor KotlinMoveTargetForExistingElement(targetElement: KtElement) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTargetForExistingElement[DeserializedClassConstructorDescriptor]

'targetClass' @ [280:60] ==> val targetClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'+' @ [283:40] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'delegate' @ [283:41] ==> val delegate: MoveDeclarationsDelegate.NestedClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'newClassName' @ [283:50] ==> public final val newClassName: String? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass[DeserializedPropertyDescriptor]

'elementToMove' @ [283:66] ==> val elementToMove: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'name' @ [283:80] ==> public final val KtClassOrObject.name: String?[MyPropertyDescriptor]

'mainFile' @ [284:52] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[ValueParameterDescriptorImpl]

'packageFqName' @ [284:72] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'mainFile' @ [285:41] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[ValueParameterDescriptorImpl]

'containingDirectory' @ [285:50] ==> public final val KtFile.containingDirectory: PsiDirectory?[MyPropertyDescriptor]

'KotlinMoveTargetForDeferredFile' @ [286:25] ==> public constructor KotlinMoveTargetForDeferredFile(targetContainerFqName: FqName, directory: PsiDirectory?, targetFile: VirtualFile? = ..., createFile: (KtFile) -> KtFile?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTargetForDeferredFile[DeserializedClassConstructorDescriptor]

'targetPackageFqName' @ [286:57] ==> val targetPackageFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'targetDir' @ [286:78] ==> val targetDir: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'createKotlinFile' @ [287:29] ==> public fun createKotlinFile(fileName: String, targetDir: PsiDirectory, packageName: String? = ...): KtFile defined in org.jetbrains.kotlin.idea.refactoring[DeserializedSimpleFunctionDescriptor]

'fileName' @ [287:46] ==> val fileName: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'targetDir' @ [287:56] ==> val targetDir: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'targetPackageFqName' @ [287:67] ==> val targetPackageFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'asString' @ [287:87] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'MoveDeclarationsDescriptor' @ [290:30] ==> @JvmOverloads public constructor MoveDeclarationsDescriptor(project: Project, elementsToMove: Collection<KtNamedDeclaration>, moveTarget: KotlinMoveTarget, delegate: MoveDeclarationsDelegate, searchInCommentsAndStrings: Boolean = ..., searchInNonCode: Boolean = ..., scanEntireFile: Boolean = ..., deleteSourceFiles: Boolean = ..., moveCallback: MoveCallback? = ..., openInEditor: Boolean = ..., allElementsToMove: List<PsiElement>? = ...) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[DeserializedClassConstructorDescriptor]

'project' @ [290:57] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'listOf' @ [290:66] ==> public fun <T> listOf(element: KtClassOrObject): List<KtClassOrObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'elementToMove' @ [290:73] ==> val elementToMove: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'moveTarget' @ [290:89] ==> val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'delegate' @ [290:101] ==> val delegate: MoveDeclarationsDelegate.NestedClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'MoveKotlinDeclarationsProcessor' @ [291:13] ==> public constructor MoveKotlinDeclarationsProcessor(descriptor: MoveDeclarationsDescriptor, mover: Mover = ...) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[DeserializedClassConstructorDescriptor]

'descriptor' @ [291:45] ==> val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.MoveAction.MOVE_KOTLIN_NESTED_CLASS.runRefactoring[LocalVariableDescriptor]

'run' @ [291:57] ==> public final fun run(): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[JavaMethodDescriptor]

