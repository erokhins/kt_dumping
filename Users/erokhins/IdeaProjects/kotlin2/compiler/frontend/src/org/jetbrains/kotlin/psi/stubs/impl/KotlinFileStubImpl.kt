'PsiFileStubImpl<KtFile>' @ [38:5] ==> public constructor PsiFileStubImpl<T : (PsiFile..PsiFile?)>(p0: (KtFile..KtFile?)) defined in com.intellij.psi.stubs.PsiFileStubImpl[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiFile..PsiFile?)> -> KtFile

'jetFile' @ [38:29] ==> value-parameter jetFile: KtFile? defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinFileStubImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [41:11] ==> public constructor KotlinFileStubImpl(jetFile: KtFile?, packageName: StringRef, isScript: Boolean) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinFileStubImpl[ClassConstructorDescriptorImpl]

'jetFile' @ [41:16] ==> value-parameter jetFile: KtFile? defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinFileStubImpl.<init>[ValueParameterDescriptorImpl]

'!!' @ [41:25] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: StringRef?): StringRef[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> StringRef

'fromString' @ [41:35] ==> @Contract public open fun fromString(@Nullable p0: String?): (StringRef..StringRef?) defined in com.intellij.util.io.StringRef[JavaMethodDescriptor]

'packageName' @ [41:46] ==> value-parameter packageName: String defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinFileStubImpl.<init>[ValueParameterDescriptorImpl]

'isScript' @ [41:62] ==> value-parameter isScript: Boolean defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinFileStubImpl.<init>[ValueParameterDescriptorImpl]

'FqName' @ [43:47] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'!!' @ [43:54] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'toString' @ [43:64] ==> @Contract public open fun toString(@Nullable p0: StringRef?): (String..String?) defined in com.intellij.util.io.StringRef[JavaMethodDescriptor]

'packageName' @ [43:73] ==> private final val packageName: StringRef defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinFileStubImpl[PropertyDescriptorImpl]

'isScript' @ [44:40] ==> private final val isScript: Boolean defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinFileStubImpl[PropertyDescriptorImpl]

'FILE' @ [45:68] ==> public final val FILE: (KtFileElementType..KtFileElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'+' @ [47:39] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getPackageFqName' @ [47:76] ==> public open fun getPackageFqName(): FqName defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinFileStubImpl[SimpleFunctionDescriptorImpl]

'asString' @ [47:95] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'childrenStubs' @ [50:16] ==> public final val KotlinFileStubImpl.childrenStubs: (MutableList<raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)>..List<raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)>)[MyPropertyDescriptor]

'filterIsInstance' @ [50:30] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<PsiClassStub<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> PsiClassStub<*>

'map' @ [50:66] ==> public inline fun <T, R> Iterable<PsiClassStub<*>>.map(transform: (PsiClassStub<*>) -> (PsiClass..PsiClass?)): List<(PsiClass..PsiClass?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClassStub<*>
    <R> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'it' @ [50:72] ==> value-parameter it: PsiClassStub<*> defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinFileStubImpl.getClasses.<anonymous>[ValueParameterDescriptorImpl]

'psi' @ [50:75] ==> public final val <T : (PsiClass..PsiClass?)> PsiClassStub<out (PsiClass..PsiClass?)>.psi: (PsiClass..PsiClass?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiClass..PsiClass?)> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'toTypedArray' @ [50:81] ==> public inline fun <reified T> Collection<PsiClass>.toTypedArray(): Array<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiClass

'childrenStubs' @ [54:26] ==> public final val KotlinFileStubImpl.childrenStubs: (MutableList<raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)>..List<raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)>)[MyPropertyDescriptor]

'firstOrNull' @ [54:40] ==> public inline fun <T> Iterable<raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)>.firstOrNull(predicate: (raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)) -> Boolean): raw (StubElement<(PsiElement..PsiElement?)>?..StubElement<*>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> raw (com.intellij.psi.stubs.StubElement<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>..com.intellij.psi.stubs.StubElement<*>?)

'it' @ [54:54] ==> value-parameter it: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinFileStubImpl.findImportsByAlias.<anonymous>[ValueParameterDescriptorImpl]

'stubType' @ [54:57] ==> public final val <T : (PsiElement..PsiElement?)> StubElement<(PsiElement..PsiElement?)>.stubType: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'IMPORT_LIST' @ [54:69] ==> public final val IMPORT_LIST: (KtPlaceHolderStubElementType<(KtImportList..KtImportList?)>..KtPlaceHolderStubElementType<(KtImportList..KtImportList?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'emptyList' @ [54:93] ==> public fun <T> emptyList(): List<KotlinImportDirectiveStub> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinImportDirectiveStub

'importList' @ [55:16] ==> val importList: (StubElement<(PsiElement..PsiElement?)>..StubElement<*>) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinFileStubImpl.findImportsByAlias[LocalVariableDescriptor]

'childrenStubs' @ [55:27] ==> public final val <T : (PsiElement..PsiElement?)> StubElement<(PsiElement..PsiElement?)>.childrenStubs: (MutableList<raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)>..List<raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'filterIsInstance' @ [55:41] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KotlinImportDirectiveStub> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KotlinImportDirectiveStub

'filter' @ [55:87] ==> public inline fun <T> Iterable<KotlinImportDirectiveStub>.filter(predicate: (KotlinImportDirectiveStub) -> Boolean): List<KotlinImportDirectiveStub> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinImportDirectiveStub

'it' @ [56:13] ==> value-parameter it: KotlinImportDirectiveStub defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinFileStubImpl.findImportsByAlias.<anonymous>[ValueParameterDescriptorImpl]

'childrenStubs' @ [56:16] ==> public final val KotlinImportDirectiveStub.childrenStubs: (MutableList<raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)>..List<raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)>)[MyPropertyDescriptor]

'firstIsInstanceOrNull' @ [56:30] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): KotlinImportAliasStub? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KotlinImportAliasStub

'getName' @ [56:78] ==> public abstract fun getName(): String? defined in org.jetbrains.kotlin.psi.stubs.KotlinImportAliasStub[SimpleFunctionDescriptorImpl]

'alias' @ [56:91] ==> value-parameter alias: String defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinFileStubImpl.findImportsByAlias[ValueParameterDescriptorImpl]

