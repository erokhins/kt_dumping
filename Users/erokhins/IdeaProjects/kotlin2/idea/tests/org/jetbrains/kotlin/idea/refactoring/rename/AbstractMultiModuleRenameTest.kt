'KotlinMultiFileTestCase' @ [26:48] ==> public constructor KotlinMultiFileTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase[ClassConstructorDescriptorImpl]

'getTestDataPathBase' @ [28:65] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'loadTestConfiguration' @ [31:34] ==> public fun loadTestConfiguration(testFile: File): JsonObject defined in org.jetbrains.kotlin.idea.refactoring.rename in file AbstractRenameTest.kt[SimpleFunctionDescriptorImpl]

'File' @ [31:56] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [31:61] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractMultiModuleRenameTest.doTest[ValueParameterDescriptorImpl]

'renameParamsObject' @ [33:20] ==> val renameParamsObject: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractMultiModuleRenameTest.doTest[LocalVariableDescriptor]

'getString' @ [33:39] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'renameParamsObject' @ [34:23] ==> val renameParamsObject: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractMultiModuleRenameTest.doTest[LocalVariableDescriptor]

'getString' @ [34:42] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'isMultiModule' @ [36:9] ==> protected final var isMultiModule: Boolean defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractMultiModuleRenameTest[PropertyDescriptorImpl]

'doTestCommittingDocuments' @ [38:9] ==> protected final fun doTestCommittingDocuments(action: (VirtualFile, VirtualFile?) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractMultiModuleRenameTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [39:28] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractMultiModuleRenameTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'findFileByRelativePath' @ [39:36] ==> @Nullable public open fun findFileByRelativePath(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'file' @ [39:59] ==> val file: String defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractMultiModuleRenameTest.doTest[LocalVariableDescriptor]

'!!' @ [40:27] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiFile?): PsiFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiFile

'getInstance' @ [40:38] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [40:50] ==> public final val AbstractMultiModuleRenameTest.project: (Project..Project?)[MyPropertyDescriptor]

'findFile' @ [40:59] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'mainFile' @ [40:68] ==> val mainFile: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractMultiModuleRenameTest.doTest.<anonymous>[LocalVariableDescriptor]

'renameParamsObject' @ [42:30] ==> val renameParamsObject: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractMultiModuleRenameTest.doTest[LocalVariableDescriptor]

'getString' @ [42:49] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'when (RenameType.valueOf(renameType)) {
                RenameType.FILE -> runRenameProcessor(project, newName, psiFile, renameParamsObject, true, true)
                RenameType.MARKED_ELEMENT -> doRenameMarkedElement(renameParamsObject, psiFile)
                else -> TestCase.fail("Unexpected rename type: $renameType")
            }' @ [44:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'valueOf' @ [44:30] ==> public final fun valueOf(value: String): RenameType defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameType[SimpleFunctionDescriptorImpl]

'renameType' @ [44:38] ==> val renameType: String defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractMultiModuleRenameTest.doTest.<anonymous>[LocalVariableDescriptor]

'FILE' @ [45:28] ==> enum entry FILE defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameType[FakeCallableDescriptorForObject]

'runRenameProcessor' @ [45:36] ==> public fun runRenameProcessor(project: Project, newName: String, substitution: PsiElement?, renameParamsObject: JsonObject, isSearchInComments: Boolean, isSearchTextOccurrences: Boolean): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename in file AbstractRenameTest.kt[SimpleFunctionDescriptorImpl]

'project' @ [45:55] ==> public final val AbstractMultiModuleRenameTest.project: (Project..Project?)[MyPropertyDescriptor]

'newName' @ [45:64] ==> val newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractMultiModuleRenameTest.doTest[LocalVariableDescriptor]

'psiFile' @ [45:73] ==> val psiFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractMultiModuleRenameTest.doTest.<anonymous>[LocalVariableDescriptor]

'renameParamsObject' @ [45:82] ==> val renameParamsObject: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractMultiModuleRenameTest.doTest[LocalVariableDescriptor]

'MARKED_ELEMENT' @ [46:28] ==> enum entry MARKED_ELEMENT defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameType[FakeCallableDescriptorForObject]

'doRenameMarkedElement' @ [46:46] ==> public fun doRenameMarkedElement(renameParamsObject: JsonObject, psiFile: PsiFile): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename in file AbstractRenameTest.kt[SimpleFunctionDescriptorImpl]

'renameParamsObject' @ [46:68] ==> val renameParamsObject: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractMultiModuleRenameTest.doTest[LocalVariableDescriptor]

'psiFile' @ [46:88] ==> val psiFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractMultiModuleRenameTest.doTest.<anonymous>[LocalVariableDescriptor]

'fail' @ [47:34] ==> public open fun fail(p0: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'renameType' @ [47:65] ==> val renameType: String defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractMultiModuleRenameTest.doTest.<anonymous>[LocalVariableDescriptor]

