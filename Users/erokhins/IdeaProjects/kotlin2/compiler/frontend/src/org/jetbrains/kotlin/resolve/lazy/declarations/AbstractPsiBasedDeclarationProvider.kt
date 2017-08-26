'ArrayList' @ [34:31] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtDeclaration

'create' @ [35:43] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> create(): (ArrayListMultimap<(Name..Name?), (KtNamedFunction..KtNamedFunction?)>..ArrayListMultimap<(Name..Name?), (KtNamedFunction..KtNamedFunction?)>?) defined in com.google.common.collect.ArrayListMultimap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Name
    <V : (Any..Any?)> -> KtNamedFunction

'create' @ [36:44] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> create(): (ArrayListMultimap<(Name..Name?), (KtProperty..KtProperty?)>..ArrayListMultimap<(Name..Name?), (KtProperty..KtProperty?)>?) defined in com.google.common.collect.ArrayListMultimap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Name
    <V : (Any..Any?)> -> KtProperty

'create' @ [37:51] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> create(): (ArrayListMultimap<(Name..Name?), (KtClassLikeInfo..KtClassLikeInfo?)>..ArrayListMultimap<(Name..Name?), (KtClassLikeInfo..KtClassLikeInfo?)>?) defined in com.google.common.collect.ArrayListMultimap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Name
    <V : (Any..Any?)> -> KtClassLikeInfo

'create' @ [38:45] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> create(): (ArrayListMultimap<(Name..Name?), (KtTypeAlias..KtTypeAlias?)>..ArrayListMultimap<(Name..Name?), (KtTypeAlias..KtTypeAlias?)>?) defined in com.google.common.collect.ArrayListMultimap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Name
    <V : (Any..Any?)> -> KtTypeAlias

'create' @ [39:66] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> create(): (ArrayListMultimap<(Name..Name?), (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..ArrayListMultimap<(Name..Name?), (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>?) defined in com.google.common.collect.ArrayListMultimap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Name
    <V : (Any..Any?)> -> KtDestructuringDeclarationEntry

'declaration' @ [42:17] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[ValueParameterDescriptorImpl]

'declaration' @ [42:58] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[ValueParameterDescriptorImpl]

'allDeclarations' @ [44:13] ==> public final val allDeclarations: ArrayList<KtDeclaration> defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[PropertyDescriptorImpl]

'add' @ [44:29] ==> public open fun add(element: KtDeclaration): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'declaration' @ [44:33] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[ValueParameterDescriptorImpl]

'when (declaration) {
                is KtNamedFunction ->
                    functions.put(safeNameForLazyResolve(declaration), declaration)
                is KtProperty ->
                    properties.put(safeNameForLazyResolve(declaration), declaration)
                is KtTypeAlias ->
                    typeAliases.put(safeNameForLazyResolve(declaration.nameAsName), declaration)
                is KtClassOrObject ->
                    classesAndObjects.put(safeNameForLazyResolve(declaration.nameAsName), KtClassInfoUtil.createClassLikeInfo(declaration))
                is KtScript -> {
                    val scriptInfo = KtScriptInfo(declaration)
                    classesAndObjects.put(scriptInfo.script.nameAsName, scriptInfo)
                }
                is KtDestructuringDeclaration -> {
                    for (entry in declaration.entries) {
                        destructuringDeclarationsEntries.put(safeNameForLazyResolve(entry.nameAsName), entry)
                    }
                }
                is KtParameter -> {
                    // Do nothing, just put it into allDeclarations is enough
                }
                else -> throw IllegalArgumentException("Unknown declaration: " + declaration)
            }' @ [45:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any, entry4: Any, entry5: Any, entry6: Any, entry7: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'declaration' @ [45:19] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[ValueParameterDescriptorImpl]

'functions' @ [47:21] ==> public final val functions: (ArrayListMultimap<(Name..Name?), (KtNamedFunction..KtNamedFunction?)>..ArrayListMultimap<(Name..Name?), (KtNamedFunction..KtNamedFunction?)>?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[PropertyDescriptorImpl]

'put' @ [47:31] ==> @CanIgnoreReturnValue public open fun put(@Nullable p0: Name?, @Nullable p1: KtNamedFunction?): Boolean defined in com.google.common.collect.ArrayListMultimap[JavaMethodDescriptor]

'safeNameForLazyResolve' @ [47:35] ==> @NotNull public open fun safeNameForLazyResolve(@NotNull declaration: KtNamedDeclaration): Name defined in org.jetbrains.kotlin.resolve.lazy.ResolveSessionUtils[JavaMethodDescriptor]

'declaration' @ [47:58] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[ValueParameterDescriptorImpl]

'declaration' @ [47:72] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[ValueParameterDescriptorImpl]

'properties' @ [49:21] ==> public final val properties: (ArrayListMultimap<(Name..Name?), (KtProperty..KtProperty?)>..ArrayListMultimap<(Name..Name?), (KtProperty..KtProperty?)>?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[PropertyDescriptorImpl]

'put' @ [49:32] ==> @CanIgnoreReturnValue public open fun put(@Nullable p0: Name?, @Nullable p1: KtProperty?): Boolean defined in com.google.common.collect.ArrayListMultimap[JavaMethodDescriptor]

'safeNameForLazyResolve' @ [49:36] ==> @NotNull public open fun safeNameForLazyResolve(@NotNull declaration: KtNamedDeclaration): Name defined in org.jetbrains.kotlin.resolve.lazy.ResolveSessionUtils[JavaMethodDescriptor]

'declaration' @ [49:59] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[ValueParameterDescriptorImpl]

'declaration' @ [49:73] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[ValueParameterDescriptorImpl]

'typeAliases' @ [51:21] ==> public final val typeAliases: (ArrayListMultimap<(Name..Name?), (KtTypeAlias..KtTypeAlias?)>..ArrayListMultimap<(Name..Name?), (KtTypeAlias..KtTypeAlias?)>?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[PropertyDescriptorImpl]

'put' @ [51:33] ==> @CanIgnoreReturnValue public open fun put(@Nullable p0: Name?, @Nullable p1: KtTypeAlias?): Boolean defined in com.google.common.collect.ArrayListMultimap[JavaMethodDescriptor]

'safeNameForLazyResolve' @ [51:37] ==> @NotNull public open fun safeNameForLazyResolve(@Nullable name: Name?): Name defined in org.jetbrains.kotlin.resolve.lazy.ResolveSessionUtils[JavaMethodDescriptor]

'declaration' @ [51:60] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[ValueParameterDescriptorImpl]

'nameAsName' @ [51:72] ==> public final val KtTypeAlias.nameAsName: Name?[MyPropertyDescriptor]

'declaration' @ [51:85] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[ValueParameterDescriptorImpl]

'classesAndObjects' @ [53:21] ==> public final val classesAndObjects: (ArrayListMultimap<(Name..Name?), (KtClassLikeInfo..KtClassLikeInfo?)>..ArrayListMultimap<(Name..Name?), (KtClassLikeInfo..KtClassLikeInfo?)>?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[PropertyDescriptorImpl]

'put' @ [53:39] ==> @CanIgnoreReturnValue public open fun put(@Nullable p0: Name?, @Nullable p1: KtClassLikeInfo?): Boolean defined in com.google.common.collect.ArrayListMultimap[JavaMethodDescriptor]

'safeNameForLazyResolve' @ [53:43] ==> @NotNull public open fun safeNameForLazyResolve(@Nullable name: Name?): Name defined in org.jetbrains.kotlin.resolve.lazy.ResolveSessionUtils[JavaMethodDescriptor]

'declaration' @ [53:66] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[ValueParameterDescriptorImpl]

'nameAsName' @ [53:78] ==> public final val KtClassOrObject.nameAsName: Name?[MyPropertyDescriptor]

'createClassLikeInfo' @ [53:107] ==> @NotNull public open fun createClassLikeInfo(@NotNull classOrObject: KtClassOrObject): KtClassLikeInfo defined in org.jetbrains.kotlin.resolve.lazy.data.KtClassInfoUtil[JavaMethodDescriptor]

'declaration' @ [53:127] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[ValueParameterDescriptorImpl]

'KtScriptInfo' @ [55:38] ==> public constructor KtScriptInfo(script: KtScript) defined in org.jetbrains.kotlin.resolve.lazy.data.KtScriptInfo[ClassConstructorDescriptorImpl]

'declaration' @ [55:51] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[ValueParameterDescriptorImpl]

'classesAndObjects' @ [56:21] ==> public final val classesAndObjects: (ArrayListMultimap<(Name..Name?), (KtClassLikeInfo..KtClassLikeInfo?)>..ArrayListMultimap<(Name..Name?), (KtClassLikeInfo..KtClassLikeInfo?)>?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[PropertyDescriptorImpl]

'put' @ [56:39] ==> @CanIgnoreReturnValue public open fun put(@Nullable p0: Name?, @Nullable p1: KtClassLikeInfo?): Boolean defined in com.google.common.collect.ArrayListMultimap[JavaMethodDescriptor]

'scriptInfo' @ [56:43] ==> val scriptInfo: KtScriptInfo defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[LocalVariableDescriptor]

'script' @ [56:54] ==> public final val script: KtScript defined in org.jetbrains.kotlin.resolve.lazy.data.KtScriptInfo[PropertyDescriptorImpl]

'nameAsName' @ [56:61] ==> public final val KtScript.nameAsName: Name?[MyPropertyDescriptor]

'scriptInfo' @ [56:73] ==> val scriptInfo: KtScriptInfo defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[LocalVariableDescriptor]

'declaration' @ [59:35] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[ValueParameterDescriptorImpl]

'entries' @ [59:47] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'destructuringDeclarationsEntries' @ [60:25] ==> public final val destructuringDeclarationsEntries: (ArrayListMultimap<(Name..Name?), (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..ArrayListMultimap<(Name..Name?), (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[PropertyDescriptorImpl]

'put' @ [60:58] ==> @CanIgnoreReturnValue public open fun put(@Nullable p0: Name?, @Nullable p1: KtDestructuringDeclarationEntry?): Boolean defined in com.google.common.collect.ArrayListMultimap[JavaMethodDescriptor]

'safeNameForLazyResolve' @ [60:62] ==> @NotNull public open fun safeNameForLazyResolve(@Nullable name: Name?): Name defined in org.jetbrains.kotlin.resolve.lazy.ResolveSessionUtils[JavaMethodDescriptor]

'entry' @ [60:85] ==> val entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[LocalVariableDescriptor]

'nameAsName' @ [60:91] ==> public final val KtDestructuringDeclarationEntry.nameAsName: Name?[MyPropertyDescriptor]

'entry' @ [60:104] ==> val entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[LocalVariableDescriptor]

'IllegalArgumentException' @ [66:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [66:56] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'declaration' @ [66:82] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.putToIndex[ValueParameterDescriptorImpl]

'+' @ [70:35] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'allDeclarations' @ [70:57] ==> public final val allDeclarations: ArrayList<KtDeclaration> defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[PropertyDescriptorImpl]

'mapNotNull' @ [70:73] ==> public inline fun <T, R : Any> Iterable<KtDeclaration>.mapNotNull(transform: (KtDeclaration) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R : Any> -> String

'it' @ [70:86] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index.toString.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [70:89] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'storageManager' @ [73:25] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [73:40] ==> public abstract fun <T : Any> createLazyValue(computable: () -> AbstractPsiBasedDeclarationProvider.Index): NotNullLazyValue<AbstractPsiBasedDeclarationProvider.Index> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Index

'Index' @ [74:21] ==> public constructor Index() defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[ClassConstructorDescriptorImpl]

'doCreateIndex' @ [75:9] ==> protected abstract fun doCreateIndex(index: AbstractPsiBasedDeclarationProvider.Index): Unit defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider[SimpleFunctionDescriptorImpl]

'index' @ [75:23] ==> val index: AbstractPsiBasedDeclarationProvider.Index defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.index.<anonymous>[LocalVariableDescriptor]

'index' @ [76:9] ==> val index: AbstractPsiBasedDeclarationProvider.Index defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.index.<anonymous>[LocalVariableDescriptor]

'toString' @ [81:35] ==> public open fun toString(): String defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider[DeserializedSimpleFunctionDescriptor]

'invoke' @ [81:55] ==> public abstract fun invoke(): AbstractPsiBasedDeclarationProvider.Index defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'toString' @ [81:63] ==> public open fun toString(): String defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[SimpleFunctionDescriptorImpl]

'invoke' @ [84:15] ==> public abstract fun invoke(): AbstractPsiBasedDeclarationProvider.Index defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'allDeclarations' @ [84:23] ==> public final val allDeclarations: ArrayList<KtDeclaration> defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[PropertyDescriptorImpl]

'invoke' @ [87:15] ==> public abstract fun invoke(): AbstractPsiBasedDeclarationProvider.Index defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'functions' @ [87:23] ==> public final val functions: (ArrayListMultimap<(Name..Name?), (KtNamedFunction..KtNamedFunction?)>..ArrayListMultimap<(Name..Name?), (KtNamedFunction..KtNamedFunction?)>?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[PropertyDescriptorImpl]

'safeNameForLazyResolve' @ [87:33] ==> @NotNull public open fun safeNameForLazyResolve(@Nullable name: Name?): Name defined in org.jetbrains.kotlin.resolve.lazy.ResolveSessionUtils[JavaMethodDescriptor]

'name' @ [87:56] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.getFunctionDeclarations[ValueParameterDescriptorImpl]

'toList' @ [87:63] ==> public fun <T> Iterable<(KtNamedFunction..KtNamedFunction?)>.toList(): List<(KtNamedFunction..KtNamedFunction?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtNamedFunction..org.jetbrains.kotlin.psi.KtNamedFunction?)

'invoke' @ [90:15] ==> public abstract fun invoke(): AbstractPsiBasedDeclarationProvider.Index defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'properties' @ [90:23] ==> public final val properties: (ArrayListMultimap<(Name..Name?), (KtProperty..KtProperty?)>..ArrayListMultimap<(Name..Name?), (KtProperty..KtProperty?)>?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[PropertyDescriptorImpl]

'safeNameForLazyResolve' @ [90:34] ==> @NotNull public open fun safeNameForLazyResolve(@Nullable name: Name?): Name defined in org.jetbrains.kotlin.resolve.lazy.ResolveSessionUtils[JavaMethodDescriptor]

'name' @ [90:57] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.getPropertyDeclarations[ValueParameterDescriptorImpl]

'toList' @ [90:64] ==> public fun <T> Iterable<(KtProperty..KtProperty?)>.toList(): List<(KtProperty..KtProperty?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtProperty..org.jetbrains.kotlin.psi.KtProperty?)

'invoke' @ [93:15] ==> public abstract fun invoke(): AbstractPsiBasedDeclarationProvider.Index defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'destructuringDeclarationsEntries' @ [93:23] ==> public final val destructuringDeclarationsEntries: (ArrayListMultimap<(Name..Name?), (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..ArrayListMultimap<(Name..Name?), (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[PropertyDescriptorImpl]

'safeNameForLazyResolve' @ [93:56] ==> @NotNull public open fun safeNameForLazyResolve(@Nullable name: Name?): Name defined in org.jetbrains.kotlin.resolve.lazy.ResolveSessionUtils[JavaMethodDescriptor]

'name' @ [93:79] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.getDestructuringDeclarationsEntries[ValueParameterDescriptorImpl]

'toList' @ [93:86] ==> public fun <T> Iterable<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>.toList(): List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?)

'invoke' @ [96:15] ==> public abstract fun invoke(): AbstractPsiBasedDeclarationProvider.Index defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'classesAndObjects' @ [96:23] ==> public final val classesAndObjects: (ArrayListMultimap<(Name..Name?), (KtClassLikeInfo..KtClassLikeInfo?)>..ArrayListMultimap<(Name..Name?), (KtClassLikeInfo..KtClassLikeInfo?)>?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[PropertyDescriptorImpl]

'safeNameForLazyResolve' @ [96:41] ==> @NotNull public open fun safeNameForLazyResolve(@Nullable name: Name?): Name defined in org.jetbrains.kotlin.resolve.lazy.ResolveSessionUtils[JavaMethodDescriptor]

'name' @ [96:64] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.getClassOrObjectDeclarations[ValueParameterDescriptorImpl]

'invoke' @ [99:15] ==> public abstract fun invoke(): AbstractPsiBasedDeclarationProvider.Index defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'typeAliases' @ [99:23] ==> public final val typeAliases: (ArrayListMultimap<(Name..Name?), (KtTypeAlias..KtTypeAlias?)>..ArrayListMultimap<(Name..Name?), (KtTypeAlias..KtTypeAlias?)>?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[PropertyDescriptorImpl]

'safeNameForLazyResolve' @ [99:35] ==> @NotNull public open fun safeNameForLazyResolve(@Nullable name: Name?): Name defined in org.jetbrains.kotlin.resolve.lazy.ResolveSessionUtils[JavaMethodDescriptor]

'name' @ [99:58] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.getTypeAliasDeclarations[ValueParameterDescriptorImpl]

