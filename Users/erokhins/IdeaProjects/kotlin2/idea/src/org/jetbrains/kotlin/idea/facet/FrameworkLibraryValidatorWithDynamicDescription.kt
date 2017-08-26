'FrameworkLibraryValidator' @ [40:5] ==> public constructor FrameworkLibraryValidator() defined in com.intellij.facet.ui.libraries.FrameworkLibraryValidator[JavaClassConstructorDescriptor]

'context' @ [43:27] ==> private final val context: LibrariesValidatorContext defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription[PropertyDescriptorImpl]

'module' @ [43:35] ==> public final val LibrariesValidatorContext.module: Module[MyPropertyDescriptor]

'project' @ [43:42] ==> public final val Module.project: Project[MyPropertyDescriptor]

'when (this) {
                is TargetPlatformKind.Jvm -> JavaRuntimeLibraryDescription(project)
                is TargetPlatformKind.JavaScript -> JSLibraryStdDescription(project)
                is TargetPlatformKind.Common -> CommonStandardLibraryDescription(project)
            }' @ [44:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CustomLibraryDescription, entry1: CustomLibraryDescription, entry2: CustomLibraryDescription): CustomLibraryDescription[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CustomLibraryDescription

'this' @ [44:26] ==> <this> defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.libraryDescription[ReceiverParameterDescriptorImpl]

'JavaRuntimeLibraryDescription' @ [45:46] ==> public constructor JavaRuntimeLibraryDescription(project: Project?) defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeLibraryDescription[ClassConstructorDescriptorImpl]

'project' @ [45:76] ==> val project: Project defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.<get-libraryDescription>[LocalVariableDescriptor]

'JSLibraryStdDescription' @ [46:53] ==> public constructor JSLibraryStdDescription(project: Project?) defined in org.jetbrains.kotlin.idea.framework.JSLibraryStdDescription[ClassConstructorDescriptorImpl]

'project' @ [46:77] ==> val project: Project defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.<get-libraryDescription>[LocalVariableDescriptor]

'CommonStandardLibraryDescription' @ [47:49] ==> public constructor CommonStandardLibraryDescription(project: Project?) defined in org.jetbrains.kotlin.idea.framework.CommonStandardLibraryDescription[ClassConstructorDescriptorImpl]

'project' @ [47:82] ==> val project: Project defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.<get-libraryDescription>[LocalVariableDescriptor]

'targetPlatform' @ [53:13] ==> value-parameter targetPlatform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.checkLibraryIsConfigured[ValueParameterDescriptorImpl]

'TargetPlatformKind' @ [53:31] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Common' @ [53:50] ==> public object Common : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'KotlinVersionInfoProvider' @ [55:13] ==> public companion object defined in org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProvider[FakeCallableDescriptorForObject]

'EP_NAME' @ [55:39] ==> public final val EP_NAME: ExtensionPointName<KotlinVersionInfoProvider> defined in org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProvider.Companion[DeserializedPropertyDescriptor]

'extensions' @ [55:47] ==> public final val <T : (Any..Any?)> ExtensionPointName<KotlinVersionInfoProvider>.extensions: (Array<(KotlinVersionInfoProvider..KotlinVersionInfoProvider?)>..Array<out (KotlinVersionInfoProvider..KotlinVersionInfoProvider?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinVersionInfoProvider

'any' @ [55:58] ==> public inline fun <T> Array<out (KotlinVersionInfoProvider..KotlinVersionInfoProvider?)>.any(predicate: ((KotlinVersionInfoProvider..KotlinVersionInfoProvider?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProvider..org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProvider?)

'it' @ [56:13] ==> value-parameter it: (KotlinVersionInfoProvider..KotlinVersionInfoProvider?) defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.checkLibraryIsConfigured.<anonymous>[ValueParameterDescriptorImpl]

'getLibraryVersions' @ [56:16] ==> public abstract fun getLibraryVersions(module: Module, targetPlatform: TargetPlatformKind<*>, rootModel: ModuleRootModel?): Collection<String> defined in org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProvider[DeserializedSimpleFunctionDescriptor]

'context' @ [56:35] ==> private final val context: LibrariesValidatorContext defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription[PropertyDescriptorImpl]

'module' @ [56:43] ==> public final val LibrariesValidatorContext.module: Module[MyPropertyDescriptor]

'targetPlatform' @ [56:51] ==> value-parameter targetPlatform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.checkLibraryIsConfigured[ValueParameterDescriptorImpl]

'context' @ [56:67] ==> private final val context: LibrariesValidatorContext defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription[PropertyDescriptorImpl]

'rootModel' @ [56:75] ==> public final val LibrariesValidatorContext.rootModel: ModuleRootModel[MyPropertyDescriptor]

'isNotEmpty' @ [56:86] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'targetPlatform' @ [59:34] ==> value-parameter targetPlatform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.checkLibraryIsConfigured[ValueParameterDescriptorImpl]

'libraryDescription' @ [59:49] ==> private final val TargetPlatformKind<*>.libraryDescription: CustomLibraryDescription defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription[PropertyDescriptorImpl]

'libraryDescription' @ [60:28] ==> val libraryDescription: CustomLibraryDescription defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.checkLibraryIsConfigured[LocalVariableDescriptor]

'suitableLibraryKinds' @ [60:47] ==> public final val CustomLibraryDescription.suitableLibraryKinds: (MutableSet<out (LibraryKind..LibraryKind?)>..Set<(LibraryKind..LibraryKind?)>)[MyPropertyDescriptor]

'getInstance' @ [62:62] ==> public open fun getInstance(): (LibraryPresentationManager..LibraryPresentationManager?) defined in com.intellij.openapi.roots.ui.configuration.libraries.LibraryPresentationManager[JavaMethodDescriptor]

'context' @ [63:9] ==> private final val context: LibrariesValidatorContext defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription[PropertyDescriptorImpl]

'rootModel' @ [63:17] ==> public final val LibrariesValidatorContext.rootModel: ModuleRootModel[MyPropertyDescriptor]

'orderEntries' @ [64:18] ==> @NotNull public abstract fun orderEntries(): OrderEnumerator defined in com.intellij.openapi.roots.ModuleRootModel[JavaMethodDescriptor]

'using' @ [65:18] ==> public abstract fun using(@NotNull p0: RootModelProvider): (OrderEnumerator..OrderEnumerator?) defined in com.intellij.openapi.roots.OrderEnumerator[JavaMethodDescriptor]

'context' @ [65:24] ==> private final val context: LibrariesValidatorContext defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription[PropertyDescriptorImpl]

'modulesProvider' @ [65:32] ==> public final val LibrariesValidatorContext.modulesProvider: ModulesProvider[MyPropertyDescriptor]

'recursively' @ [66:18] ==> public abstract fun recursively(): (OrderEnumerator..OrderEnumerator?) defined in com.intellij.openapi.roots.OrderEnumerator[JavaMethodDescriptor]

'librariesOnly' @ [67:18] ==> public open fun librariesOnly(): (OrderEnumerator..OrderEnumerator?) defined in com.intellij.openapi.roots.OrderEnumerator[JavaMethodDescriptor]

'forEachLibrary' @ [68:18] ==> public final fun forEachLibrary(@NotNull p0: ((Library..Library?)) -> Boolean): Unit defined in com.intellij.openapi.roots.OrderEnumerator[MyFunctionDescriptor]

'presentationManager' @ [69:25] ==> val presentationManager: (LibraryPresentationManager..LibraryPresentationManager?) defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.checkLibraryIsConfigured[LocalVariableDescriptor]

'isLibraryOfKind' @ [69:45] ==> public abstract fun isLibraryOfKind(@NotNull p0: Library, @NotNull p1: LibrariesContainer, @NotNull p2: (MutableSet<out (LibraryKind..LibraryKind?)>..Set<(LibraryKind..LibraryKind?)>)): Boolean defined in com.intellij.openapi.roots.ui.configuration.libraries.LibraryPresentationManager[JavaMethodDescriptor]

'library' @ [69:61] ==> value-parameter library: (Library..Library?) defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.checkLibraryIsConfigured.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [69:70] ==> private final val context: LibrariesValidatorContext defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription[PropertyDescriptorImpl]

'librariesContainer' @ [69:78] ==> public final val LibrariesValidatorContext.librariesContainer: (LibrariesContainer..LibrariesContainer?)[MyPropertyDescriptor]

'libraryKinds' @ [69:98] ==> val libraryKinds: (MutableSet<out (LibraryKind..LibraryKind?)>..Set<(LibraryKind..LibraryKind?)>) defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.checkLibraryIsConfigured[LocalVariableDescriptor]

'found' @ [70:25] ==> var found: Boolean defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.checkLibraryIsConfigured[LocalVariableDescriptor]

'!' @ [72:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'found' @ [72:22] ==> var found: Boolean defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.checkLibraryIsConfigured[LocalVariableDescriptor]

'found' @ [74:16] ==> var found: Boolean defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.checkLibraryIsConfigured[LocalVariableDescriptor]

'invoke' @ [78:30] ==> public abstract operator fun invoke(): TargetPlatformKind<*> defined in kotlin.Function0[FunctionInvokeDescriptor]

'checkLibraryIsConfigured' @ [80:13] ==> private final fun checkLibraryIsConfigured(targetPlatform: TargetPlatformKind<*>): Boolean defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription[SimpleFunctionDescriptorImpl]

'targetPlatform' @ [80:38] ==> val targetPlatform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.check[LocalVariableDescriptor]

'TargetPlatformKind' @ [81:40] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'ALL_PLATFORMS' @ [81:59] ==> public final val ALL_PLATFORMS: List<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.config.TargetPlatformKind.Companion[DeserializedPropertyDescriptor]

'filter' @ [81:73] ==> public inline fun <T> Iterable<TargetPlatformKind<*>>.filter(predicate: (TargetPlatformKind<*>) -> Boolean): List<TargetPlatformKind<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetPlatformKind<*>

'it' @ [82:17] ==> value-parameter it: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.check.<anonymous>[ValueParameterDescriptorImpl]

'TargetPlatformKind' @ [82:23] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Common' @ [82:42] ==> public object Common : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'it' @ [82:52] ==> value-parameter it: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.check.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [82:55] ==> public final val name: String defined in org.jetbrains.kotlin.config.TargetPlatformKind[DeserializedPropertyDescriptor]

'targetPlatform' @ [82:63] ==> val targetPlatform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.check[LocalVariableDescriptor]

'name' @ [82:78] ==> public final val name: String defined in org.jetbrains.kotlin.config.TargetPlatformKind[DeserializedPropertyDescriptor]

'checkLibraryIsConfigured' @ [82:86] ==> private final fun checkLibraryIsConfigured(targetPlatform: TargetPlatformKind<*>): Boolean defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription[SimpleFunctionDescriptorImpl]

'it' @ [82:111] ==> value-parameter it: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.check.<anonymous>[ValueParameterDescriptorImpl]

'conflictingPlatforms' @ [84:17] ==> val conflictingPlatforms: List<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.check[LocalVariableDescriptor]

'isNotEmpty' @ [84:38] ==> @InlineOnly public inline fun <T> Collection<TargetPlatformKind<*>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetPlatformKind<*>

'conflictingPlatforms' @ [85:36] ==> val conflictingPlatforms: List<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.check[LocalVariableDescriptor]

'mapTo' @ [85:57] ==> public inline fun <T, R, C : MutableCollection<in String>> Iterable<TargetPlatformKind<*>>.mapTo(destination: LinkedHashSet<String> /* = LinkedHashSet<String> */, transform: (TargetPlatformKind<*>) -> String): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetPlatformKind<*>
    <R> -> String
    <C : MutableCollection<in R>> -> LinkedHashSet<String>

'LinkedHashSet' @ [85:63] ==> public final fun <E> <init>(): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> String

'it' @ [85:82] ==> value-parameter it: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.check.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [85:85] ==> public final val name: String defined in org.jetbrains.kotlin.config.TargetPlatformKind[DeserializedPropertyDescriptor]

'joinToString' @ [85:92] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ValidationResult' @ [86:24] ==> public constructor ValidationResult(p0: (String..String?)) defined in com.intellij.facet.ui.ValidationResult[JavaClassConstructorDescriptor]

'platformText' @ [86:125] ==> val platformText: String defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.check[LocalVariableDescriptor]

'OK' @ [89:37] ==> public final val OK: (ValidationResult..ValidationResult?) defined in com.intellij.facet.ui.ValidationResult[JavaPropertyDescriptor]

'ValidationResult' @ [93:16] ==> public constructor ValidationResult(p0: (String..String?), @Nullable p1: FacetConfigurationQuickFix?) defined in com.intellij.facet.ui.ValidationResult[JavaClassConstructorDescriptor]

'message' @ [94:27] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.ide.IdeBundle[JavaMethodDescriptor]

'libraryCategoryName' @ [94:66] ==> private final val libraryCategoryName: String defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription[PropertyDescriptorImpl]

'LibrariesQuickFix' @ [95:17] ==> public constructor LibrariesQuickFix(myDescription: CustomLibraryDescription) defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.LibrariesQuickFix[ClassConstructorDescriptorImpl]

'targetPlatform' @ [95:35] ==> val targetPlatform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.check[LocalVariableDescriptor]

'libraryDescription' @ [95:50] ==> private final val TargetPlatformKind<*>.libraryDescription: CustomLibraryDescription defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription[PropertyDescriptorImpl]

'FacetConfigurationQuickFix' @ [101:9] ==> protected/*protected and package*/ constructor FacetConfigurationQuickFix(@Nullable p0: String?) defined in com.intellij.facet.ui.FacetConfigurationQuickFix[JavaClassConstructorDescriptor]

'message' @ [101:46] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.ide.IdeBundle[JavaMethodDescriptor]

'createDialog' @ [103:49] ==> public open fun createDialog(p0: (CustomLibraryDescription..CustomLibraryDescription?), @NotNull p1: LibrariesContainer, @NotNull p2: Module, @Nullable p3: ModifiableRootModel?, @Nullable p4: ParameterizedRunnable<(ModifiableRootModel..ModifiableRootModel?)>?): (AddCustomLibraryDialog..AddCustomLibraryDialog?) defined in com.intellij.openapi.roots.ui.configuration.libraries.AddCustomLibraryDialog[JavaMethodDescriptor]

'myDescription' @ [103:62] ==> private final val myDescription: CustomLibraryDescription defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.LibrariesQuickFix[PropertyDescriptorImpl]

'context' @ [103:77] ==> private final val context: LibrariesValidatorContext defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription[PropertyDescriptorImpl]

'librariesContainer' @ [103:85] ==> public final val LibrariesValidatorContext.librariesContainer: (LibrariesContainer..LibrariesContainer?)[MyPropertyDescriptor]

'context' @ [104:62] ==> private final val context: LibrariesValidatorContext defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription[PropertyDescriptorImpl]

'module' @ [104:70] ==> public final val LibrariesValidatorContext.module: Module[MyPropertyDescriptor]

'context' @ [104:78] ==> private final val context: LibrariesValidatorContext defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription[PropertyDescriptorImpl]

'modifiableRootModel' @ [104:86] ==> public final val LibrariesValidatorContext.modifiableRootModel: ModifiableRootModel?[MyPropertyDescriptor]

'dialog' @ [106:13] ==> val dialog: (AddCustomLibraryDialog..AddCustomLibraryDialog?) defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription.LibrariesQuickFix.run[LocalVariableDescriptor]

'show' @ [106:20] ==> public open fun show(): Unit defined in com.intellij.openapi.roots.ui.configuration.libraries.AddCustomLibraryDialog[JavaMethodDescriptor]

'validatorsManager' @ [107:13] ==> private final val validatorsManager: FacetValidatorsManager defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription[PropertyDescriptorImpl]

'validate' @ [107:31] ==> public abstract fun validate(): Unit defined in com.intellij.facet.ui.FacetValidatorsManager[JavaMethodDescriptor]

