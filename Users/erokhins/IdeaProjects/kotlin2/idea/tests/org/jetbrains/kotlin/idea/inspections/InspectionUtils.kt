'LocalInspectionToolWrapper' @ [35:19] ==> public constructor LocalInspectionToolWrapper(@NotNull p0: LocalInspectionTool) defined in com.intellij.codeInspection.ex.LocalInspectionToolWrapper[JavaClassConstructorDescriptor]

'inspection' @ [35:46] ==> value-parameter inspection: LocalInspectionTool defined in org.jetbrains.kotlin.idea.inspections.runInspection[ValueParameterDescriptorImpl]

'wrapper' @ [37:16] ==> val wrapper: LocalInspectionToolWrapper defined in org.jetbrains.kotlin.idea.inspections.runInspection[LocalVariableDescriptor]

'tool' @ [37:24] ==> public final val LocalInspectionToolWrapper.tool: LocalInspectionTool[MyPropertyDescriptor]

'tool' @ [38:9] ==> val tool: LocalInspectionTool defined in org.jetbrains.kotlin.idea.inspections.runInspection[LocalVariableDescriptor]

'tool' @ [38:45] ==> val tool: LocalInspectionTool defined in org.jetbrains.kotlin.idea.inspections.runInspection[LocalVariableDescriptor]

'when (tool) {
            is DifferentKotlinMavenVersionInspection -> tool.testVersionMessage = "\$PLUGIN_VERSION"
            is DifferentKotlinGradleVersionInspection -> tool.testVersionMessage = "\$PLUGIN_VERSION"
        }' @ [39:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'tool' @ [39:15] ==> val tool: LocalInspectionTool defined in org.jetbrains.kotlin.idea.inspections.runInspection[LocalVariableDescriptor]

'tool' @ [40:57] ==> val tool: LocalInspectionTool defined in org.jetbrains.kotlin.idea.inspections.runInspection[LocalVariableDescriptor]

'testVersionMessage' @ [40:62] ==> public final var testVersionMessage: String? defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentKotlinMavenVersionInspection[DeserializedPropertyDescriptor]

'tool' @ [41:58] ==> val tool: LocalInspectionTool defined in org.jetbrains.kotlin.idea.inspections.runInspection[LocalVariableDescriptor]

'testVersionMessage' @ [41:63] ==> public final var testVersionMessage: String? defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentKotlinGradleVersionInspection[DeserializedPropertyDescriptor]

'if (files != null) AnalysisScope(project, files) else AnalysisScope(project)' @ [45:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AnalysisScope, elseBranch: AnalysisScope): AnalysisScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AnalysisScope

'files' @ [45:21] ==> value-parameter files: List<VirtualFile>? = ... defined in org.jetbrains.kotlin.idea.inspections.runInspection[ValueParameterDescriptorImpl]

'AnalysisScope' @ [45:36] ==> public constructor AnalysisScope(@NotNull p0: Project, @NotNull p1: (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>)) defined in com.intellij.analysis.AnalysisScope[JavaClassConstructorDescriptor]

'project' @ [45:50] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.runInspection[ValueParameterDescriptorImpl]

'files' @ [45:59] ==> value-parameter files: List<VirtualFile>? = ... defined in org.jetbrains.kotlin.idea.inspections.runInspection[ValueParameterDescriptorImpl]

'AnalysisScope' @ [45:71] ==> public constructor AnalysisScope(@NotNull p0: Project) defined in com.intellij.analysis.AnalysisScope[JavaClassConstructorDescriptor]

'project' @ [45:85] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.runInspection[ValueParameterDescriptorImpl]

'scope' @ [46:5] ==> val scope: AnalysisScope defined in org.jetbrains.kotlin.idea.inspections.runInspection[LocalVariableDescriptor]

'invalidate' @ [46:11] ==> public open fun invalidate(): Unit defined in com.intellij.analysis.AnalysisScope[JavaMethodDescriptor]

'createGlobalContextForTool' @ [47:25] ==> @JvmOverloads public fun createGlobalContextForTool(scope: AnalysisScope, project: Project, toolWrappers: List<InspectionToolWrapper<*, *>> = ...): GlobalInspectionContextForTests defined in com.intellij.testFramework[DeserializedSimpleFunctionDescriptor]

'scope' @ [47:52] ==> val scope: AnalysisScope defined in org.jetbrains.kotlin.idea.inspections.runInspection[LocalVariableDescriptor]

'project' @ [47:59] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.runInspection[ValueParameterDescriptorImpl]

'listOf' @ [47:68] ==> public fun <T> listOf(element: LocalInspectionToolWrapper): List<LocalInspectionToolWrapper> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalInspectionToolWrapper

'wrapper' @ [47:75] ==> val wrapper: LocalInspectionToolWrapper defined in org.jetbrains.kotlin.idea.inspections.runInspection[LocalVariableDescriptor]

'runTool' @ [48:24] ==> public open fun runTool(@NotNull p0: raw (InspectionToolWrapper<(InspectionProfileEntry..InspectionProfileEntry?), (InspectionEP..InspectionEP?)>..InspectionToolWrapper<*, *>), @NotNull p1: AnalysisScope, @NotNull p2: GlobalInspectionContextForTests): Unit defined in com.intellij.testFramework.InspectionTestUtil[JavaMethodDescriptor]

'wrapper' @ [48:32] ==> val wrapper: LocalInspectionToolWrapper defined in org.jetbrains.kotlin.idea.inspections.runInspection[LocalVariableDescriptor]

'scope' @ [48:41] ==> val scope: AnalysisScope defined in org.jetbrains.kotlin.idea.inspections.runInspection[LocalVariableDescriptor]

'globalContext' @ [48:48] ==> val globalContext: GlobalInspectionContextForTests defined in org.jetbrains.kotlin.idea.inspections.runInspection[LocalVariableDescriptor]

'withTestDir' @ [49:9] ==> value-parameter withTestDir: String? = ... defined in org.jetbrains.kotlin.idea.inspections.runInspection[ValueParameterDescriptorImpl]

'compareToolResults' @ [50:28] ==> public open fun compareToolResults(@NotNull p0: GlobalInspectionContextImpl, @NotNull p1: raw (InspectionToolWrapper<(InspectionProfileEntry..InspectionProfileEntry?), (InspectionEP..InspectionEP?)>..InspectionToolWrapper<*, *>), p2: Boolean, @NotNull p3: String): Unit defined in com.intellij.testFramework.InspectionTestUtil[JavaMethodDescriptor]

'globalContext' @ [50:47] ==> val globalContext: GlobalInspectionContextForTests defined in org.jetbrains.kotlin.idea.inspections.runInspection[LocalVariableDescriptor]

'wrapper' @ [50:62] ==> val wrapper: LocalInspectionToolWrapper defined in org.jetbrains.kotlin.idea.inspections.runInspection[LocalVariableDescriptor]

'withTestDir' @ [50:78] ==> value-parameter withTestDir: String? = ... defined in org.jetbrains.kotlin.idea.inspections.runInspection[ValueParameterDescriptorImpl]

'globalContext' @ [52:12] ==> val globalContext: GlobalInspectionContextForTests defined in org.jetbrains.kotlin.idea.inspections.runInspection[LocalVariableDescriptor]

'getPresentation' @ [52:26] ==> @NotNull public open fun getPresentation(@NotNull p0: raw (InspectionToolWrapper<(InspectionProfileEntry..InspectionProfileEntry?), (InspectionEP..InspectionEP?)>..InspectionToolWrapper<*, *>)): InspectionToolPresentation defined in com.intellij.testFramework.fixtures.impl.GlobalInspectionContextForTests[JavaMethodDescriptor]

'wrapper' @ [52:42] ==> val wrapper: LocalInspectionToolWrapper defined in org.jetbrains.kotlin.idea.inspections.runInspection[LocalVariableDescriptor]

'runInspection' @ [58:12] ==> public fun runInspection(inspection: LocalInspectionTool, project: Project, files: List<VirtualFile>? = ..., withTestDir: String? = ...): InspectionToolPresentation defined in org.jetbrains.kotlin.idea.inspections in file InspectionUtils.kt[SimpleFunctionDescriptorImpl]

'inspectionClass' @ [58:26] ==> value-parameter inspectionClass: Class<*> defined in org.jetbrains.kotlin.idea.inspections.runInspection[ValueParameterDescriptorImpl]

'newInstance' @ [58:42] ==> @CallerSensitive public open fun newInstance(): (Any..Any?) defined in java.lang.Class[JavaMethodDescriptor]

'project' @ [58:80] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.runInspection[ValueParameterDescriptorImpl]

'files' @ [58:89] ==> value-parameter files: List<VirtualFile>? = ... defined in org.jetbrains.kotlin.idea.inspections.runInspection[ValueParameterDescriptorImpl]

'withTestDir' @ [58:96] ==> value-parameter withTestDir: String? = ... defined in org.jetbrains.kotlin.idea.inspections.runInspection[ValueParameterDescriptorImpl]

