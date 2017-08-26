'AbstractNoArgDeclarationChecker' @ [33:58] ==> public constructor AbstractNoArgDeclarationChecker() defined in org.jetbrains.kotlin.noarg.diagnostic.AbstractNoArgDeclarationChecker[DeserializedClassConstructorDescriptor]

'PLUGIN_ID' @ [35:49] ==> public final val PLUGIN_ID: String defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.Companion[PropertyImportedFromObject]

'ANNOTATION_OPTION' @ [35:61] ==> public final val ANNOTATION_OPTION: CliOption defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.Companion[PropertyImportedFromObject]

'name' @ [35:79] ==> public final val name: String defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedPropertyDescriptor]

'cachedValue' @ [38:73] ==> private final fun <T> cachedValue(project: Project, result: () -> CachedValueProvider.Result<(WeakHashMap<Module, List<String>>..WeakHashMap<Module, List<String>>?)>): CachedValue<(WeakHashMap<Module, List<String>>..WeakHashMap<Module, List<String>>?)> defined in org.jetbrains.kotlin.noarg.ide.IdeNoArgDeclarationChecker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (java.util.WeakHashMap<com.intellij.openapi.module.Module, kotlin.collections.List<kotlin.String>>..java.util.WeakHashMap<com.intellij.openapi.module.Module, kotlin.collections.List<kotlin.String>>?)

'project' @ [38:85] ==> public final val project: Project defined in org.jetbrains.kotlin.noarg.ide.IdeNoArgDeclarationChecker[PropertyDescriptorImpl]

'create' @ [39:36] ==> public open fun <T : (Any..Any?)> create(@Nullable p0: WeakHashMap<Module, List<String>>?, @NotNull vararg p1: (Any..Any?)): (CachedValueProvider.Result<(WeakHashMap<Module, List<String>>..WeakHashMap<Module, List<String>>?)>..CachedValueProvider.Result<(WeakHashMap<Module, List<String>>..WeakHashMap<Module, List<String>>?)>?) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> WeakHashMap<Module, List<String>>

'WeakHashMap' @ [39:43] ==> public constructor WeakHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.WeakHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Module
    <V : (Any..Any?)> -> List<String>

'getInstance' @ [39:111] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectRootModificationTracker..ProjectRootModificationTracker?) defined in com.intellij.openapi.roots.ProjectRootModificationTracker[JavaMethodDescriptor]

'project' @ [39:123] ==> public final val project: Project defined in org.jetbrains.kotlin.noarg.ide.IdeNoArgDeclarationChecker[PropertyDescriptorImpl]

'modifierListOwner' @ [43:13] ==> value-parameter modifierListOwner: KtModifierListOwner? defined in org.jetbrains.kotlin.noarg.ide.IdeNoArgDeclarationChecker.getAnnotationFqNames[ValueParameterDescriptorImpl]

'emptyList' @ [43:47] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'?:' @ [44:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'findModuleForPsiElement' @ [44:37] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'modifierListOwner' @ [44:61] ==> value-parameter modifierListOwner: KtModifierListOwner? defined in org.jetbrains.kotlin.noarg.ide.IdeNoArgDeclarationChecker.getAnnotationFqNames[ValueParameterDescriptorImpl]

'emptyList' @ [44:90] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'cache' @ [46:16] ==> private final val cache: CachedValue<WeakHashMap<Module, List<String>>> defined in org.jetbrains.kotlin.noarg.ide.IdeNoArgDeclarationChecker[PropertyDescriptorImpl]

'value' @ [46:22] ==> public final val <T : (Any..Any?)> CachedValue<WeakHashMap<Module, List<String>>>.value: (WeakHashMap<Module, List<String>>..WeakHashMap<Module, List<String>>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> WeakHashMap<Module, List<String>>

'getOrPut' @ [46:28] ==> public inline fun <K, V> MutableMap<(Module..Module?), (List<String>..List<String>?)>.getOrPut(key: (Module..Module?), defaultValue: () -> (List<String>..List<String>?)): (List<String>..List<String>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)
    <V> -> (kotlin.collections.List<kotlin.String>..kotlin.collections.List<kotlin.String>?)

'module' @ [46:37] ==> val module: Module defined in org.jetbrains.kotlin.noarg.ide.IdeNoArgDeclarationChecker.getAnnotationFqNames[LocalVariableDescriptor]

'module' @ [46:47] ==> val module: Module defined in org.jetbrains.kotlin.noarg.ide.IdeNoArgDeclarationChecker.getAnnotationFqNames[LocalVariableDescriptor]

'getSpecialAnnotations' @ [46:54] ==> public fun Module.getSpecialAnnotations(prefix: String): List<String> defined in org.jetbrains.kotlin.annotation.plugin.ide[DeserializedSimpleFunctionDescriptor]

'ANNOTATION_OPTION_PREFIX' @ [46:76] ==> public final val ANNOTATION_OPTION_PREFIX: String defined in org.jetbrains.kotlin.noarg.ide.IdeNoArgDeclarationChecker.Companion[PropertyDescriptorImpl]

'getManager' @ [50:36] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [50:47] ==> value-parameter project: Project defined in org.jetbrains.kotlin.noarg.ide.IdeNoArgDeclarationChecker.cachedValue[ValueParameterDescriptorImpl]

'createCachedValue' @ [50:56] ==> @NotNull public final fun <T : (Any..Any?)> createCachedValue(@NotNull p0: () -> CachedValueProvider.Result<(T..T?)>?, p1: Boolean): CachedValue<(T..T?)> defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (T..T?)

'result' @ [50:74] ==> value-parameter result: () -> CachedValueProvider.Result<T> defined in org.jetbrains.kotlin.noarg.ide.IdeNoArgDeclarationChecker.cachedValue[ValueParameterDescriptorImpl]

