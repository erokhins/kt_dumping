'KotlinMultiFileTestCase' @ [27:46] ==> public constructor KotlinMultiFileTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase[ClassConstructorDescriptorImpl]

'getTestDataPathBase' @ [30:65] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'loadTestConfiguration' @ [33:22] ==> public fun loadTestConfiguration(testFile: File): JsonObject defined in org.jetbrains.kotlin.idea.refactoring.rename in file AbstractRenameTest.kt[SimpleFunctionDescriptorImpl]

'File' @ [33:44] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [33:49] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest[ValueParameterDescriptorImpl]

'isMultiModule' @ [35:9] ==> protected final var isMultiModule: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest[PropertyDescriptorImpl]

'doTestCommittingDocuments' @ [37:9] ==> protected final fun doTestCommittingDocuments(action: (VirtualFile, VirtualFile?) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest[SimpleFunctionDescriptorImpl]

'config' @ [41:31] ==> val config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest[LocalVariableDescriptor]

'asBoolean' @ [41:54] ==> public final val JsonElement.asBoolean: Boolean[MyPropertyDescriptor]

'if (withRuntime) {
                val moduleManager = ModuleManager.getInstance(project)
                modulesWithJvmRuntime =
                        (config["modulesWithRuntime"]?.asJsonArray?.map { moduleManager.findModuleByName(it.asString!!)!! }
                         ?: moduleManager.modules.toList())
                modulesWithJvmRuntime.forEach { ConfigLibraryUtil.configureKotlinRuntimeAndSdk(it, PluginTestCaseBase.mockJdk()) }
                modulesWithJsRuntime =
                        (config["modulesWithJsRuntime"]?.asJsonArray?.map { moduleManager.findModuleByName(it.asString!!)!! }
                         ?: emptyList())
                modulesWithJsRuntime.forEach { ConfigLibraryUtil.configureKotlinJsRuntimeAndSdk(it, PluginTestCaseBase.mockJdk()) }
            }
            else {
                modulesWithJvmRuntime = emptyList()
                modulesWithJsRuntime = emptyList()
            }' @ [42:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'withRuntime' @ [42:17] ==> val withRuntime: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>[LocalVariableDescriptor]

'getInstance' @ [43:51] ==> public open fun getInstance(@NotNull p0: Project): (ModuleManager..ModuleManager?) defined in com.intellij.openapi.module.ModuleManager[JavaMethodDescriptor]

'project' @ [43:63] ==> public final val AbstractMultiModuleMoveTest.project: (Project..Project?)[MyPropertyDescriptor]

'modulesWithJvmRuntime' @ [44:17] ==> val modulesWithJvmRuntime: List<Module> defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>[LocalVariableDescriptor]

'config' @ [45:26] ==> val config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest[LocalVariableDescriptor]

'asJsonArray' @ [45:56] ==> public final val JsonElement.asJsonArray: (JsonArray..JsonArray?)[MyPropertyDescriptor]

'map' @ [45:69] ==> public inline fun <T, R> Iterable<(JsonElement..JsonElement?)>.map(transform: ((JsonElement..JsonElement?)) -> Module): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.google.gson.JsonElement..com.google.gson.JsonElement?)
    <R> -> Module

'moduleManager' @ [45:75] ==> val moduleManager: (ModuleManager..ModuleManager?) defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>[LocalVariableDescriptor]

'findModuleByName' @ [45:89] ==> @Nullable public abstract fun findModuleByName(@NonNls @NotNull p0: String): Module? defined in com.intellij.openapi.module.ModuleManager[JavaMethodDescriptor]

'it' @ [45:106] ==> value-parameter it: (JsonElement..JsonElement?) defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [45:109] ==> public final val JsonElement.asString: (String..String?)[MyPropertyDescriptor]

'moduleManager' @ [46:29] ==> val moduleManager: (ModuleManager..ModuleManager?) defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>[LocalVariableDescriptor]

'modules' @ [46:43] ==> public final val ModuleManager.modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>)[MyPropertyDescriptor]

'toList' @ [46:51] ==> public fun <T> Array<out (Module..Module?)>.toList(): List<(Module..Module?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'modulesWithJvmRuntime' @ [47:17] ==> val modulesWithJvmRuntime: List<Module> defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>[LocalVariableDescriptor]

'forEach' @ [47:39] ==> @HidesMembers public inline fun <T> Iterable<Module>.forEach(action: (Module) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'ConfigLibraryUtil' @ [47:49] ==> public object ConfigLibraryUtil defined in org.jetbrains.kotlin.idea.test in file ConfigLibraryUtil.kt[FakeCallableDescriptorForObject]

'configureKotlinRuntimeAndSdk' @ [47:67] ==> public final fun configureKotlinRuntimeAndSdk(module: Module, sdk: Sdk): Unit defined in org.jetbrains.kotlin.idea.test.ConfigLibraryUtil[SimpleFunctionDescriptorImpl]

'it' @ [47:96] ==> value-parameter it: Module defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'mockJdk' @ [47:119] ==> @NotNull public open fun mockJdk(): Sdk defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'modulesWithJsRuntime' @ [48:17] ==> val modulesWithJsRuntime: List<Module> defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>[LocalVariableDescriptor]

'config' @ [49:26] ==> val config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest[LocalVariableDescriptor]

'asJsonArray' @ [49:58] ==> public final val JsonElement.asJsonArray: (JsonArray..JsonArray?)[MyPropertyDescriptor]

'map' @ [49:71] ==> public inline fun <T, R> Iterable<(JsonElement..JsonElement?)>.map(transform: ((JsonElement..JsonElement?)) -> Module): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.google.gson.JsonElement..com.google.gson.JsonElement?)
    <R> -> Module

'moduleManager' @ [49:77] ==> val moduleManager: (ModuleManager..ModuleManager?) defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>[LocalVariableDescriptor]

'findModuleByName' @ [49:91] ==> @Nullable public abstract fun findModuleByName(@NonNls @NotNull p0: String): Module? defined in com.intellij.openapi.module.ModuleManager[JavaMethodDescriptor]

'it' @ [49:108] ==> value-parameter it: (JsonElement..JsonElement?) defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [49:111] ==> public final val JsonElement.asString: (String..String?)[MyPropertyDescriptor]

'emptyList' @ [50:29] ==> public fun <T> emptyList(): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'modulesWithJsRuntime' @ [51:17] ==> val modulesWithJsRuntime: List<Module> defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>[LocalVariableDescriptor]

'forEach' @ [51:38] ==> @HidesMembers public inline fun <T> Iterable<Module>.forEach(action: (Module) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'ConfigLibraryUtil' @ [51:48] ==> public object ConfigLibraryUtil defined in org.jetbrains.kotlin.idea.test in file ConfigLibraryUtil.kt[FakeCallableDescriptorForObject]

'configureKotlinJsRuntimeAndSdk' @ [51:66] ==> public final fun configureKotlinJsRuntimeAndSdk(module: Module, sdk: Sdk): Unit defined in org.jetbrains.kotlin.idea.test.ConfigLibraryUtil[SimpleFunctionDescriptorImpl]

'it' @ [51:97] ==> value-parameter it: Module defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'mockJdk' @ [51:120] ==> @NotNull public open fun mockJdk(): Sdk defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'modulesWithJvmRuntime' @ [54:17] ==> val modulesWithJvmRuntime: List<Module> defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>[LocalVariableDescriptor]

'emptyList' @ [54:41] ==> public fun <T> emptyList(): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'modulesWithJsRuntime' @ [55:17] ==> val modulesWithJsRuntime: List<Module> defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>[LocalVariableDescriptor]

'emptyList' @ [55:40] ==> public fun <T> emptyList(): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'runMoveRefactoring' @ [59:17] ==> public fun runMoveRefactoring(path: String, config: JsonObject, rootDir: VirtualFile, project: Project): Unit defined in org.jetbrains.kotlin.idea.refactoring.move in file AbstractMoveTest.kt[SimpleFunctionDescriptorImpl]

'path' @ [59:36] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest[ValueParameterDescriptorImpl]

'config' @ [59:42] ==> val config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest[LocalVariableDescriptor]

'rootDir' @ [59:50] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [59:59] ==> public final val AbstractMultiModuleMoveTest.project: (Project..Project?)[MyPropertyDescriptor]

'modulesWithJvmRuntime' @ [62:17] ==> val modulesWithJvmRuntime: List<Module> defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>[LocalVariableDescriptor]

'forEach' @ [62:39] ==> @HidesMembers public inline fun <T> Iterable<Module>.forEach(action: (Module) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'ConfigLibraryUtil' @ [63:21] ==> public object ConfigLibraryUtil defined in org.jetbrains.kotlin.idea.test in file ConfigLibraryUtil.kt[FakeCallableDescriptorForObject]

'unConfigureKotlinRuntimeAndSdk' @ [63:39] ==> public final fun unConfigureKotlinRuntimeAndSdk(module: Module, sdk: Sdk): Unit defined in org.jetbrains.kotlin.idea.test.ConfigLibraryUtil[SimpleFunctionDescriptorImpl]

'it' @ [63:70] ==> value-parameter it: Module defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'mockJdk' @ [63:93] ==> @NotNull public open fun mockJdk(): Sdk defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'modulesWithJsRuntime' @ [65:17] ==> val modulesWithJsRuntime: List<Module> defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>[LocalVariableDescriptor]

'forEach' @ [65:38] ==> @HidesMembers public inline fun <T> Iterable<Module>.forEach(action: (Module) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'ConfigLibraryUtil' @ [66:21] ==> public object ConfigLibraryUtil defined in org.jetbrains.kotlin.idea.test in file ConfigLibraryUtil.kt[FakeCallableDescriptorForObject]

'unConfigureKotlinJsRuntimeAndSdk' @ [66:39] ==> public final fun unConfigureKotlinJsRuntimeAndSdk(module: Module, sdk: Sdk): Unit defined in org.jetbrains.kotlin.idea.test.ConfigLibraryUtil[SimpleFunctionDescriptorImpl]

'it' @ [66:72] ==> value-parameter it: Module defined in org.jetbrains.kotlin.idea.refactoring.move.AbstractMultiModuleMoveTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'mockJdk' @ [66:95] ==> @NotNull public open fun mockJdk(): Sdk defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

