'AbstractMultifileRefactoringTest' @ [36:35] ==> public constructor AbstractMultifileRefactoringTest() defined in org.jetbrains.kotlin.idea.refactoring.AbstractMultifileRefactoringTest[ClassConstructorDescriptorImpl]

'runRefactoringTest' @ [39:13] ==> public fun runRefactoringTest(path: String, config: JsonObject, rootDir: VirtualFile, project: Project, action: AbstractMultifileRefactoringTest.RefactoringAction): Unit defined in org.jetbrains.kotlin.idea.refactoring in file AbstractMultifileRefactoringTest.kt[SimpleFunctionDescriptorImpl]

'path' @ [39:32] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runCopyRefactoring[ValueParameterDescriptorImpl]

'config' @ [39:38] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runCopyRefactoring[ValueParameterDescriptorImpl]

'rootDir' @ [39:46] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runCopyRefactoring[ValueParameterDescriptorImpl]

'project' @ [39:55] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runCopyRefactoring[ValueParameterDescriptorImpl]

'this' @ [39:64] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion[LazyClassReceiverParameterDescriptor]

'mainFile' @ [43:27] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runRefactoring[ValueParameterDescriptorImpl]

'project' @ [43:36] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'elementsAtCaret' @ [45:34] ==> value-parameter elementsAtCaret: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runRefactoring[ValueParameterDescriptorImpl]

'ifEmpty' @ [45:50] ==> public inline fun <T, C : Collection<PsiElement>> List<PsiElement>.ifEmpty(body: () -> List<PsiElement>): List<PsiElement> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <C : Collection<T>> -> List<PsiElement>

'listOf' @ [45:60] ==> public fun <T> listOf(element: PsiFile): List<PsiFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiFile

'mainFile' @ [45:67] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runRefactoring[ValueParameterDescriptorImpl]

'toTypedArray' @ [45:79] ==> public inline fun <reified T> Collection<PsiElement>.toTypedArray(): Array<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiElement

'assert' @ [46:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'canCopy' @ [46:32] ==> public open fun canCopy(p0: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?)): Boolean defined in com.intellij.refactoring.copy.CopyHandler[JavaMethodDescriptor]

'elementsToCopy' @ [46:40] ==> val elementsToCopy: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runRefactoring[LocalVariableDescriptor]

'config' @ [48:35] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runRefactoring[ValueParameterDescriptorImpl]

'getNullableString' @ [48:42] ==> public fun JsonObject.getNullableString(name: String): String? defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'let' @ [48:80] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> PsiDirectory?): PsiDirectory? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> PsiDirectory?

'rootDir' @ [49:17] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runRefactoring[ValueParameterDescriptorImpl]

'findFileByRelativePath' @ [49:25] ==> @Nullable public open fun findFileByRelativePath(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'it' @ [49:48] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'toPsiDirectory' @ [49:53] ==> public fun VirtualFile.toPsiDirectory(project: Project): PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring[DeserializedSimpleFunctionDescriptor]

'project' @ [49:68] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runRefactoring[LocalVariableDescriptor]

'run' @ [51:16] ==> @InlineOnly public inline fun <T, R> AbstractCopyTest.Companion.run(block: AbstractCopyTest.Companion.() -> (PsiDirectory..PsiDirectory?)): (PsiDirectory..PsiDirectory?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Companion
    <R> -> (com.intellij.psi.PsiDirectory..com.intellij.psi.PsiDirectory?)

'PackageWrapper' @ [52:38] ==> public constructor PackageWrapper(p0: (PsiManager..PsiManager?), @NotNull p1: String) defined in com.intellij.refactoring.PackageWrapper[JavaClassConstructorDescriptor]

'mainFile' @ [52:53] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runRefactoring[ValueParameterDescriptorImpl]

'manager' @ [52:62] ==> public final val PsiFile.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'config' @ [52:71] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runRefactoring[ValueParameterDescriptorImpl]

'getString' @ [52:78] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'runWriteAction' @ [53:17] ==> public fun <T> runWriteAction(action: () -> (PsiDirectory..PsiDirectory?)): (PsiDirectory..PsiDirectory?) defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiDirectory..com.intellij.psi.PsiDirectory?)

'MultipleRootsMoveDestination' @ [53:34] ==> public constructor MultipleRootsMoveDestination(p0: (PackageWrapper..PackageWrapper?)) defined in com.intellij.refactoring.move.moveClassesOrPackages.MultipleRootsMoveDestination[JavaClassConstructorDescriptor]

'packageWrapper' @ [53:63] ==> val packageWrapper: PackageWrapper defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runRefactoring.<anonymous>[LocalVariableDescriptor]

'getTargetDirectory' @ [53:79] ==> public open fun getTargetDirectory(p0: (PsiFile..PsiFile?)): (PsiDirectory..PsiDirectory?) defined in com.intellij.refactoring.move.moveClassesOrPackages.MultipleRootsMoveDestination[JavaMethodDescriptor]

'mainFile' @ [53:98] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runRefactoring[ValueParameterDescriptorImpl]

'project' @ [56:13] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runRefactoring[LocalVariableDescriptor]

'newName' @ [56:21] ==> public final var Project.newName: String? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.Companion[PropertyImportedFromObject]

'config' @ [56:31] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runRefactoring[ValueParameterDescriptorImpl]

'getNullableString' @ [56:38] ==> public fun JsonObject.getNullableString(name: String): String? defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'doCopy' @ [58:25] ==> public open fun doCopy(p0: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?), p1: (PsiDirectory..PsiDirectory?)): Unit defined in com.intellij.refactoring.copy.CopyHandler[JavaMethodDescriptor]

'elementsToCopy' @ [58:32] ==> val elementsToCopy: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runRefactoring[LocalVariableDescriptor]

'targetDirectory' @ [58:48] ==> val targetDirectory: (PsiDirectory..PsiDirectory?) defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion.runRefactoring[LocalVariableDescriptor]

'runCopyRefactoring' @ [63:9] ==> public final fun runCopyRefactoring(path: String, config: JsonObject, rootDir: VirtualFile, project: Project): Unit defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.Companion[SimpleFunctionDescriptorImpl]

'path' @ [63:28] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.runRefactoring[ValueParameterDescriptorImpl]

'config' @ [63:34] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.runRefactoring[ValueParameterDescriptorImpl]

'rootDir' @ [63:42] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.runRefactoring[ValueParameterDescriptorImpl]

'project' @ [63:51] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.copy.AbstractCopyTest.runRefactoring[ValueParameterDescriptorImpl]

