'create' @ [53:47] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(WeakReference<UElement>..WeakReference<UElement>?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> WeakReference<UElement>

'Suppress' @ [55:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'this' @ [56:70] ==> <this> defined in org.jetbrains.uast.kotlin.orAnonymous[ReceiverParameterDescriptorImpl]

'+' @ [56:78] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (kind.isNotBlank()) " $kind" else ""' @ [56:94] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'kind' @ [56:98] ==> value-parameter kind: String = ... defined in org.jetbrains.uast.kotlin.orAnonymous[ValueParameterDescriptorImpl]

'isNotBlank' @ [56:103] ==> @InlineOnly public inline fun CharSequence.isNotBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'kind' @ [56:120] ==> value-parameter kind: String = ... defined in org.jetbrains.uast.kotlin.orAnonymous[ValueParameterDescriptorImpl]

'DescriptorToSourceUtils' @ [60:9] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getEffectiveReferencedDescriptors' @ [60:33] ==> @JvmStatic public final fun getEffectiveReferencedDescriptors(descriptor: DeclarationDescriptor): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'this' @ [60:67] ==> <this> defined in org.jetbrains.uast.kotlin.toSource[ReceiverParameterDescriptorImpl]

'asSequence' @ [61:18] ==> public fun <T> Iterable<DeclarationDescriptor>.asSequence(): Sequence<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'mapNotNull' @ [62:18] ==> public fun <T, R : Any> Sequence<DeclarationDescriptor>.mapNotNull(transform: (DeclarationDescriptor) -> PsiElement?): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R : Any> -> PsiElement

'DescriptorToSourceUtils' @ [62:31] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getSourceFromDescriptor' @ [62:55] ==> @JvmStatic public final fun getSourceFromDescriptor(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'it' @ [62:79] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.uast.kotlin.toSource.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [63:18] ==> public fun <T> Sequence<PsiElement>.firstOrNull(): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'getInstance' @ [66:16] ==> @NotNull public open fun getInstance(@NotNull @NonNls p0: String): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'error' @ [66:62] ==> public open fun error(@NotNull p0: Throwable): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'e' @ [66:68] ==> val e: Exception /* = Exception */ defined in org.jetbrains.uast.kotlin.toSource[LocalVariableDescriptor]

'lazy' @ [71:45] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> T): Lazy<T> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'NONE' @ [71:71] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'initializer' @ [71:77] ==> value-parameter initializer: () -> T defined in org.jetbrains.uast.kotlin.lz[ValueParameterDescriptorImpl]

'this' @ [74:9] ==> <this> defined in org.jetbrains.uast.kotlin.toPsiType[ReceiverParameterDescriptorImpl]

'isError' @ [74:14] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'UastErrorType' @ [74:30] ==> public object UastErrorType : PsiType defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'arguments' @ [76:9] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'isEmpty' @ [76:19] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'this' @ [77:26] ==> <this> defined in org.jetbrains.uast.kotlin.toPsiType[ReceiverParameterDescriptorImpl]

'constructor' @ [77:31] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [77:43] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'fqNameSafe' @ [77:66] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [77:78] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'if (boxed) getBoxedType(element) else this' @ [78:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiType?, elseBranch: PsiType?): PsiType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiType?

'boxed' @ [78:46] ==> value-parameter boxed: Boolean defined in org.jetbrains.uast.kotlin.toPsiType[ValueParameterDescriptorImpl]

'getBoxedType' @ [78:53] ==> @Nullable public open fun getBoxedType(@NotNull p0: PsiElement): PsiClassType? defined in com.intellij.psi.PsiPrimitiveType[JavaMethodDescriptor]

'element' @ [78:66] ==> value-parameter element: KtElement defined in org.jetbrains.uast.kotlin.toPsiType[ValueParameterDescriptorImpl]

'this' @ [78:80] ==> <this> defined in org.jetbrains.uast.kotlin.toPsiType.orBoxed[ReceiverParameterDescriptorImpl]

'when (typeFqName) {
            "kotlin.Int" -> PsiType.INT.orBoxed()
            "kotlin.Long" -> PsiType.LONG.orBoxed()
            "kotlin.Short" -> PsiType.SHORT.orBoxed()
            "kotlin.Boolean" -> PsiType.BOOLEAN.orBoxed()
            "kotlin.Byte" -> PsiType.BYTE.orBoxed()
            "kotlin.Char" -> PsiType.CHAR.orBoxed()
            "kotlin.Double" -> PsiType.DOUBLE.orBoxed()
            "kotlin.Float" -> PsiType.FLOAT.orBoxed()
            "kotlin.String" -> PsiType.getJavaLangString(element.manager, GlobalSearchScope.projectScope(element.project))
            else -> null
        }' @ [79:23] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiType?, entry1: PsiType?, entry2: PsiType?, entry3: PsiType?, entry4: PsiType?, entry5: PsiType?, entry6: PsiType?, entry7: PsiType?, entry8: PsiType?, entry9: PsiType?): PsiType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiType?

'typeFqName' @ [79:29] ==> val typeFqName: String? defined in org.jetbrains.uast.kotlin.toPsiType[LocalVariableDescriptor]

'INT' @ [80:37] ==> public final val INT: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'orBoxed' @ [80:41] ==> local final fun PsiPrimitiveType.orBoxed(): PsiType? defined in org.jetbrains.uast.kotlin.toPsiType[SimpleFunctionDescriptorImpl]

'LONG' @ [81:38] ==> public final val LONG: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'orBoxed' @ [81:43] ==> local final fun PsiPrimitiveType.orBoxed(): PsiType? defined in org.jetbrains.uast.kotlin.toPsiType[SimpleFunctionDescriptorImpl]

'SHORT' @ [82:39] ==> public final val SHORT: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'orBoxed' @ [82:45] ==> local final fun PsiPrimitiveType.orBoxed(): PsiType? defined in org.jetbrains.uast.kotlin.toPsiType[SimpleFunctionDescriptorImpl]

'BOOLEAN' @ [83:41] ==> public final val BOOLEAN: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'orBoxed' @ [83:49] ==> local final fun PsiPrimitiveType.orBoxed(): PsiType? defined in org.jetbrains.uast.kotlin.toPsiType[SimpleFunctionDescriptorImpl]

'BYTE' @ [84:38] ==> public final val BYTE: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'orBoxed' @ [84:43] ==> local final fun PsiPrimitiveType.orBoxed(): PsiType? defined in org.jetbrains.uast.kotlin.toPsiType[SimpleFunctionDescriptorImpl]

'CHAR' @ [85:38] ==> public final val CHAR: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'orBoxed' @ [85:43] ==> local final fun PsiPrimitiveType.orBoxed(): PsiType? defined in org.jetbrains.uast.kotlin.toPsiType[SimpleFunctionDescriptorImpl]

'DOUBLE' @ [86:40] ==> public final val DOUBLE: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'orBoxed' @ [86:47] ==> local final fun PsiPrimitiveType.orBoxed(): PsiType? defined in org.jetbrains.uast.kotlin.toPsiType[SimpleFunctionDescriptorImpl]

'FLOAT' @ [87:39] ==> public final val FLOAT: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'orBoxed' @ [87:45] ==> local final fun PsiPrimitiveType.orBoxed(): PsiType? defined in org.jetbrains.uast.kotlin.toPsiType[SimpleFunctionDescriptorImpl]

'getJavaLangString' @ [88:40] ==> @NotNull public open fun getJavaLangString(@NotNull p0: PsiManager, @NotNull p1: GlobalSearchScope): PsiClassType defined in com.intellij.psi.PsiType[JavaMethodDescriptor]

'element' @ [88:58] ==> value-parameter element: KtElement defined in org.jetbrains.uast.kotlin.toPsiType[ValueParameterDescriptorImpl]

'manager' @ [88:66] ==> public final val KtElement.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'projectScope' @ [88:93] ==> @NotNull public open fun projectScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'element' @ [88:106] ==> value-parameter element: KtElement defined in org.jetbrains.uast.kotlin.toPsiType[ValueParameterDescriptorImpl]

'project' @ [88:114] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'psiType' @ [91:13] ==> val psiType: PsiType? defined in org.jetbrains.uast.kotlin.toPsiType[LocalVariableDescriptor]

'psiType' @ [91:37] ==> val psiType: PsiType? defined in org.jetbrains.uast.kotlin.toPsiType[LocalVariableDescriptor]

'this' @ [94:9] ==> <this> defined in org.jetbrains.uast.kotlin.toPsiType[ReceiverParameterDescriptorImpl]

'containsLocalTypes' @ [94:14] ==> private fun KotlinType.containsLocalTypes(): Boolean defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'UastErrorType' @ [94:43] ==> public object UastErrorType : PsiType defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'element' @ [96:19] ==> value-parameter element: KtElement defined in org.jetbrains.uast.kotlin.toPsiType[ValueParameterDescriptorImpl]

'project' @ [96:27] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'?:' @ [97:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KotlinTypeMapper?, right: KotlinTypeMapper): KotlinTypeMapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KotlinTypeMapper

'getService' @ [97:37] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(KotlinUastBindingContextProviderService..KotlinUastBindingContextProviderService?)>): (KotlinUastBindingContextProviderService..KotlinUastBindingContextProviderService?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinUastBindingContextProviderService

'project' @ [97:48] ==> val project: Project defined in org.jetbrains.uast.kotlin.toPsiType[LocalVariableDescriptor]

'java' @ [97:104] ==> public val <T> KClass<KotlinUastBindingContextProviderService>.java: Class<KotlinUastBindingContextProviderService> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinUastBindingContextProviderService

'getTypeMapper' @ [98:14] ==> public abstract fun getTypeMapper(element: KtElement): KotlinTypeMapper? defined in org.jetbrains.uast.kotlin.KotlinUastBindingContextProviderService[SimpleFunctionDescriptorImpl]

'element' @ [98:28] ==> value-parameter element: KtElement defined in org.jetbrains.uast.kotlin.toPsiType[ValueParameterDescriptorImpl]

'UastErrorType' @ [98:47] ==> public object UastErrorType : PsiType defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'BothSignatureWriter' @ [100:27] ==> public constructor BothSignatureWriter(@NotNull p0: BothSignatureWriter.Mode) defined in org.jetbrains.kotlin.codegen.signature.BothSignatureWriter[JavaClassConstructorDescriptor]

'TYPE' @ [100:72] ==> enum entry TYPE defined in org.jetbrains.kotlin.codegen.signature.BothSignatureWriter.Mode[FakeCallableDescriptorForObject]

'if (boxed) TypeMappingMode.GENERIC_ARGUMENT else TypeMappingMode.DEFAULT' @ [101:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeMappingMode, elseBranch: TypeMappingMode): TypeMappingMode[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeMappingMode

'boxed' @ [101:31] ==> value-parameter boxed: Boolean defined in org.jetbrains.uast.kotlin.toPsiType[ValueParameterDescriptorImpl]

'TypeMappingMode' @ [101:38] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.TypeMappingMode[FakeCallableDescriptorForObject]

'GENERIC_ARGUMENT' @ [101:54] ==> @field:JvmField public final val GENERIC_ARGUMENT: TypeMappingMode defined in org.jetbrains.kotlin.load.kotlin.TypeMappingMode.Companion[DeserializedPropertyDescriptor]

'TypeMappingMode' @ [101:76] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.TypeMappingMode[FakeCallableDescriptorForObject]

'DEFAULT' @ [101:92] ==> @field:JvmField public final val DEFAULT: TypeMappingMode defined in org.jetbrains.kotlin.load.kotlin.TypeMappingMode.Companion[DeserializedPropertyDescriptor]

'typeMapper' @ [102:5] ==> val typeMapper: KotlinTypeMapper defined in org.jetbrains.uast.kotlin.toPsiType[LocalVariableDescriptor]

'mapType' @ [102:16] ==> @NotNull public open fun mapType(@NotNull p0: KotlinType, @Nullable p1: JvmSignatureWriter?, @NotNull p2: TypeMappingMode): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'this' @ [102:24] ==> <this> defined in org.jetbrains.uast.kotlin.toPsiType[ReceiverParameterDescriptorImpl]

'signatureWriter' @ [102:30] ==> val signatureWriter: BothSignatureWriter defined in org.jetbrains.uast.kotlin.toPsiType[LocalVariableDescriptor]

'typeMappingMode' @ [102:47] ==> val typeMappingMode: TypeMappingMode defined in org.jetbrains.uast.kotlin.toPsiType[LocalVariableDescriptor]

'StringCharacterIterator' @ [104:21] ==> public constructor StringCharacterIterator(p0: (String..String?)) defined in java.text.StringCharacterIterator[JavaClassConstructorDescriptor]

'signatureWriter' @ [104:45] ==> val signatureWriter: BothSignatureWriter defined in org.jetbrains.uast.kotlin.toPsiType[LocalVariableDescriptor]

'toString' @ [104:61] ==> public open fun toString(): String defined in org.jetbrains.kotlin.codegen.signature.BothSignatureWriter[JavaMethodDescriptor]

'parseTypeString' @ [106:37] ==> @NotNull public open fun parseTypeString(p0: (CharacterIterator..CharacterIterator?), p1: (Function<(String..String?), (String..String?)>..Function<(String..String?), (String..String?)>?)): String defined in com.intellij.psi.impl.compiled.SignatureParsing[JavaMethodDescriptor]

'signature' @ [106:53] ==> val signature: StringCharacterIterator defined in org.jetbrains.uast.kotlin.toPsiType[LocalVariableDescriptor]

'GUESSING_MAPPER' @ [106:84] ==> public final val GUESSING_MAPPER: (Function<(String..String?), (String..String?)>..Function<(String..String?), (String..String?)>?) defined in com.intellij.psi.impl.compiled.StubBuildingVisitor[JavaPropertyDescriptor]

'fromString' @ [107:29] ==> @NotNull public open fun fromString(@NotNull p0: String, p1: Boolean): TypeInfo defined in com.intellij.psi.impl.cache.TypeInfo[JavaMethodDescriptor]

'javaType' @ [107:40] ==> val javaType: String defined in org.jetbrains.uast.kotlin.toPsiType[LocalVariableDescriptor]

'?:' @ [108:20] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'createTypeText' @ [108:29] ==> @Nullable public open fun createTypeText(@NotNull p0: TypeInfo): String? defined in com.intellij.psi.impl.cache.TypeInfo[JavaMethodDescriptor]

'typeInfo' @ [108:44] ==> val typeInfo: TypeInfo defined in org.jetbrains.uast.kotlin.toPsiType[LocalVariableDescriptor]

'UastErrorType' @ [108:64] ==> public object UastErrorType : PsiType defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'ClsTypeElementImpl' @ [110:12] ==> public constructor ClsTypeElementImpl(@NotNull p0: PsiElement, @NotNull p1: String, p2: Char) defined in com.intellij.psi.impl.compiled.ClsTypeElementImpl[JavaClassConstructorDescriptor]

'source' @ [110:31] ==> value-parameter source: UElement defined in org.jetbrains.uast.kotlin.toPsiType[ValueParameterDescriptorImpl]

'getParentOfType' @ [110:38] ==> public inline fun <reified T : UElement> UElement.getParentOfType(strict: Boolean = ...): UDeclaration? defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UDeclaration

'psi' @ [110:76] ==> public abstract val psi: PsiModifierListOwner defined in org.jetbrains.uast.UDeclaration[DeserializedPropertyDescriptor]

'element' @ [110:83] ==> value-parameter element: KtElement defined in org.jetbrains.uast.kotlin.toPsiType[ValueParameterDescriptorImpl]

'typeText' @ [110:92] ==> val typeText: String defined in org.jetbrains.uast.kotlin.toPsiType[LocalVariableDescriptor]

'type' @ [110:112] ==> public final val ClsTypeElementImpl.type: PsiType[MyPropertyDescriptor]

'this' @ [114:37] ==> <this> defined in org.jetbrains.uast.kotlin.containsLocalTypes[ReceiverParameterDescriptorImpl]

'constructor' @ [114:42] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [114:54] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'typeDeclarationDescriptor' @ [115:9] ==> val typeDeclarationDescriptor: ClassifierDescriptor? defined in org.jetbrains.uast.kotlin.containsLocalTypes[LocalVariableDescriptor]

'typeDeclarationDescriptor' @ [116:35] ==> val typeDeclarationDescriptor: ClassifierDescriptor? defined in org.jetbrains.uast.kotlin.containsLocalTypes[LocalVariableDescriptor]

'containingDeclaration' @ [116:61] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containerDescriptor' @ [117:13] ==> val containerDescriptor: DeclarationDescriptor defined in org.jetbrains.uast.kotlin.containsLocalTypes[LocalVariableDescriptor]

'containerDescriptor' @ [117:58] ==> val containerDescriptor: DeclarationDescriptor defined in org.jetbrains.uast.kotlin.containsLocalTypes[LocalVariableDescriptor]

'arguments' @ [122:12] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'any' @ [122:22] ==> public inline fun <T> Iterable<TypeProjection>.any(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'!' @ [122:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [122:29] ==> value-parameter it: TypeProjection defined in org.jetbrains.uast.kotlin.containsLocalTypes.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [122:32] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'it' @ [122:52] ==> value-parameter it: TypeProjection defined in org.jetbrains.uast.kotlin.containsLocalTypes.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [122:55] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'containsLocalTypes' @ [122:60] ==> private fun KotlinType.containsLocalTypes(): Boolean defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [126:9] ==> <this> defined in org.jetbrains.uast.kotlin.toPsiType[ReceiverParameterDescriptorImpl]

'UastErrorType' @ [126:30] ==> public object UastErrorType : PsiType defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'analyze' @ [127:13] ==> internal fun KtElement.analyze(): BindingContext defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'TYPE' @ [127:38] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [127:44] ==> <this> defined in org.jetbrains.uast.kotlin.toPsiType[ReceiverParameterDescriptorImpl]

'UastErrorType' @ [127:60] ==> public object UastErrorType : PsiType defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'toPsiType' @ [127:75] ==> internal fun KotlinType.toPsiType(source: UElement, element: KtElement, boxed: Boolean): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'source' @ [127:85] ==> value-parameter source: UElement defined in org.jetbrains.uast.kotlin.toPsiType[ValueParameterDescriptorImpl]

'this' @ [127:93] ==> <this> defined in org.jetbrains.uast.kotlin.toPsiType[ReceiverParameterDescriptorImpl]

'boxed' @ [127:99] ==> value-parameter boxed: Boolean = ... defined in org.jetbrains.uast.kotlin.toPsiType[ValueParameterDescriptorImpl]

'toLightClass' @ [131:22] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'UastErrorType' @ [131:47] ==> public object UastErrorType : PsiType defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'getClassType' @ [132:25] ==> public open fun getClassType(@NotNull p0: PsiClass): (PsiClassType..PsiClassType?) defined in com.intellij.psi.util.PsiTypesUtil[JavaMethodDescriptor]

'lightClass' @ [132:38] ==> val lightClass: KtLightClass defined in org.jetbrains.uast.kotlin.toPsiType[LocalVariableDescriptor]

'when (this) {
        is KtVariableDeclaration -> {
            val lightElement = toLightElements().firstOrNull()
            if (lightElement != null) return lightElement

            val languagePlugin = context.getLanguagePlugin()
            val uElement = languagePlugin.convertElementWithParent(this, null)
            when (uElement) {
                is UDeclaration -> uElement.psi
                is UDeclarationsExpression -> uElement.declarations.firstOrNull()?.psi
                else -> null
            }
        }
        is KtDeclaration -> toLightElements().firstOrNull()
        is KtElement -> null
        else -> this
    }' @ [136:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?, entry3: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'this' @ [136:18] ==> <this> defined in org.jetbrains.uast.kotlin.getMaybeLightElement[ReceiverParameterDescriptorImpl]

'toLightElements' @ [138:32] ==> public fun KtElement.toLightElements(): List<PsiNamedElement> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [138:50] ==> public fun <T> List<PsiNamedElement>.firstOrNull(): PsiNamedElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement

'lightElement' @ [139:17] ==> val lightElement: PsiNamedElement? defined in org.jetbrains.uast.kotlin.getMaybeLightElement[LocalVariableDescriptor]

'lightElement' @ [139:46] ==> val lightElement: PsiNamedElement? defined in org.jetbrains.uast.kotlin.getMaybeLightElement[LocalVariableDescriptor]

'context' @ [141:34] ==> value-parameter context: UElement defined in org.jetbrains.uast.kotlin.getMaybeLightElement[ValueParameterDescriptorImpl]

'getLanguagePlugin' @ [141:42] ==> public tailrec fun UElement.getLanguagePlugin(): UastLanguagePlugin defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]

'languagePlugin' @ [142:28] ==> val languagePlugin: UastLanguagePlugin defined in org.jetbrains.uast.kotlin.getMaybeLightElement[LocalVariableDescriptor]

'convertElementWithParent' @ [142:43] ==> public abstract fun convertElementWithParent(element: PsiElement, requiredType: Class<out UElement>?): UElement? defined in org.jetbrains.uast.UastLanguagePlugin[DeserializedSimpleFunctionDescriptor]

'this' @ [142:68] ==> <this> defined in org.jetbrains.uast.kotlin.getMaybeLightElement[ReceiverParameterDescriptorImpl]

'when (uElement) {
                is UDeclaration -> uElement.psi
                is UDeclarationsExpression -> uElement.declarations.firstOrNull()?.psi
                else -> null
            }' @ [143:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiModifierListOwner?, entry1: PsiModifierListOwner?, entry2: PsiModifierListOwner?): PsiModifierListOwner?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiModifierListOwner?

'uElement' @ [143:19] ==> val uElement: UElement? defined in org.jetbrains.uast.kotlin.getMaybeLightElement[LocalVariableDescriptor]

'uElement' @ [144:36] ==> val uElement: UElement? defined in org.jetbrains.uast.kotlin.getMaybeLightElement[LocalVariableDescriptor]

'psi' @ [144:45] ==> public abstract val psi: PsiModifierListOwner defined in org.jetbrains.uast.UDeclaration[DeserializedPropertyDescriptor]

'uElement' @ [145:47] ==> val uElement: UElement? defined in org.jetbrains.uast.kotlin.getMaybeLightElement[LocalVariableDescriptor]

'declarations' @ [145:56] ==> public abstract val declarations: List<UDeclaration> defined in org.jetbrains.uast.UDeclarationsExpression[DeserializedPropertyDescriptor]

'firstOrNull' @ [145:69] ==> public fun <T> List<UDeclaration>.firstOrNull(): UDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UDeclaration

'psi' @ [145:84] ==> public abstract val psi: PsiModifierListOwner defined in org.jetbrains.uast.UDeclaration[DeserializedPropertyDescriptor]

'toLightElements' @ [149:29] ==> public fun KtElement.toLightElements(): List<PsiNamedElement> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [149:47] ==> public fun <T> List<PsiNamedElement>.firstOrNull(): PsiNamedElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement

'this' @ [151:17] ==> <this> defined in org.jetbrains.uast.kotlin.getMaybeLightElement[ReceiverParameterDescriptorImpl]

'resultingDescriptor' @ [159:22] ==> value-parameter resultingDescriptor: DeclarationDescriptor? = ... defined in org.jetbrains.uast.kotlin.resolveCallToDeclaration[ValueParameterDescriptorImpl]

'run' @ [159:45] ==> @InlineOnly public inline fun <T, R> KtElement.run(block: KtElement.() -> CallableDescriptor): CallableDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> CallableDescriptor

'getResolvedCall' @ [160:28] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'analyze' @ [160:44] ==> internal fun KtElement.analyze(): BindingContext defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [161:9] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.uast.kotlin.resolveCallToDeclaration.<anonymous>[LocalVariableDescriptor]

'resultingDescriptor' @ [161:22] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'descriptor' @ [164:12] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.uast.kotlin.resolveCallToDeclaration[LocalVariableDescriptor]

'toSource' @ [164:23] ==> internal fun DeclarationDescriptor.toSource(): PsiElement? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'getMaybeLightElement' @ [164:35] ==> internal fun PsiElement.getMaybeLightElement(context: UElement): PsiElement? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [164:56] ==> value-parameter context: KotlinAbstractUElement defined in org.jetbrains.uast.kotlin.resolveCallToDeclaration[ValueParameterDescriptorImpl]

'safeDeparenthesize' @ [168:37] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'this' @ [168:56] ==> <this> defined in org.jetbrains.uast.kotlin.unwrapBlockOrParenthesis[ReceiverParameterDescriptorImpl]

'innerExpression' @ [169:9] ==> val innerExpression: KtExpression defined in org.jetbrains.uast.kotlin.unwrapBlockOrParenthesis[LocalVariableDescriptor]

'innerExpression' @ [170:25] ==> val innerExpression: KtExpression defined in org.jetbrains.uast.kotlin.unwrapBlockOrParenthesis[LocalVariableDescriptor]

'statements' @ [170:41] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'singleOrNull' @ [170:52] ==> public fun <T> List<(KtExpression..KtExpression?)>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'this' @ [170:77] ==> <this> defined in org.jetbrains.uast.kotlin.unwrapBlockOrParenthesis[ReceiverParameterDescriptorImpl]

'safeDeparenthesize' @ [171:26] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'statement' @ [171:45] ==> val statement: KtExpression defined in org.jetbrains.uast.kotlin.unwrapBlockOrParenthesis[LocalVariableDescriptor]

'innerExpression' @ [173:12] ==> val innerExpression: KtExpression defined in org.jetbrains.uast.kotlin.unwrapBlockOrParenthesis[LocalVariableDescriptor]

'?:' @ [177:12] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: BindingContext?, right: BindingContext): BindingContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> BindingContext

'getService' @ [177:27] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(KotlinUastBindingContextProviderService..KotlinUastBindingContextProviderService?)>): (KotlinUastBindingContextProviderService..KotlinUastBindingContextProviderService?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinUastBindingContextProviderService

'project' @ [177:38] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'java' @ [177:94] ==> public val <T> KClass<KotlinUastBindingContextProviderService>.java: Class<KotlinUastBindingContextProviderService> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinUastBindingContextProviderService

'getBindingContext' @ [178:15] ==> public abstract fun getBindingContext(element: KtElement): BindingContext defined in org.jetbrains.uast.kotlin.KotlinUastBindingContextProviderService[SimpleFunctionDescriptorImpl]

'this' @ [178:33] ==> <this> defined in org.jetbrains.uast.kotlin.analyze[ReceiverParameterDescriptorImpl]

'EMPTY' @ [178:57] ==> public final val EMPTY: (BindingContext..BindingContext?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'if (element is T) element.psi else element' @ [182:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'element' @ [182:25] ==> value-parameter element: P defined in org.jetbrains.uast.kotlin.unwrap[ValueParameterDescriptorImpl]

'element' @ [182:39] ==> value-parameter element: P defined in org.jetbrains.uast.kotlin.unwrap[ValueParameterDescriptorImpl]

'psi' @ [182:47] ==> public abstract val psi: PsiModifierListOwner defined in org.jetbrains.uast.UDeclaration[DeserializedPropertyDescriptor]

'element' @ [182:56] ==> value-parameter element: P defined in org.jetbrains.uast.kotlin.unwrap[ValueParameterDescriptorImpl]

'assert' @ [183:5] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'unwrapped' @ [183:12] ==> val unwrapped: PsiElement defined in org.jetbrains.uast.kotlin.unwrap[LocalVariableDescriptor]

'unwrapped' @ [184:12] ==> val unwrapped: PsiElement defined in org.jetbrains.uast.kotlin.unwrap[LocalVariableDescriptor]

'analyze' @ [187:60] ==> internal fun KtElement.analyze(): BindingContext defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'EXPECTED_EXPRESSION_TYPE' @ [187:85] ==> public final val EXPECTED_EXPRESSION_TYPE: (WritableSlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [187:111] ==> <this> defined in org.jetbrains.uast.kotlin.getExpectedType[ReceiverParameterDescriptorImpl]

'analyze' @ [189:55] ==> internal fun KtElement.analyze(): BindingContext defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'TYPE' @ [189:80] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [189:86] ==> <this> defined in org.jetbrains.uast.kotlin.getType[ReceiverParameterDescriptorImpl]

'takeIf' @ [192:9] ==> @InlineOnly @SinceKotlin public inline fun <T> KotlinType.takeIf(predicate: (KotlinType) -> Boolean): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'it' @ [192:18] ==> value-parameter it: KotlinType defined in org.jetbrains.uast.kotlin.getFunctionalInterfaceType.<anonymous>[ValueParameterDescriptorImpl]

'isInterface' @ [192:21] ==> public fun KotlinType.isInterface(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'!' @ [192:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [192:39] ==> value-parameter it: KotlinType defined in org.jetbrains.uast.kotlin.getFunctionalInterfaceType.<anonymous>[ValueParameterDescriptorImpl]

'isBuiltinFunctionalTypeOrSubtype' @ [192:42] ==> public val KotlinType.isBuiltinFunctionalTypeOrSubtype: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'toPsiType' @ [192:78] ==> internal fun KotlinType.toPsiType(source: UElement, element: KtElement, boxed: Boolean): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'source' @ [192:88] ==> value-parameter source: UElement defined in org.jetbrains.uast.kotlin.getFunctionalInterfaceType[ValueParameterDescriptorImpl]

'element' @ [192:96] ==> value-parameter element: KtElement defined in org.jetbrains.uast.kotlin.getFunctionalInterfaceType[ValueParameterDescriptorImpl]

'psi' @ [195:18] ==> public open val psi: KtLambdaExpression defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression[PropertyDescriptorImpl]

'parent' @ [195:22] ==> public final val KtLambdaExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when(parent) {
        is KtBinaryExpressionWithTypeRHS -> parent.right?.getType()?.getFunctionalInterfaceType(this, psi)
        else -> psi.getExpectedType()?.getFunctionalInterfaceType(this, psi)
    }' @ [196:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiType?, entry1: PsiType?): PsiType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiType?

'parent' @ [196:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.getFunctionalInterfaceType[LocalVariableDescriptor]

'parent' @ [197:45] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.getFunctionalInterfaceType[LocalVariableDescriptor]

'right' @ [197:52] ==> public final val KtBinaryExpressionWithTypeRHS.right: KtTypeReference?[MyPropertyDescriptor]

'getType' @ [197:59] ==> internal fun KtTypeReference.getType(): KotlinType? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'getFunctionalInterfaceType' @ [197:70] ==> internal fun KotlinType.getFunctionalInterfaceType(source: UElement, element: KtElement): PsiType? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [197:97] ==> <this> defined in org.jetbrains.uast.kotlin.getFunctionalInterfaceType[ReceiverParameterDescriptorImpl]

'psi' @ [197:103] ==> public open val psi: KtLambdaExpression defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression[PropertyDescriptorImpl]

'psi' @ [198:17] ==> public open val psi: KtLambdaExpression defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression[PropertyDescriptorImpl]

'getExpectedType' @ [198:21] ==> internal fun KtExpression.getExpectedType(): KotlinType? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'getFunctionalInterfaceType' @ [198:40] ==> internal fun KotlinType.getFunctionalInterfaceType(source: UElement, element: KtElement): PsiType? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [198:67] ==> <this> defined in org.jetbrains.uast.kotlin.getFunctionalInterfaceType[ReceiverParameterDescriptorImpl]

'psi' @ [198:73] ==> public open val psi: KtLambdaExpression defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression[PropertyDescriptorImpl]

