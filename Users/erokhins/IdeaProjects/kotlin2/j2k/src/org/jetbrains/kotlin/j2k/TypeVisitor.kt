'values' @ [27:54] ==> public final fun values(): Array<JvmPrimitiveType> defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[SimpleFunctionDescriptorImpl]

'map' @ [27:63] ==> public inline fun <T, R> Array<out JvmPrimitiveType>.map(transform: (JvmPrimitiveType) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmPrimitiveType
    <R> -> String

'it' @ [27:69] ==> value-parameter it: JvmPrimitiveType defined in org.jetbrains.kotlin.j2k.PRIMITIVE_TYPES_NAMES.<anonymous>[ValueParameterDescriptorImpl]

'javaKeywordName' @ [27:72] ==> public final val JvmPrimitiveType.javaKeywordName: String[MyPropertyDescriptor]

'PsiTypeVisitor<Type>' @ [34:5] ==> public constructor PsiTypeVisitor<A : (Any..Any?)>() defined in com.intellij.psi.PsiTypeVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <A : (Any..Any?)> -> Type

'converter' @ [36:48] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeVisitor[PropertyDescriptorImpl]

'typeConverter' @ [36:58] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'ErrorType' @ [39:45] ==> public constructor ErrorType() defined in org.jetbrains.kotlin.j2k.ast.ErrorType[ClassConstructorDescriptorImpl]

'primitiveType' @ [42:20] ==> value-parameter primitiveType: PsiPrimitiveType defined in org.jetbrains.kotlin.j2k.TypeVisitor.visitPrimitiveType[ValueParameterDescriptorImpl]

'canonicalText' @ [42:34] ==> public final val PsiPrimitiveType.canonicalText: String[MyPropertyDescriptor]

'when {
            name == "void" -> UnitType()
            PRIMITIVE_TYPES_NAMES.contains(name) -> PrimitiveType(Identifier.withNoPrototype(StringUtil.capitalize(name)))
            name == "null" -> NullType()
            else -> PrimitiveType(Identifier.withNoPrototype(name))
        }' @ [43:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Type, entry1: Type, entry2: Type, entry3: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type

'name' @ [44:13] ==> val name: String defined in org.jetbrains.kotlin.j2k.TypeVisitor.visitPrimitiveType[LocalVariableDescriptor]

'UnitType' @ [44:31] ==> public constructor UnitType() defined in org.jetbrains.kotlin.j2k.ast.UnitType[ClassConstructorDescriptorImpl]

'PRIMITIVE_TYPES_NAMES' @ [45:13] ==> private val PRIMITIVE_TYPES_NAMES: List<String> defined in org.jetbrains.kotlin.j2k in file TypeVisitor.kt[PropertyDescriptorImpl]

'contains' @ [45:35] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'name' @ [45:44] ==> val name: String defined in org.jetbrains.kotlin.j2k.TypeVisitor.visitPrimitiveType[LocalVariableDescriptor]

'PrimitiveType' @ [45:53] ==> public constructor PrimitiveType(name: Identifier) defined in org.jetbrains.kotlin.j2k.ast.PrimitiveType[ClassConstructorDescriptorImpl]

'Identifier' @ [45:67] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'withNoPrototype' @ [45:78] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'capitalize' @ [45:105] ==> @NotNull @Contract public open fun capitalize(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'name' @ [45:116] ==> val name: String defined in org.jetbrains.kotlin.j2k.TypeVisitor.visitPrimitiveType[LocalVariableDescriptor]

'name' @ [46:13] ==> val name: String defined in org.jetbrains.kotlin.j2k.TypeVisitor.visitPrimitiveType[LocalVariableDescriptor]

'NullType' @ [46:31] ==> public constructor NullType() defined in org.jetbrains.kotlin.j2k.ast.NullType[ClassConstructorDescriptorImpl]

'PrimitiveType' @ [47:21] ==> public constructor PrimitiveType(name: Identifier) defined in org.jetbrains.kotlin.j2k.ast.PrimitiveType[ClassConstructorDescriptorImpl]

'Identifier' @ [47:35] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'withNoPrototype' @ [47:46] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'name' @ [47:62] ==> val name: String defined in org.jetbrains.kotlin.j2k.TypeVisitor.visitPrimitiveType[LocalVariableDescriptor]

'ArrayType' @ [52:16] ==> public constructor ArrayType(elementType: Type, nullability: Nullability, settings: ConverterSettings) defined in org.jetbrains.kotlin.j2k.ast.ArrayType[ClassConstructorDescriptorImpl]

'typeConverter' @ [52:26] ==> private final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.TypeVisitor[PropertyDescriptorImpl]

'convertType' @ [52:40] ==> public final fun convertType(type: PsiType?, nullability: Nullability = ..., mutability: Mutability = ..., inAnnotationType: Boolean = ...): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'arrayType' @ [52:52] ==> value-parameter arrayType: PsiArrayType defined in org.jetbrains.kotlin.j2k.TypeVisitor.visitArrayType[ValueParameterDescriptorImpl]

'componentType' @ [52:62] ==> public final val PsiArrayType.componentType: PsiType[MyPropertyDescriptor]

'inAnnotationType' @ [52:96] ==> private final val inAnnotationType: Boolean defined in org.jetbrains.kotlin.j2k.TypeVisitor[PropertyDescriptorImpl]

'Default' @ [52:127] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'converter' @ [52:136] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeVisitor[PropertyDescriptorImpl]

'settings' @ [52:146] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'if (classType === topLevelType) topLevelTypeMutability else Mutability.Default' @ [56:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Mutability, elseBranch: Mutability): Mutability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Mutability

'classType' @ [56:30] ==> value-parameter classType: PsiClassType defined in org.jetbrains.kotlin.j2k.TypeVisitor.visitClassType[ValueParameterDescriptorImpl]

'topLevelType' @ [56:44] ==> private final val topLevelType: PsiType defined in org.jetbrains.kotlin.j2k.TypeVisitor[PropertyDescriptorImpl]

'topLevelTypeMutability' @ [56:58] ==> private final val topLevelTypeMutability: Mutability defined in org.jetbrains.kotlin.j2k.TypeVisitor[PropertyDescriptorImpl]

'Default' @ [56:97] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'constructReferenceElement' @ [57:26] ==> private final fun constructReferenceElement(classType: PsiClassType, mutability: Mutability): ReferenceElement defined in org.jetbrains.kotlin.j2k.TypeVisitor[SimpleFunctionDescriptorImpl]

'classType' @ [57:52] ==> value-parameter classType: PsiClassType defined in org.jetbrains.kotlin.j2k.TypeVisitor.visitClassType[ValueParameterDescriptorImpl]

'mutability' @ [57:63] ==> val mutability: Mutability defined in org.jetbrains.kotlin.j2k.TypeVisitor.visitClassType[LocalVariableDescriptor]

'ClassType' @ [58:16] ==> public constructor ClassType(referenceElement: ReferenceElement, nullability: Nullability, settings: ConverterSettings) defined in org.jetbrains.kotlin.j2k.ast.ClassType[ClassConstructorDescriptorImpl]

'refElement' @ [58:26] ==> val refElement: ReferenceElement defined in org.jetbrains.kotlin.j2k.TypeVisitor.visitClassType[LocalVariableDescriptor]

'Default' @ [58:50] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'converter' @ [58:59] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeVisitor[PropertyDescriptorImpl]

'settings' @ [58:69] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'convertTypeArgs' @ [62:24] ==> private final fun convertTypeArgs(classType: PsiClassType): List<Type> defined in org.jetbrains.kotlin.j2k.TypeVisitor[SimpleFunctionDescriptorImpl]

'classType' @ [62:40] ==> value-parameter classType: PsiClassType defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[ValueParameterDescriptorImpl]

'classType' @ [64:24] ==> value-parameter classType: PsiClassType defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[ValueParameterDescriptorImpl]

'resolve' @ [64:34] ==> @Nullable public abstract fun resolve(): PsiClass? defined in com.intellij.psi.PsiClassType[JavaMethodDescriptor]

'psiClass' @ [65:13] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[LocalVariableDescriptor]

'psiClass' @ [66:33] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[LocalVariableDescriptor]

'qualifiedName' @ [66:42] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'converter' @ [67:13] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeVisitor[PropertyDescriptorImpl]

'convertToKotlinAnalogIdentifier' @ [67:23] ==> public fun Converter.convertToKotlinAnalogIdentifier(classQualifiedName: String?, mutability: Mutability): Identifier? defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'javaClassName' @ [67:55] ==> val javaClassName: String? defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[LocalVariableDescriptor]

'mutability' @ [67:70] ==> value-parameter mutability: Mutability defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[ValueParameterDescriptorImpl]

'let' @ [67:83] ==> @InlineOnly public inline fun <T, R> Identifier.let(block: (Identifier) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Identifier
    <R> -> Nothing

'ReferenceElement' @ [68:24] ==> public constructor ReferenceElement(name: Identifier, typeArgs: List<Element>) defined in org.jetbrains.kotlin.j2k.ast.ReferenceElement[ClassConstructorDescriptorImpl]

'it' @ [68:41] ==> value-parameter it: Identifier defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement.<anonymous>[ValueParameterDescriptorImpl]

'typeArgs' @ [68:45] ==> val typeArgs: List<Type> defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[LocalVariableDescriptor]

'assignNoPrototype' @ [68:55] ==> public fun <TElement : Element> ReferenceElement.assignNoPrototype(): ReferenceElement defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ReferenceElement

'inAnnotationType' @ [71:17] ==> private final val inAnnotationType: Boolean defined in org.jetbrains.kotlin.j2k.TypeVisitor[PropertyDescriptorImpl]

'javaClassName' @ [71:37] ==> val javaClassName: String? defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[LocalVariableDescriptor]

'FqName' @ [72:30] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'Identifier' @ [73:34] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'withNoPrototype' @ [73:45] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'fqName' @ [73:61] ==> val fqName: FqName defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[LocalVariableDescriptor]

'shortName' @ [73:68] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'identifier' @ [73:80] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'listOf' @ [73:102] ==> public fun <T> listOf(element: FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'fqName' @ [73:109] ==> val fqName: FqName defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[LocalVariableDescriptor]

'ReferenceElement' @ [74:24] ==> public constructor ReferenceElement(name: Identifier, typeArgs: List<Element>) defined in org.jetbrains.kotlin.j2k.ast.ReferenceElement[ClassConstructorDescriptorImpl]

'identifier' @ [74:41] ==> val identifier: Identifier defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[LocalVariableDescriptor]

'typeArgs' @ [74:53] ==> val typeArgs: List<Type> defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[LocalVariableDescriptor]

'assignNoPrototype' @ [74:63] ==> public fun <TElement : Element> ReferenceElement.assignNoPrototype(): ReferenceElement defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ReferenceElement

'classType' @ [78:13] ==> value-parameter classType: PsiClassType defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[ValueParameterDescriptorImpl]

'converter' @ [79:20] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeVisitor[PropertyDescriptorImpl]

'convertCodeReferenceElement' @ [79:30] ==> public final fun convertCodeReferenceElement(element: PsiJavaCodeReferenceElement, hasExternalQualifier: Boolean, typeArgsConverted: List<Element>? = ...): ReferenceElement defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'classType' @ [79:58] ==> value-parameter classType: PsiClassType defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[ValueParameterDescriptorImpl]

'reference' @ [79:68] ==> public final val PsiClassReferenceType.reference: PsiJavaCodeReferenceElement[MyPropertyDescriptor]

'typeArgs' @ [79:129] ==> val typeArgs: List<Type> defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[LocalVariableDescriptor]

'ReferenceElement' @ [82:16] ==> public constructor ReferenceElement(name: Identifier, typeArgs: List<Element>) defined in org.jetbrains.kotlin.j2k.ast.ReferenceElement[ClassConstructorDescriptorImpl]

'Identifier' @ [82:33] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'withNoPrototype' @ [82:44] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'classType' @ [82:60] ==> value-parameter classType: PsiClassType defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[ValueParameterDescriptorImpl]

'className' @ [82:70] ==> public final val PsiClassType.className: (String..String?)[MyPropertyDescriptor]

'typeArgs' @ [82:88] ==> val typeArgs: List<Type> defined in org.jetbrains.kotlin.j2k.TypeVisitor.constructReferenceElement[LocalVariableDescriptor]

'assignNoPrototype' @ [82:98] ==> public fun <TElement : Element> ReferenceElement.assignNoPrototype(): ReferenceElement defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ReferenceElement

'if (classType.parameterCount == 0) {
            createTypeArgsForRawTypeUsage(classType, Mutability.Default)
        }
        else {
            typeConverter.convertTypes(classType.parameters)
        }' @ [86:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Type>, elseBranch: List<Type>): List<Type>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Type>

'classType' @ [86:20] ==> value-parameter classType: PsiClassType defined in org.jetbrains.kotlin.j2k.TypeVisitor.convertTypeArgs[ValueParameterDescriptorImpl]

'parameterCount' @ [86:30] ==> public final val PsiClassType.parameterCount: Int[MyPropertyDescriptor]

'createTypeArgsForRawTypeUsage' @ [87:13] ==> private final fun createTypeArgsForRawTypeUsage(classType: PsiClassType, mutability: Mutability): List<Type> defined in org.jetbrains.kotlin.j2k.TypeVisitor[SimpleFunctionDescriptorImpl]

'classType' @ [87:43] ==> value-parameter classType: PsiClassType defined in org.jetbrains.kotlin.j2k.TypeVisitor.convertTypeArgs[ValueParameterDescriptorImpl]

'Default' @ [87:65] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'typeConverter' @ [90:13] ==> private final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.TypeVisitor[PropertyDescriptorImpl]

'convertTypes' @ [90:27] ==> public final fun convertTypes(types: Array<PsiType>): List<Type> defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'classType' @ [90:40] ==> value-parameter classType: PsiClassType defined in org.jetbrains.kotlin.j2k.TypeVisitor.convertTypeArgs[ValueParameterDescriptorImpl]

'parameters' @ [90:50] ==> public final val PsiClassType.parameters: (Array<(PsiType..PsiType?)>..Array<out (PsiType..PsiType?)>)[MyPropertyDescriptor]

'classType' @ [95:13] ==> value-parameter classType: PsiClassType defined in org.jetbrains.kotlin.j2k.TypeVisitor.createTypeArgsForRawTypeUsage[ValueParameterDescriptorImpl]

'classType' @ [96:31] ==> value-parameter classType: PsiClassType defined in org.jetbrains.kotlin.j2k.TypeVisitor.createTypeArgsForRawTypeUsage[ValueParameterDescriptorImpl]

'reference' @ [96:41] ==> public final val PsiClassReferenceType.reference: PsiJavaCodeReferenceElement[MyPropertyDescriptor]

'resolve' @ [96:51] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiJavaCodeReferenceElement[JavaMethodDescriptor]

'targetClass' @ [97:17] ==> val targetClass: PsiClass? defined in org.jetbrains.kotlin.j2k.TypeVisitor.createTypeArgsForRawTypeUsage[LocalVariableDescriptor]

'targetClass' @ [98:24] ==> val targetClass: PsiClass? defined in org.jetbrains.kotlin.j2k.TypeVisitor.createTypeArgsForRawTypeUsage[LocalVariableDescriptor]

'typeParameters' @ [98:36] ==> public final val PsiClass.typeParameters: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>)[MyPropertyDescriptor]

'map' @ [98:51] ==> public inline fun <T, R> Array<out (PsiTypeParameter..PsiTypeParameter?)>.map(transform: ((PsiTypeParameter..PsiTypeParameter?)) -> StarProjectionType): List<StarProjectionType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiTypeParameter..com.intellij.psi.PsiTypeParameter?)
    <R> -> StarProjectionType

'StarProjectionType' @ [98:57] ==> public constructor StarProjectionType() defined in org.jetbrains.kotlin.j2k.ast.StarProjectionType[ClassConstructorDescriptorImpl]

'assignNoPrototype' @ [98:78] ==> public fun <TElement : Element> StarProjectionType.assignNoPrototype(): StarProjectionType defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> StarProjectionType

'listOf' @ [101:16] ==> @InlineOnly public inline fun <T> listOf(): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'when {
            wildcardType.isExtends -> OutProjectionType(typeConverter.convertType(wildcardType.extendsBound))
            wildcardType.isSuper -> InProjectionType(typeConverter.convertType(wildcardType.superBound))
            else -> StarProjectionType()
        }' @ [105:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Type, entry1: Type, entry2: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type

'wildcardType' @ [106:13] ==> value-parameter wildcardType: PsiWildcardType defined in org.jetbrains.kotlin.j2k.TypeVisitor.visitWildcardType[ValueParameterDescriptorImpl]

'isExtends' @ [106:26] ==> public final val PsiWildcardType.isExtends: Boolean[MyPropertyDescriptor]

'OutProjectionType' @ [106:39] ==> public constructor OutProjectionType(bound: Type) defined in org.jetbrains.kotlin.j2k.ast.OutProjectionType[ClassConstructorDescriptorImpl]

'typeConverter' @ [106:57] ==> private final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.TypeVisitor[PropertyDescriptorImpl]

'convertType' @ [106:71] ==> public final fun convertType(type: PsiType?, nullability: Nullability = ..., mutability: Mutability = ..., inAnnotationType: Boolean = ...): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'wildcardType' @ [106:83] ==> value-parameter wildcardType: PsiWildcardType defined in org.jetbrains.kotlin.j2k.TypeVisitor.visitWildcardType[ValueParameterDescriptorImpl]

'extendsBound' @ [106:96] ==> public final val PsiWildcardType.extendsBound: PsiType[MyPropertyDescriptor]

'wildcardType' @ [107:13] ==> value-parameter wildcardType: PsiWildcardType defined in org.jetbrains.kotlin.j2k.TypeVisitor.visitWildcardType[ValueParameterDescriptorImpl]

'isSuper' @ [107:26] ==> public final val PsiWildcardType.isSuper: Boolean[MyPropertyDescriptor]

'InProjectionType' @ [107:37] ==> public constructor InProjectionType(bound: Type) defined in org.jetbrains.kotlin.j2k.ast.InProjectionType[ClassConstructorDescriptorImpl]

'typeConverter' @ [107:54] ==> private final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.TypeVisitor[PropertyDescriptorImpl]

'convertType' @ [107:68] ==> public final fun convertType(type: PsiType?, nullability: Nullability = ..., mutability: Mutability = ..., inAnnotationType: Boolean = ...): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'wildcardType' @ [107:80] ==> value-parameter wildcardType: PsiWildcardType defined in org.jetbrains.kotlin.j2k.TypeVisitor.visitWildcardType[ValueParameterDescriptorImpl]

'superBound' @ [107:93] ==> public final val PsiWildcardType.superBound: PsiType[MyPropertyDescriptor]

'StarProjectionType' @ [108:21] ==> public constructor StarProjectionType() defined in org.jetbrains.kotlin.j2k.ast.StarProjectionType[ClassConstructorDescriptorImpl]

'VarArgType' @ [113:16] ==> public constructor VarArgType(type: Type) defined in org.jetbrains.kotlin.j2k.ast.VarArgType[ClassConstructorDescriptorImpl]

'typeConverter' @ [113:27] ==> private final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.TypeVisitor[PropertyDescriptorImpl]

'convertType' @ [113:41] ==> public final fun convertType(type: PsiType?, nullability: Nullability = ..., mutability: Mutability = ..., inAnnotationType: Boolean = ...): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'ellipsisType' @ [113:53] ==> value-parameter ellipsisType: PsiEllipsisType defined in org.jetbrains.kotlin.j2k.TypeVisitor.visitEllipsisType[ValueParameterDescriptorImpl]

'componentType' @ [113:66] ==> public final val PsiEllipsisType.componentType: PsiType[MyPropertyDescriptor]

'inAnnotationType' @ [113:100] ==> private final val inAnnotationType: Boolean defined in org.jetbrains.kotlin.j2k.TypeVisitor[PropertyDescriptorImpl]

