'AbstractCodeInsightActionTest' @ [24:62] ==> public constructor AbstractCodeInsightActionTest() defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractCodeInsightActionTest[ClassConstructorDescriptorImpl]

'myModule' @ [26:22] ==> protected/*protected and package*/ final var myModule: (Module..Module?) defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractGenerateTestSupportMethodActionTest[JavaPropertyDescriptor]

'getInstance' @ [27:39] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [27:51] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractGenerateTestSupportMethodActionTest.setUpTestSourceRoot[LocalVariableDescriptor]

'modifiableModel' @ [27:59] ==> public final val ModuleRootManager.modifiableModel: ModifiableRootModel[MyPropertyDescriptor]

'model' @ [28:21] ==> val model: ModifiableRootModel defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractGenerateTestSupportMethodActionTest.setUpTestSourceRoot[LocalVariableDescriptor]

'contentEntries' @ [28:27] ==> public final val ModifiableRootModel.contentEntries: (Array<(ContentEntry..ContentEntry?)>..Array<out (ContentEntry..ContentEntry?)>)[MyPropertyDescriptor]

'single' @ [28:42] ==> public fun <T> Array<out (ContentEntry..ContentEntry?)>.single(): (ContentEntry..ContentEntry?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.ContentEntry..com.intellij.openapi.roots.ContentEntry?)

'entry' @ [29:32] ==> val entry: (ContentEntry..ContentEntry?) defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractGenerateTestSupportMethodActionTest.setUpTestSourceRoot[LocalVariableDescriptor]

'sourceFolderFiles' @ [29:38] ==> public final val ContentEntry.sourceFolderFiles: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>)[MyPropertyDescriptor]

'single' @ [29:56] ==> public fun <T> Array<out (VirtualFile..VirtualFile?)>.single(): (VirtualFile..VirtualFile?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'entry' @ [30:9] ==> val entry: (ContentEntry..ContentEntry?) defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractGenerateTestSupportMethodActionTest.setUpTestSourceRoot[LocalVariableDescriptor]

'removeSourceFolder' @ [30:15] ==> public abstract fun removeSourceFolder(@NotNull p0: SourceFolder): Unit defined in com.intellij.openapi.roots.ContentEntry[JavaMethodDescriptor]

'entry' @ [30:34] ==> val entry: (ContentEntry..ContentEntry?) defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractGenerateTestSupportMethodActionTest.setUpTestSourceRoot[LocalVariableDescriptor]

'sourceFolders' @ [30:40] ==> public final val ContentEntry.sourceFolders: (Array<(SourceFolder..SourceFolder?)>..Array<out (SourceFolder..SourceFolder?)>)[MyPropertyDescriptor]

'single' @ [30:54] ==> public fun <T> Array<out (SourceFolder..SourceFolder?)>.single(): (SourceFolder..SourceFolder?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.SourceFolder..com.intellij.openapi.roots.SourceFolder?)

'entry' @ [31:9] ==> val entry: (ContentEntry..ContentEntry?) defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractGenerateTestSupportMethodActionTest.setUpTestSourceRoot[LocalVariableDescriptor]

'addSourceFolder' @ [31:15] ==> @NotNull public abstract fun addSourceFolder(@NotNull p0: VirtualFile, p1: Boolean): SourceFolder defined in com.intellij.openapi.roots.ContentEntry[JavaMethodDescriptor]

'sourceFolderFile' @ [31:31] ==> val sourceFolderFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractGenerateTestSupportMethodActionTest.setUpTestSourceRoot[LocalVariableDescriptor]

'runWriteAction' @ [32:9] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'model' @ [33:13] ==> val model: ModifiableRootModel defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractGenerateTestSupportMethodActionTest.setUpTestSourceRoot[LocalVariableDescriptor]

'commit' @ [33:19] ==> public abstract fun commit(): Unit defined in com.intellij.openapi.roots.ModifiableRootModel[JavaMethodDescriptor]

'module' @ [34:13] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractGenerateTestSupportMethodActionTest.setUpTestSourceRoot[LocalVariableDescriptor]

'project' @ [34:20] ==> public final val Module.project: Project[MyPropertyDescriptor]

'save' @ [34:28] ==> public abstract fun save(): Unit defined in com.intellij.openapi.project.Project[JavaMethodDescriptor]

'super' @ [39:14] ==> <this> defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractGenerateTestSupportMethodActionTest[LazyClassReceiverParameterDescriptor]

'createAction' @ [39:20] ==> protected open fun createAction(fileText: String): CodeInsightAction defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractCodeInsightActionTest[SimpleFunctionDescriptorImpl]

'fileText' @ [39:33] ==> value-parameter fileText: String defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractGenerateTestSupportMethodActionTest.createAction[ValueParameterDescriptorImpl]

'apply' @ [39:83] ==> @InlineOnly public inline fun <T> KotlinGenerateTestSupportActionBase.apply(block: KotlinGenerateTestSupportActionBase.() -> Unit): KotlinGenerateTestSupportActionBase defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinGenerateTestSupportActionBase

'testFrameworkToUse' @ [40:17] ==> public final var testFrameworkToUse: String? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[DeserializedPropertyDescriptor]

'findStringWithPrefixes' @ [40:60] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [40:83] ==> value-parameter fileText: String defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractGenerateTestSupportMethodActionTest.createAction[ValueParameterDescriptorImpl]

'setUpTestSourceRoot' @ [44:9] ==> private final fun setUpTestSourceRoot(): Unit defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractGenerateTestSupportMethodActionTest[SimpleFunctionDescriptorImpl]

'super' @ [45:9] ==> <this> defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractGenerateTestSupportMethodActionTest[LazyClassReceiverParameterDescriptor]

'doTest' @ [45:15] ==> protected open fun doTest(path: String): Unit defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractCodeInsightActionTest[SimpleFunctionDescriptorImpl]

'path' @ [45:22] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.codeInsight.generate.AbstractGenerateTestSupportMethodActionTest.doTest[ValueParameterDescriptorImpl]

