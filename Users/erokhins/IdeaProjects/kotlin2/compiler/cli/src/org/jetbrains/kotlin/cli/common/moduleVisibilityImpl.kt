'getSourceElement' @ [34:26] ==> public fun getSourceElement(descriptor: DeclarationDescriptor): SourceElement defined in org.jetbrains.kotlin.load.kotlin[DeserializedSimpleFunctionDescriptor]

'from' @ [34:43] ==> value-parameter from: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[ValueParameterDescriptorImpl]

'if (fromSource is KotlinSourceElement) {
            fromSource.psi.project
        }
        else {
            (from as? LazyPackageDescriptor)?.declarationProvider?.getPackageFiles()?.firstOrNull()?.project ?: return true
        }' @ [37:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Project, elseBranch: Project): Project[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Project

'fromSource' @ [37:36] ==> val fromSource: SourceElement defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[LocalVariableDescriptor]

'fromSource' @ [38:13] ==> val fromSource: SourceElement defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[LocalVariableDescriptor]

'psi' @ [38:24] ==> public open val psi: KtElement defined in org.jetbrains.kotlin.resolve.source.KotlinSourceElement[DeserializedPropertyDescriptor]

'project' @ [38:28] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'?:' @ [41:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Project?, right: Project): Project[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Project

'from' @ [41:14] ==> value-parameter from: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[ValueParameterDescriptorImpl]

'declarationProvider' @ [41:47] ==> public final val LazyPackageDescriptor.declarationProvider: PackageMemberDeclarationProvider[MyPropertyDescriptor]

'getPackageFiles' @ [41:68] ==> public abstract fun getPackageFiles(): Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.PackageMemberDeclarationProvider[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [41:87] ==> public fun <T> Iterable<KtFile>.firstOrNull(): KtFile? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'project' @ [41:102] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'getInstance' @ [44:71] ==> @JvmStatic public final fun getInstance(project: Project): ModuleVisibilityManager defined in org.jetbrains.kotlin.load.kotlin.ModuleVisibilityManager.SERVICE[DeserializedSimpleFunctionDescriptor]

'project' @ [44:83] ==> val project: Project defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[LocalVariableDescriptor]

'!' @ [45:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'moduleVisibilityManager' @ [45:14] ==> val moduleVisibilityManager: ModuleVisibilityManager defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[LocalVariableDescriptor]

'enabled' @ [45:38] ==> public open val enabled: Boolean defined in org.jetbrains.kotlin.load.kotlin.ModuleVisibilityManager[DeserializedPropertyDescriptor]

'moduleVisibilityManager' @ [47:9] ==> val moduleVisibilityManager: ModuleVisibilityManager defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[LocalVariableDescriptor]

'friendPaths' @ [47:33] ==> public abstract val friendPaths: Collection<String> defined in org.jetbrains.kotlin.load.kotlin.ModuleVisibilityManager[DeserializedPropertyDescriptor]

'forEach' @ [47:45] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'isContainedByCompiledPartOfOurModule' @ [48:17] ==> public fun isContainedByCompiledPartOfOurModule(descriptor: DeclarationDescriptor, outDirectory: File?): Boolean defined in org.jetbrains.kotlin.load.kotlin[DeserializedSimpleFunctionDescriptor]

'what' @ [48:54] ==> value-parameter what: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[ValueParameterDescriptorImpl]

'File' @ [48:60] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [48:65] ==> value-parameter it: String defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule.<anonymous>[ValueParameterDescriptorImpl]

'moduleVisibilityManager' @ [51:23] ==> val moduleVisibilityManager: ModuleVisibilityManager defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[LocalVariableDescriptor]

'chunk' @ [51:47] ==> public abstract val chunk: Collection<Module> defined in org.jetbrains.kotlin.load.kotlin.ModuleVisibilityManager[DeserializedPropertyDescriptor]

'getSourceElement' @ [53:26] ==> public fun getSourceElement(descriptor: DeclarationDescriptor): SourceElement defined in org.jetbrains.kotlin.load.kotlin[DeserializedSimpleFunctionDescriptor]

'what' @ [53:43] ==> value-parameter what: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[ValueParameterDescriptorImpl]

'whatSource' @ [54:13] ==> val whatSource: SourceElement defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[LocalVariableDescriptor]

'modules' @ [55:17] ==> val modules: Collection<Module> defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[LocalVariableDescriptor]

'size' @ [55:25] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'fromSource' @ [55:37] ==> val fromSource: SourceElement defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[LocalVariableDescriptor]

'findModule' @ [56:24] ==> private final fun findModule(descriptor: DeclarationDescriptor, modules: Collection<Module>): Module? defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl[SimpleFunctionDescriptorImpl]

'what' @ [56:35] ==> value-parameter what: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[ValueParameterDescriptorImpl]

'modules' @ [56:41] ==> val modules: Collection<Module> defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[LocalVariableDescriptor]

'findModule' @ [56:54] ==> private final fun findModule(descriptor: DeclarationDescriptor, modules: Collection<Module>): Module? defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl[SimpleFunctionDescriptorImpl]

'from' @ [56:65] ==> value-parameter from: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[ValueParameterDescriptorImpl]

'modules' @ [56:71] ==> val modules: Collection<Module> defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[LocalVariableDescriptor]

'modules' @ [62:13] ==> val modules: Collection<Module> defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[LocalVariableDescriptor]

'isEmpty' @ [62:21] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'modules' @ [64:13] ==> val modules: Collection<Module> defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[LocalVariableDescriptor]

'size' @ [64:21] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'isContainedByCompiledPartOfOurModule' @ [64:34] ==> public fun isContainedByCompiledPartOfOurModule(descriptor: DeclarationDescriptor, outDirectory: File?): Boolean defined in org.jetbrains.kotlin.load.kotlin[DeserializedSimpleFunctionDescriptor]

'what' @ [64:71] ==> value-parameter what: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[ValueParameterDescriptorImpl]

'File' @ [64:77] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'modules' @ [64:82] ==> val modules: Collection<Module> defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[LocalVariableDescriptor]

'single' @ [64:90] ==> public fun <T> Iterable<Module>.single(): Module defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'getOutputDirectory' @ [64:99] ==> public abstract fun getOutputDirectory(): String defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'findModule' @ [66:16] ==> private final fun findModule(descriptor: DeclarationDescriptor, modules: Collection<Module>): Module? defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl[SimpleFunctionDescriptorImpl]

'from' @ [66:27] ==> value-parameter from: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[ValueParameterDescriptorImpl]

'modules' @ [66:33] ==> val modules: Collection<Module> defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[LocalVariableDescriptor]

'findModule' @ [66:46] ==> private final fun findModule(descriptor: DeclarationDescriptor, modules: Collection<Module>): Module? defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl[SimpleFunctionDescriptorImpl]

'what' @ [66:57] ==> value-parameter what: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[ValueParameterDescriptorImpl]

'modules' @ [66:63] ==> val modules: Collection<Module> defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.isInFriendModule[LocalVariableDescriptor]

'getSourceElement' @ [70:29] ==> public fun getSourceElement(descriptor: DeclarationDescriptor): SourceElement defined in org.jetbrains.kotlin.load.kotlin[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [70:46] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.findModule[ValueParameterDescriptorImpl]

'if (sourceElement is KotlinSourceElement) {
            modules.singleOrNull() ?: modules.firstOrNull { sourceElement.psi.containingKtFile.virtualFile.path in it.getSourceFiles() }
        }
        else {
            modules.firstOrNull { module ->
                isContainedByCompiledPartOfOurModule(descriptor, File(module.getOutputDirectory())) ||
                module.getFriendPaths().any { isContainedByCompiledPartOfOurModule(descriptor, File(it)) }
            }
        }' @ [71:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Module?, elseBranch: Module?): Module?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Module?

'sourceElement' @ [71:20] ==> val sourceElement: SourceElement defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.findModule[LocalVariableDescriptor]

'modules' @ [72:13] ==> value-parameter modules: Collection<Module> defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.findModule[ValueParameterDescriptorImpl]

'singleOrNull' @ [72:21] ==> public fun <T> Iterable<Module>.singleOrNull(): Module? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'modules' @ [72:39] ==> value-parameter modules: Collection<Module> defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.findModule[ValueParameterDescriptorImpl]

'firstOrNull' @ [72:47] ==> public inline fun <T> Iterable<Module>.firstOrNull(predicate: (Module) -> Boolean): Module? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'sourceElement' @ [72:61] ==> val sourceElement: SourceElement defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.findModule[LocalVariableDescriptor]

'psi' @ [72:75] ==> public open val psi: KtElement defined in org.jetbrains.kotlin.resolve.source.KotlinSourceElement[DeserializedPropertyDescriptor]

'containingKtFile' @ [72:79] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'virtualFile' @ [72:96] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'path' @ [72:108] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'it' @ [72:116] ==> value-parameter it: Module defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.findModule.<anonymous>[ValueParameterDescriptorImpl]

'getSourceFiles' @ [72:119] ==> public abstract fun getSourceFiles(): List<String> defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'modules' @ [75:13] ==> value-parameter modules: Collection<Module> defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.findModule[ValueParameterDescriptorImpl]

'firstOrNull' @ [75:21] ==> public inline fun <T> Iterable<Module>.firstOrNull(predicate: (Module) -> Boolean): Module? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'isContainedByCompiledPartOfOurModule' @ [76:17] ==> public fun isContainedByCompiledPartOfOurModule(descriptor: DeclarationDescriptor, outDirectory: File?): Boolean defined in org.jetbrains.kotlin.load.kotlin[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [76:54] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.findModule[ValueParameterDescriptorImpl]

'File' @ [76:66] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'module' @ [76:71] ==> value-parameter module: Module defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.findModule.<anonymous>[ValueParameterDescriptorImpl]

'getOutputDirectory' @ [76:78] ==> public abstract fun getOutputDirectory(): String defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'module' @ [77:17] ==> value-parameter module: Module defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.findModule.<anonymous>[ValueParameterDescriptorImpl]

'getFriendPaths' @ [77:24] ==> public abstract fun getFriendPaths(): List<String> defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'any' @ [77:41] ==> public inline fun <T> Iterable<String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'isContainedByCompiledPartOfOurModule' @ [77:47] ==> public fun isContainedByCompiledPartOfOurModule(descriptor: DeclarationDescriptor, outDirectory: File?): Boolean defined in org.jetbrains.kotlin.load.kotlin[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [77:84] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.findModule[ValueParameterDescriptorImpl]

'File' @ [77:96] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [77:101] ==> value-parameter it: String defined in org.jetbrains.kotlin.cli.common.ModuleVisibilityHelperImpl.findModule.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'arrayListOf' @ [88:47] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Module> /* = ArrayList<Module> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'arrayListOf' @ [89:54] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'chunk' @ [92:9] ==> public open val chunk: MutableList<Module> defined in org.jetbrains.kotlin.cli.common.CliModuleVisibilityManagerImpl[PropertyDescriptorImpl]

'add' @ [92:15] ==> public abstract fun add(element: Module): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'module' @ [92:19] ==> value-parameter module: Module defined in org.jetbrains.kotlin.cli.common.CliModuleVisibilityManagerImpl.addModule[ValueParameterDescriptorImpl]

'friendPaths' @ [96:9] ==> public open val friendPaths: MutableList<String> defined in org.jetbrains.kotlin.cli.common.CliModuleVisibilityManagerImpl[PropertyDescriptorImpl]

'add' @ [96:21] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'path' @ [96:25] ==> value-parameter path: String defined in org.jetbrains.kotlin.cli.common.CliModuleVisibilityManagerImpl.addFriendPath[ValueParameterDescriptorImpl]

'chunk' @ [100:9] ==> public open val chunk: MutableList<Module> defined in org.jetbrains.kotlin.cli.common.CliModuleVisibilityManagerImpl[PropertyDescriptorImpl]

'clear' @ [100:15] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

