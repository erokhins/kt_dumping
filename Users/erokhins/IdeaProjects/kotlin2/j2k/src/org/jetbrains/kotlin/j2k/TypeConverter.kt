'Default' @ [37:86] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Default' @ [39:113] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'HashSet' @ [44:39] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiType

'Default' @ [48:52] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Default' @ [49:49] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'type' @ [52:13] ==> value-parameter type: PsiType? defined in org.jetbrains.kotlin.j2k.TypeConverter.convertType[ValueParameterDescriptorImpl]

'ErrorType' @ [52:34] ==> public constructor ErrorType() defined in org.jetbrains.kotlin.j2k.ast.ErrorType[ClassConstructorDescriptorImpl]

'assignNoPrototype' @ [52:46] ==> public fun <TElement : Element> ErrorType.assignNoPrototype(): ErrorType defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ErrorType

'!' @ [54:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typesBeingConverted' @ [54:14] ==> private final val typesBeingConverted: HashSet<PsiType> defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'add' @ [54:34] ==> public open fun add(element: PsiType): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'type' @ [54:38] ==> value-parameter type: PsiType? defined in org.jetbrains.kotlin.j2k.TypeConverter.convertType[ValueParameterDescriptorImpl]

'ErrorType' @ [55:20] ==> public constructor ErrorType() defined in org.jetbrains.kotlin.j2k.ast.ErrorType[ClassConstructorDescriptorImpl]

'assignNoPrototype' @ [55:32] ==> public fun <TElement : Element> ErrorType.assignNoPrototype(): ErrorType defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ErrorType

'type' @ [58:22] ==> value-parameter type: PsiType? defined in org.jetbrains.kotlin.j2k.TypeConverter.convertType[ValueParameterDescriptorImpl]

'accept' @ [58:27] ==> public abstract fun <A : (Any..Any?)> accept(@NotNull p0: PsiTypeVisitor<(Type..Type?)>): (Type..Type?) defined in com.intellij.psi.PsiType[JavaMethodDescriptor]
Inferred types:
    <A : (Any..Any?)> -> Type

'TypeVisitor' @ [58:40] ==> public constructor TypeVisitor(converter: Converter, topLevelType: PsiType, topLevelTypeMutability: Mutability, inAnnotationType: Boolean) defined in org.jetbrains.kotlin.j2k.TypeVisitor[ClassConstructorDescriptorImpl]

'converter' @ [58:52] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'type' @ [58:63] ==> value-parameter type: PsiType? defined in org.jetbrains.kotlin.j2k.TypeConverter.convertType[ValueParameterDescriptorImpl]

'mutability' @ [58:69] ==> value-parameter mutability: Mutability = ... defined in org.jetbrains.kotlin.j2k.TypeConverter.convertType[ValueParameterDescriptorImpl]

'inAnnotationType' @ [58:81] ==> value-parameter inAnnotationType: Boolean = ... defined in org.jetbrains.kotlin.j2k.TypeConverter.convertType[ValueParameterDescriptorImpl]

'assignNoPrototype' @ [58:102] ==> public fun <TElement : Element> Type.assignNoPrototype(): Type defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Type

'typesBeingConverted' @ [60:9] ==> private final val typesBeingConverted: HashSet<PsiType> defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'remove' @ [60:29] ==> public open fun remove(element: PsiType): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'type' @ [60:36] ==> value-parameter type: PsiType? defined in org.jetbrains.kotlin.j2k.TypeConverter.convertType[ValueParameterDescriptorImpl]

'when (nullability) {
            Nullability.NotNull -> result.toNotNullType()
            Nullability.Nullable -> result.toNullableType()
            Nullability.Default -> result
        }' @ [62:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Type, entry1: Type, entry2: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type

'nullability' @ [62:22] ==> value-parameter nullability: Nullability = ... defined in org.jetbrains.kotlin.j2k.TypeConverter.convertType[ValueParameterDescriptorImpl]

'NotNull' @ [63:25] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'result' @ [63:36] ==> val result: Type defined in org.jetbrains.kotlin.j2k.TypeConverter.convertType[LocalVariableDescriptor]

'toNotNullType' @ [63:43] ==> public open fun toNotNullType(): Type defined in org.jetbrains.kotlin.j2k.ast.Type[SimpleFunctionDescriptorImpl]

'Nullable' @ [64:25] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'result' @ [64:37] ==> val result: Type defined in org.jetbrains.kotlin.j2k.TypeConverter.convertType[LocalVariableDescriptor]

'toNullableType' @ [64:44] ==> public open fun toNullableType(): Type defined in org.jetbrains.kotlin.j2k.ast.Type[SimpleFunctionDescriptorImpl]

'Default' @ [65:25] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'result' @ [65:36] ==> val result: Type defined in org.jetbrains.kotlin.j2k.TypeConverter.convertType[LocalVariableDescriptor]

'types' @ [70:15] ==> value-parameter types: Array<PsiType> defined in org.jetbrains.kotlin.j2k.TypeConverter.convertTypes[ValueParameterDescriptorImpl]

'map' @ [70:21] ==> public inline fun <T, R> Array<out PsiType>.map(transform: (PsiType) -> Type): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiType
    <R> -> Type

'convertType' @ [70:27] ==> public final fun convertType(type: PsiType?, nullability: Nullability = ..., mutability: Mutability = ..., inAnnotationType: Boolean = ...): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'it' @ [70:39] ==> value-parameter it: PsiType defined in org.jetbrains.kotlin.j2k.TypeConverter.convertTypes.<anonymous>[ValueParameterDescriptorImpl]

'if (variable.isMainMethodParameter()) {
            ArrayType(ClassType(ReferenceElement(Identifier.withNoPrototype("String"), listOf()).assignNoPrototype(), Nullability.NotNull, converter.settings).assignNoPrototype(),
                      Nullability.NotNull,
                      converter.settings).assignNoPrototype()
        }
        else {
            convertType(variable.type, variableNullability(variable), variableMutability(variable))
        }' @ [73:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'variable' @ [73:26] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.convertVariableType[ValueParameterDescriptorImpl]

'isMainMethodParameter' @ [73:35] ==> private final fun PsiVariable.isMainMethodParameter(): Boolean defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'ArrayType' @ [74:13] ==> public constructor ArrayType(elementType: Type, nullability: Nullability, settings: ConverterSettings) defined in org.jetbrains.kotlin.j2k.ast.ArrayType[ClassConstructorDescriptorImpl]

'ClassType' @ [74:23] ==> public constructor ClassType(referenceElement: ReferenceElement, nullability: Nullability, settings: ConverterSettings) defined in org.jetbrains.kotlin.j2k.ast.ClassType[ClassConstructorDescriptorImpl]

'ReferenceElement' @ [74:33] ==> public constructor ReferenceElement(name: Identifier, typeArgs: List<Element>) defined in org.jetbrains.kotlin.j2k.ast.ReferenceElement[ClassConstructorDescriptorImpl]

'withNoPrototype' @ [74:61] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'listOf' @ [74:88] ==> @InlineOnly public inline fun <T> listOf(): List<Element> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Element

'assignNoPrototype' @ [74:98] ==> public fun <TElement : Element> ReferenceElement.assignNoPrototype(): ReferenceElement defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ReferenceElement

'NotNull' @ [74:131] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'converter' @ [74:140] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'settings' @ [74:150] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'assignNoPrototype' @ [74:160] ==> public fun <TElement : Element> ClassType.assignNoPrototype(): ClassType defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ClassType

'NotNull' @ [75:35] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'converter' @ [76:23] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'settings' @ [76:33] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'assignNoPrototype' @ [76:43] ==> public fun <TElement : Element> ArrayType.assignNoPrototype(): ArrayType defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ArrayType

'convertType' @ [79:13] ==> public final fun convertType(type: PsiType?, nullability: Nullability = ..., mutability: Mutability = ..., inAnnotationType: Boolean = ...): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'variable' @ [79:25] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.convertVariableType[ValueParameterDescriptorImpl]

'type' @ [79:34] ==> public final val PsiVariable.type: PsiType[MyPropertyDescriptor]

'variableNullability' @ [79:40] ==> public final fun variableNullability(variable: PsiVariable): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'variable' @ [79:60] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.convertVariableType[ValueParameterDescriptorImpl]

'variableMutability' @ [79:71] ==> public final fun variableMutability(variable: PsiVariable): Mutability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'variable' @ [79:90] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.convertVariableType[ValueParameterDescriptorImpl]

'result' @ [81:16] ==> val result: Type defined in org.jetbrains.kotlin.j2k.TypeConverter.convertVariableType[LocalVariableDescriptor]

'assignPrototype' @ [81:23] ==> public fun <TElement : Element> Type.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): Type defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Type

'variable' @ [81:39] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.convertVariableType[ValueParameterDescriptorImpl]

'typeElement' @ [81:48] ==> public final val PsiVariable.typeElement: PsiTypeElement?[MyPropertyDescriptor]

'NO_SPACES' @ [81:90] ==> public final val NO_SPACES: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'convertType' @ [85:15] ==> public final fun convertType(type: PsiType?, nullability: Nullability = ..., mutability: Mutability = ..., inAnnotationType: Boolean = ...): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'method' @ [85:27] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.convertMethodReturnType[ValueParameterDescriptorImpl]

'returnType' @ [85:34] ==> public final val PsiMethod.returnType: PsiType?[MyPropertyDescriptor]

'methodNullability' @ [85:46] ==> public final fun methodNullability(method: PsiMethod): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'method' @ [85:64] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.convertMethodReturnType[ValueParameterDescriptorImpl]

'methodMutability' @ [85:73] ==> public final fun methodMutability(method: PsiMethod): Mutability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'method' @ [85:90] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.convertMethodReturnType[ValueParameterDescriptorImpl]

'assignPrototype' @ [85:99] ==> public fun <TElement : Element> Type.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): Type defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Type

'method' @ [85:115] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.convertMethodReturnType[ValueParameterDescriptorImpl]

'returnTypeElement' @ [85:122] ==> public final val PsiMethod.returnTypeElement: PsiTypeElement?[MyPropertyDescriptor]

'nullabilityFlavor' @ [88:15] ==> private final val nullabilityFlavor: <no name provided> defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'forVariableType' @ [88:33] ==> public final fun forVariableType(variable: PsiVariable, checkScope: Boolean): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>[SimpleFunctionDescriptorImpl]

'variable' @ [88:49] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.variableNullability[ValueParameterDescriptorImpl]

'nullabilityFlavor' @ [91:15] ==> private final val nullabilityFlavor: <no name provided> defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'forVariableReference' @ [91:33] ==> public final fun forVariableReference(variable: PsiVariable, reference: PsiReferenceExpression): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>[SimpleFunctionDescriptorImpl]

'variable' @ [91:54] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.variableReferenceNullability[ValueParameterDescriptorImpl]

'reference' @ [91:64] ==> value-parameter reference: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.variableReferenceNullability[ValueParameterDescriptorImpl]

'nullabilityFlavor' @ [94:15] ==> private final val nullabilityFlavor: <no name provided> defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'forMethodReturnType' @ [94:33] ==> public final fun forMethodReturnType(method: PsiMethod): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>[SimpleFunctionDescriptorImpl]

'method' @ [94:53] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.methodNullability[ValueParameterDescriptorImpl]

'mutabilityFlavor' @ [97:15] ==> private final val mutabilityFlavor: <no name provided> defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'forVariableType' @ [97:32] ==> public final fun forVariableType(variable: PsiVariable, checkScope: Boolean): Mutability defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>[SimpleFunctionDescriptorImpl]

'variable' @ [97:48] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.variableMutability[ValueParameterDescriptorImpl]

'mutabilityFlavor' @ [100:15] ==> private final val mutabilityFlavor: <no name provided> defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'forMethodReturnType' @ [100:32] ==> public final fun forMethodReturnType(method: PsiMethod): Mutability defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>[SimpleFunctionDescriptorImpl]

'method' @ [100:52] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.methodMutability[ValueParameterDescriptorImpl]

'this' @ [102:55] ==> <this> defined in org.jetbrains.kotlin.j2k.TypeConverter.isMainMethodParameter[ReceiverParameterDescriptorImpl]

'?:' @ [102:79] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'declarationScope' @ [102:80] ==> public final val PsiParameter.declarationScope: PsiElement[MyPropertyDescriptor]

'isMainMethod' @ [102:113] ==> public fun PsiMethod.isMainMethod(): Boolean defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'when(element) {
            is PsiParameter -> element.declarationScope
            is PsiField -> if (element.hasModifierProperty(PsiModifier.PRIVATE)) element.containingClass else element.containingFile
            is PsiMethod -> if (element.hasModifierProperty(PsiModifier.PRIVATE)) element.containingClass else element.containingFile
            is PsiLocalVariable -> element.getContainingMethod()
            else -> null
        }' @ [105:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?, entry3: PsiElement?, entry4: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'element' @ [105:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.searchScope[ValueParameterDescriptorImpl]

'element' @ [106:32] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.searchScope[ValueParameterDescriptorImpl]

'declarationScope' @ [106:40] ==> public final val PsiParameter.declarationScope: PsiElement[MyPropertyDescriptor]

'if (element.hasModifierProperty(PsiModifier.PRIVATE)) element.containingClass else element.containingFile' @ [107:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'element' @ [107:32] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.searchScope[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [107:40] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiField[JavaMethodDescriptor]

'PRIVATE' @ [107:72] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'element' @ [107:82] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.searchScope[ValueParameterDescriptorImpl]

'containingClass' @ [107:90] ==> public final val PsiField.containingClass: PsiClass?[MyPropertyDescriptor]

'element' @ [107:111] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.searchScope[ValueParameterDescriptorImpl]

'containingFile' @ [107:119] ==> public final val PsiField.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'if (element.hasModifierProperty(PsiModifier.PRIVATE)) element.containingClass else element.containingFile' @ [108:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'element' @ [108:33] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.searchScope[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [108:41] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'PRIVATE' @ [108:73] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'element' @ [108:83] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.searchScope[ValueParameterDescriptorImpl]

'containingClass' @ [108:91] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'element' @ [108:112] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.searchScope[ValueParameterDescriptorImpl]

'containingFile' @ [108:120] ==> public final val PsiMethod.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'element' @ [109:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.searchScope[ValueParameterDescriptorImpl]

'getContainingMethod' @ [109:44] ==> public fun PsiElement.getContainingMethod(): PsiMethod? defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'hasModifierProperty' @ [115:13] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiVariable[JavaMethodDescriptor]

'FINAL' @ [115:45] ==> public const final val FINAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'when(this) {
            is PsiLocalVariable -> !hasWriteAccesses(converter.referenceSearcher, getContainingMethod())
            is PsiField -> if (hasModifierProperty(PsiModifier.PRIVATE)) !hasWriteAccesses(converter.referenceSearcher, containingClass) else false
            else -> false
        }' @ [116:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [116:21] ==> <this> defined in org.jetbrains.kotlin.j2k.TypeConverter.isEffectivelyFinal[ReceiverParameterDescriptorImpl]

'!' @ [117:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasWriteAccesses' @ [117:37] ==> public fun PsiVariable.hasWriteAccesses(searcher: ReferenceSearcher, scope: PsiElement?): Boolean defined in org.jetbrains.kotlin.j2k in file ReferenceSearcher.kt[SimpleFunctionDescriptorImpl]

'converter' @ [117:54] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'referenceSearcher' @ [117:64] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'getContainingMethod' @ [117:83] ==> public fun PsiElement.getContainingMethod(): PsiMethod? defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'if (hasModifierProperty(PsiModifier.PRIVATE)) !hasWriteAccesses(converter.referenceSearcher, containingClass) else false' @ [118:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'hasModifierProperty' @ [118:32] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiVariable[JavaMethodDescriptor]

'PRIVATE' @ [118:64] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'!' @ [118:74] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasWriteAccesses' @ [118:75] ==> public fun PsiVariable.hasWriteAccesses(searcher: ReferenceSearcher, scope: PsiElement?): Boolean defined in org.jetbrains.kotlin.j2k in file ReferenceSearcher.kt[SimpleFunctionDescriptorImpl]

'converter' @ [118:92] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'referenceSearcher' @ [118:102] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'containingClass' @ [118:121] ==> public final val PsiField.containingClass: PsiClass?[MyPropertyDescriptor]

'HashMap' @ [124:29] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> T

'HashSet' @ [125:44] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'default' @ [127:39] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'default' @ [128:47] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'default' @ [129:68] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'default' @ [130:57] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'default' @ [131:79] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'default' @ [133:78] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'default' @ [134:58] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'cache' @ [137:26] ==> private/*private to this*/ final val cache: HashMap<PsiElement, T> defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'variable' @ [137:32] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableType[ValueParameterDescriptorImpl]

'cached' @ [138:17] ==> val cached: T? defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableType[LocalVariableDescriptor]

'cached' @ [138:40] ==> val cached: T? defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableType[LocalVariableDescriptor]

'withRecursionPrevention' @ [139:25] ==> private/*private to this*/ final fun withRecursionPrevention(element: PsiElement, calculator: () -> T): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'variable' @ [139:49] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableType[ValueParameterDescriptorImpl]

'forVariableTypeNoCache' @ [139:61] ==> private final fun forVariableTypeNoCache(variable: PsiVariable, checkScope: Boolean): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'variable' @ [139:84] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableType[ValueParameterDescriptorImpl]

'checkScope' @ [139:94] ==> value-parameter checkScope: Boolean defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableType[ValueParameterDescriptorImpl]

'cache' @ [140:13] ==> private/*private to this*/ final val cache: HashMap<PsiElement, T> defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'variable' @ [140:19] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableType[ValueParameterDescriptorImpl]

'value' @ [140:31] ==> val value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableType[LocalVariableDescriptor]

'value' @ [141:20] ==> val value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableType[LocalVariableDescriptor]

'variable' @ [145:17] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[ValueParameterDescriptorImpl]

'forEnumConstant' @ [145:53] ==> public open val forEnumConstant: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'variable' @ [147:32] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[ValueParameterDescriptorImpl]

'type' @ [147:41] ==> public final val PsiVariable.type: PsiType[MyPropertyDescriptor]

'fromType' @ [148:25] ==> public open fun fromType(type: PsiType): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'variableType' @ [148:34] ==> val variableType: PsiType defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'value' @ [149:17] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'default' @ [149:26] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [149:42] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'value' @ [151:13] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'fromAnnotations' @ [151:21] ==> public open fun fromAnnotations(owner: PsiModifierListOwner): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'variable' @ [151:37] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[ValueParameterDescriptorImpl]

'value' @ [152:17] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'default' @ [152:26] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [152:42] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'checkScope' @ [154:17] ==> value-parameter checkScope: Boolean defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[ValueParameterDescriptorImpl]

'!' @ [154:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'converter' @ [154:32] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'invoke' @ [154:42] ==> public abstract operator fun invoke(p1: PsiElement): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'variable' @ [154:60] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[ValueParameterDescriptorImpl]

'value' @ [155:24] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'variable' @ [158:17] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[ValueParameterDescriptorImpl]

'variable' @ [159:29] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[ValueParameterDescriptorImpl]

'declarationScope' @ [159:38] ==> public final val PsiParameter.declarationScope: PsiElement[MyPropertyDescriptor]

'scope' @ [160:21] ==> val scope: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'scope' @ [161:38] ==> val scope: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'parameterList' @ [161:44] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [161:58] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'indexOf' @ [161:69] ==> public fun <@OnlyInputTypes T> Array<out (PsiParameter..PsiParameter?)>.indexOf(element: (PsiParameter..PsiParameter?)): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)

'variable' @ [161:77] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[ValueParameterDescriptorImpl]

'assert' @ [162:21] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'paramIndex' @ [162:28] ==> val paramIndex: Int defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'scope' @ [163:43] ==> val scope: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'hierarchicalMethodSignature' @ [163:49] ==> public final val PsiMethod.hierarchicalMethodSignature: HierarchicalMethodSignature[MyPropertyDescriptor]

'superSignatures' @ [163:77] ==> public final val HierarchicalMethodSignature.superSignatures: (MutableList<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>..List<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>)[MyPropertyDescriptor]

'value' @ [164:21] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'superSignatures' @ [164:29] ==> val superSignatures: (MutableList<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>..List<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>) defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'map' @ [164:45] ==> public inline fun <T, R> Iterable<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>.map(transform: ((HierarchicalMethodSignature..HierarchicalMethodSignature?)) -> T): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.HierarchicalMethodSignature..com.intellij.psi.HierarchicalMethodSignature?)
    <R> -> T

'signature' @ [165:38] ==> value-parameter signature: (HierarchicalMethodSignature..HierarchicalMethodSignature?) defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache.<anonymous>[ValueParameterDescriptorImpl]

'method' @ [165:48] ==> public final val HierarchicalMethodSignature.method: PsiMethod[MyPropertyDescriptor]

'parameterList' @ [165:55] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [165:69] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'if (paramIndex < params.size) forVariableType(params[paramIndex], false) else default' @ [166:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T, elseBranch: T): T[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T

'paramIndex' @ [166:29] ==> val paramIndex: Int defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'params' @ [166:42] ==> val params: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>) defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache.<anonymous>[LocalVariableDescriptor]

'size' @ [166:49] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'forVariableType' @ [166:55] ==> public final fun forVariableType(variable: PsiVariable, checkScope: Boolean): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'params' @ [166:71] ==> val params: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>) defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache.<anonymous>[LocalVariableDescriptor]

'paramIndex' @ [166:78] ==> val paramIndex: Int defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'default' @ [166:103] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'firstOrNull' @ [167:23] ==> public inline fun <T> Iterable<T>.firstOrNull(predicate: (T) -> Boolean): T? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'it' @ [167:37] ==> value-parameter it: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache.<anonymous>[ValueParameterDescriptorImpl]

'default' @ [167:43] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'default' @ [167:56] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [168:25] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'default' @ [168:34] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [168:50] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'value' @ [172:13] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'forVariableTypeBeforeUsageSearch' @ [172:21] ==> public open fun forVariableTypeBeforeUsageSearch(variable: PsiVariable): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'variable' @ [172:54] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[ValueParameterDescriptorImpl]

'value' @ [173:17] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'default' @ [173:26] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [173:42] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'value' @ [175:13] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'fromTypeHeuristics' @ [175:21] ==> public open fun fromTypeHeuristics(type: PsiType): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'variableType' @ [175:40] ==> val variableType: PsiType defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'value' @ [176:17] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'default' @ [176:26] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [176:42] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'!' @ [178:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'converter' @ [178:18] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'invoke' @ [178:28] ==> public abstract operator fun invoke(p1: PsiElement): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'variable' @ [178:46] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[ValueParameterDescriptorImpl]

'default' @ [178:64] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'searchScope' @ [180:25] ==> private final fun searchScope(element: PsiElement): PsiElement? defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'variable' @ [180:37] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[ValueParameterDescriptorImpl]

'scope' @ [181:17] ==> val scope: PsiElement? defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'value' @ [182:17] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'converter' @ [182:25] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'referenceSearcher' @ [182:35] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'findVariableUsages' @ [182:53] ==> public fun ReferenceSearcher.findVariableUsages(variable: PsiVariable, scope: PsiElement): Collection<PsiReferenceExpression> defined in org.jetbrains.kotlin.j2k in file ReferenceSearcher.kt[SimpleFunctionDescriptorImpl]

'variable' @ [182:72] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[ValueParameterDescriptorImpl]

'scope' @ [182:82] ==> val scope: PsiElement? defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'map' @ [182:89] ==> public inline fun <T, R> Iterable<PsiReferenceExpression>.map(transform: (PsiReferenceExpression) -> T): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReferenceExpression
    <R> -> T

'fromUsage' @ [182:95] ==> public abstract fun fromUsage(usage: PsiExpression): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'it' @ [182:105] ==> value-parameter it: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [182:111] ==> public inline fun <T> Iterable<T>.firstOrNull(predicate: (T) -> Boolean): T? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'it' @ [182:125] ==> value-parameter it: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache.<anonymous>[ValueParameterDescriptorImpl]

'default' @ [182:131] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'default' @ [182:144] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [183:21] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'default' @ [183:30] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [183:46] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'value' @ [186:13] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'forVariableTypeAfterUsageSearch' @ [186:21] ==> public open fun forVariableTypeAfterUsageSearch(variable: PsiVariable): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'variable' @ [186:53] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[ValueParameterDescriptorImpl]

'value' @ [187:17] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'default' @ [187:26] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [187:42] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forVariableTypeNoCache[LocalVariableDescriptor]

'default' @ [189:20] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'cache' @ [193:26] ==> private/*private to this*/ final val cache: HashMap<PsiElement, T> defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'method' @ [193:32] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnType[ValueParameterDescriptorImpl]

'cached' @ [194:17] ==> val cached: T? defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnType[LocalVariableDescriptor]

'cached' @ [194:40] ==> val cached: T? defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnType[LocalVariableDescriptor]

'withRecursionPrevention' @ [195:25] ==> private/*private to this*/ final fun withRecursionPrevention(element: PsiElement, calculator: () -> T): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'method' @ [195:49] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnType[ValueParameterDescriptorImpl]

'forMethodReturnTypeNoCache' @ [195:59] ==> private final fun forMethodReturnTypeNoCache(method: PsiMethod): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'method' @ [195:86] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnType[ValueParameterDescriptorImpl]

'cache' @ [196:13] ==> private/*private to this*/ final val cache: HashMap<PsiElement, T> defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'method' @ [196:19] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnType[ValueParameterDescriptorImpl]

'value' @ [196:29] ==> val value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnType[LocalVariableDescriptor]

'value' @ [197:20] ==> val value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnType[LocalVariableDescriptor]

'method' @ [203:30] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[ValueParameterDescriptorImpl]

'returnType' @ [203:37] ==> public final val PsiMethod.returnType: PsiType?[MyPropertyDescriptor]

'default' @ [203:58] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'fromType' @ [205:25] ==> public open fun fromType(type: PsiType): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'returnType' @ [205:34] ==> val returnType: PsiType defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'value' @ [206:17] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'default' @ [206:26] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [206:42] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'value' @ [208:13] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'fromAnnotations' @ [208:21] ==> public open fun fromAnnotations(owner: PsiModifierListOwner): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'method' @ [208:37] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[ValueParameterDescriptorImpl]

'value' @ [209:17] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'default' @ [209:26] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [209:42] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'method' @ [211:35] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[ValueParameterDescriptorImpl]

'hierarchicalMethodSignature' @ [211:42] ==> public final val PsiMethod.hierarchicalMethodSignature: HierarchicalMethodSignature[MyPropertyDescriptor]

'superSignatures' @ [211:70] ==> public final val HierarchicalMethodSignature.superSignatures: (MutableList<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>..List<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>)[MyPropertyDescriptor]

'value' @ [212:13] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'superSignatures' @ [212:21] ==> val superSignatures: (MutableList<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>..List<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>) defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'map' @ [212:37] ==> public inline fun <T, R> Iterable<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>.map(transform: ((HierarchicalMethodSignature..HierarchicalMethodSignature?)) -> T): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.HierarchicalMethodSignature..com.intellij.psi.HierarchicalMethodSignature?)
    <R> -> T

'forMethodReturnType' @ [212:43] ==> public final fun forMethodReturnType(method: PsiMethod): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'it' @ [212:63] ==> value-parameter it: (HierarchicalMethodSignature..HierarchicalMethodSignature?) defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache.<anonymous>[ValueParameterDescriptorImpl]

'method' @ [212:66] ==> public final val HierarchicalMethodSignature.method: PsiMethod[MyPropertyDescriptor]

'firstOrNull' @ [212:76] ==> public inline fun <T> Iterable<T>.firstOrNull(predicate: (T) -> Boolean): T? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'it' @ [212:90] ==> value-parameter it: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache.<anonymous>[ValueParameterDescriptorImpl]

'default' @ [212:96] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'default' @ [212:109] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [213:17] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'default' @ [213:26] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [213:42] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'value' @ [215:13] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'fromTypeHeuristics' @ [215:21] ==> public open fun fromTypeHeuristics(type: PsiType): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'returnType' @ [215:40] ==> val returnType: PsiType defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'value' @ [216:17] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'default' @ [216:26] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [216:42] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'value' @ [218:13] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'fromDataFlowForMethod' @ [218:21] ==> public abstract fun fromDataFlowForMethod(method: PsiMethod): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'method' @ [218:43] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[ValueParameterDescriptorImpl]

'value' @ [219:17] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'default' @ [219:26] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [219:42] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'!' @ [221:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'converter' @ [221:18] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'invoke' @ [221:28] ==> public abstract operator fun invoke(p1: PsiElement): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'method' @ [221:46] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[ValueParameterDescriptorImpl]

'default' @ [221:62] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'method' @ [223:24] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[ValueParameterDescriptorImpl]

'body' @ [223:31] ==> public final val PsiMethod.body: PsiCodeBlock?[MyPropertyDescriptor]

'body' @ [224:17] ==> val body: PsiCodeBlock? defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'value' @ [225:17] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'fromMethodBody' @ [225:25] ==> public open fun fromMethodBody(body: PsiCodeBlock): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'body' @ [225:40] ==> val body: PsiCodeBlock? defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'value' @ [226:21] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'default' @ [226:30] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [226:46] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'searchScope' @ [229:25] ==> private final fun searchScope(element: PsiElement): PsiElement? defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'method' @ [229:37] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[ValueParameterDescriptorImpl]

'scope' @ [230:17] ==> val scope: PsiElement? defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'value' @ [231:17] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'converter' @ [231:25] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'referenceSearcher' @ [231:35] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'findMethodCalls' @ [231:53] ==> public fun ReferenceSearcher.findMethodCalls(method: PsiMethod, scope: PsiElement): Collection<PsiMethodCallExpression> defined in org.jetbrains.kotlin.j2k in file ReferenceSearcher.kt[SimpleFunctionDescriptorImpl]

'method' @ [231:69] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[ValueParameterDescriptorImpl]

'scope' @ [231:77] ==> val scope: PsiElement? defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'map' @ [231:84] ==> public inline fun <T, R> Iterable<PsiMethodCallExpression>.map(transform: (PsiMethodCallExpression) -> T): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethodCallExpression
    <R> -> T

'fromUsage' @ [231:90] ==> public abstract fun fromUsage(usage: PsiExpression): T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'it' @ [231:100] ==> value-parameter it: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [231:106] ==> public inline fun <T> Iterable<T>.firstOrNull(predicate: (T) -> Boolean): T? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'it' @ [231:120] ==> value-parameter it: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache.<anonymous>[ValueParameterDescriptorImpl]

'default' @ [231:126] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'default' @ [231:139] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [232:21] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'default' @ [232:30] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'value' @ [232:46] ==> var value: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.forMethodReturnTypeNoCache[LocalVariableDescriptor]

'default' @ [235:20] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'element' @ [239:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.withRecursionPrevention[ValueParameterDescriptorImpl]

'typesBeingCalculated' @ [239:28] ==> private final val typesBeingCalculated: HashSet<PsiElement> defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'default' @ [239:57] ==> public final val default: T defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'typesBeingCalculated' @ [240:13] ==> private final val typesBeingCalculated: HashSet<PsiElement> defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'add' @ [240:34] ==> public open fun add(element: PsiElement): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'element' @ [240:38] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.withRecursionPrevention[ValueParameterDescriptorImpl]

'invoke' @ [242:24] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'typesBeingCalculated' @ [245:17] ==> private final val typesBeingCalculated: HashSet<PsiElement> defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[PropertyDescriptorImpl]

'remove' @ [245:38] ==> public open fun remove(element: PsiElement): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'element' @ [245:45] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor.withRecursionPrevention[ValueParameterDescriptorImpl]

'TypeFlavor<Nullability>' @ [250:46] ==> public constructor TypeFlavor<out T>(default: Nullability) defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Nullability

'Default' @ [250:82] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'assert' @ [252:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'reference' @ [252:20] ==> value-parameter reference: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableReference[ValueParameterDescriptorImpl]

'resolve' @ [252:30] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'variable' @ [252:43] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableReference[ValueParameterDescriptorImpl]

'converter' @ [253:32] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'services' @ [253:42] ==> public final val services: JavaToKotlinConverterServices defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'javaDataFlowAnalyzerFacade' @ [253:51] ==> public abstract val javaDataFlowAnalyzerFacade: JavaDataFlowAnalyzerFacade defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverterServices[PropertyDescriptorImpl]

'dataFlowUtil' @ [255:20] ==> val dataFlowUtil: JavaDataFlowAnalyzerFacade defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableReference[LocalVariableDescriptor]

'variableNullability' @ [255:33] ==> public abstract fun variableNullability(variable: PsiVariable, context: PsiElement): Nullability defined in org.jetbrains.kotlin.j2k.JavaDataFlowAnalyzerFacade[SimpleFunctionDescriptorImpl]

'variable' @ [255:53] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableReference[ValueParameterDescriptorImpl]

'reference' @ [255:63] ==> value-parameter reference: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableReference[ValueParameterDescriptorImpl]

'takeIf' @ [255:74] ==> @InlineOnly @SinceKotlin public inline fun <T> Nullability.takeIf(predicate: (Nullability) -> Boolean): Nullability? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Nullability

'it' @ [255:83] ==> value-parameter it: Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableReference.<anonymous>[ValueParameterDescriptorImpl]

'default' @ [255:89] ==> public final val default: Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>[PropertyDescriptorImpl]

'variableNullability' @ [256:20] ==> public final fun variableNullability(variable: PsiVariable): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'variable' @ [256:40] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableReference[ValueParameterDescriptorImpl]

'converter' @ [260:17] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'services' @ [260:27] ==> public final val services: JavaToKotlinConverterServices defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'javaDataFlowAnalyzerFacade' @ [260:36] ==> public abstract val javaDataFlowAnalyzerFacade: JavaDataFlowAnalyzerFacade defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverterServices[PropertyDescriptorImpl]

'methodNullability' @ [260:63] ==> public abstract fun methodNullability(method: PsiMethod): Nullability defined in org.jetbrains.kotlin.j2k.JavaDataFlowAnalyzerFacade[SimpleFunctionDescriptorImpl]

'method' @ [260:81] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.fromDataFlowForMethod[ValueParameterDescriptorImpl]

'NotNull' @ [263:33] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'if (type is PsiPrimitiveType) Nullability.NotNull else Nullability.Default' @ [265:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nullability, elseBranch: Nullability): Nullability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nullability

'type' @ [265:52] ==> value-parameter type: PsiType defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.fromType[ValueParameterDescriptorImpl]

'NotNull' @ [265:90] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Default' @ [265:115] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'getInstance' @ [268:50] ==> public open fun getInstance(p0: (Project..Project?)): (NullableNotNullManager..NullableNotNullManager?) defined in com.intellij.codeInsight.NullableNotNullManager[JavaMethodDescriptor]

'owner' @ [268:62] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.fromAnnotations[ValueParameterDescriptorImpl]

'project' @ [268:68] ==> public final val PsiModifierListOwner.project: Project[MyPropertyDescriptor]

'when {
                manager.isNotNull(owner, false/* we do not check bases because they are checked by callers of this method*/) ->
                    Nullability.NotNull
                manager.isNullable(owner, false) ->
                    Nullability.Nullable
                else ->
                    Nullability.Default
            }' @ [269:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nullability, entry1: Nullability, entry2: Nullability): Nullability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nullability

'manager' @ [270:17] ==> val manager: (NullableNotNullManager..NullableNotNullManager?) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.fromAnnotations[LocalVariableDescriptor]

'isNotNull' @ [270:25] ==> public open fun isNotNull(@NotNull p0: PsiModifierListOwner, p1: Boolean): Boolean defined in com.intellij.codeInsight.NullableNotNullManager[JavaMethodDescriptor]

'owner' @ [270:35] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.fromAnnotations[ValueParameterDescriptorImpl]

'NotNull' @ [271:33] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'manager' @ [272:17] ==> val manager: (NullableNotNullManager..NullableNotNullManager?) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.fromAnnotations[LocalVariableDescriptor]

'isNullable' @ [272:25] ==> public open fun isNullable(@NotNull p0: PsiModifierListOwner, p1: Boolean): Boolean defined in com.intellij.codeInsight.NullableNotNullManager[JavaMethodDescriptor]

'owner' @ [272:36] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.fromAnnotations[ValueParameterDescriptorImpl]

'Nullable' @ [273:33] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Default' @ [275:33] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'variable' @ [280:31] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[ValueParameterDescriptorImpl]

'initializer' @ [280:40] ==> public final val PsiVariable.initializer: PsiExpression?[MyPropertyDescriptor]

'if (initializer != null) {
                val initializerNullability = initializer.nullability()
                if (initializerNullability != Nullability.Default) {
                    if (variable.isEffectivelyFinal()) {
                        return initializerNullability
                    }
                    else if (initializerNullability == Nullability.Nullable) { // if variable is not final then non-nullability of initializer does not mean that variable is non-null
                        return Nullability.Nullable
                    }
                }
            }
            else if (variable is PsiField && !variable.hasWriteAccesses(converter.referenceSearcher, variable.containingClass)) {
                return Nullability.Nullable
            }' @ [281:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'initializer' @ [281:17] ==> val initializer: PsiExpression? defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[LocalVariableDescriptor]

'initializer' @ [282:46] ==> val initializer: PsiExpression? defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[LocalVariableDescriptor]

'nullability' @ [282:58] ==> private final fun PsiExpression.nullability(): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>[SimpleFunctionDescriptorImpl]

'initializerNullability' @ [283:21] ==> val initializerNullability: Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[LocalVariableDescriptor]

'Default' @ [283:59] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'if (variable.isEffectivelyFinal()) {
                        return initializerNullability
                    }
                    else if (initializerNullability == Nullability.Nullable) { // if variable is not final then non-nullability of initializer does not mean that variable is non-null
                        return Nullability.Nullable
                    }' @ [284:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'variable' @ [284:25] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[ValueParameterDescriptorImpl]

'isEffectivelyFinal' @ [284:34] ==> private final fun PsiVariable.isEffectivelyFinal(): Boolean defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'initializerNullability' @ [285:32] ==> val initializerNullability: Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[LocalVariableDescriptor]

'initializerNullability' @ [287:30] ==> val initializerNullability: Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[LocalVariableDescriptor]

'Nullable' @ [287:68] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Nullable' @ [288:44] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'variable' @ [292:22] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[ValueParameterDescriptorImpl]

'!' @ [292:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'variable' @ [292:47] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[ValueParameterDescriptorImpl]

'hasWriteAccesses' @ [292:56] ==> public fun PsiVariable.hasWriteAccesses(searcher: ReferenceSearcher, scope: PsiElement?): Boolean defined in org.jetbrains.kotlin.j2k in file ReferenceSearcher.kt[SimpleFunctionDescriptorImpl]

'converter' @ [292:73] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'referenceSearcher' @ [292:83] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'variable' @ [292:102] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[ValueParameterDescriptorImpl]

'containingClass' @ [292:111] ==> public final val PsiField.containingClass: PsiClass?[MyPropertyDescriptor]

'Nullable' @ [293:36] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'variable' @ [296:17] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[ValueParameterDescriptorImpl]

'isMainMethodParameter' @ [296:26] ==> private final fun PsiVariable.isMainMethodParameter(): Boolean defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'NotNull' @ [297:36] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'variable' @ [300:17] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[ValueParameterDescriptorImpl]

'variable' @ [302:29] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[ValueParameterDescriptorImpl]

'declarationScope' @ [302:38] ==> public final val PsiParameter.declarationScope: PsiElement[MyPropertyDescriptor]

'scope' @ [303:21] ==> val scope: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[LocalVariableDescriptor]

'scope' @ [303:43] ==> val scope: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[LocalVariableDescriptor]

'name' @ [303:49] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'scope' @ [303:69] ==> val scope: PsiElement defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[LocalVariableDescriptor]

'containingClass' @ [303:75] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'qualifiedName' @ [303:92] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'JAVA_LANG_OBJECT' @ [303:109] ==> @NonNls public const final val JAVA_LANG_OBJECT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'Nullable' @ [304:40] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'variable' @ [308:17] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[ValueParameterDescriptorImpl]

'variable' @ [309:24] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [309:33] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiVariable[JavaMethodDescriptor]

'PRIVATE' @ [309:65] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'converter' @ [310:24] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'invoke' @ [310:34] ==> public abstract operator fun invoke(p1: PsiElement): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'variable' @ [310:52] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[ValueParameterDescriptorImpl]

'shouldGenerateDefaultInitializer' @ [311:24] ==> public fun shouldGenerateDefaultInitializer(searcher: ReferenceSearcher, field: PsiField): Boolean defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'converter' @ [311:57] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'referenceSearcher' @ [311:67] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'variable' @ [311:86] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeBeforeUsageSearch[ValueParameterDescriptorImpl]

'Nullable' @ [312:36] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Default' @ [315:32] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'if (type.canonicalText in boxingTypes) Nullability.Nullable else Nullability.Default' @ [319:58] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nullability, elseBranch: Nullability): Nullability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nullability

'type' @ [319:62] ==> value-parameter type: PsiType defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.fromTypeHeuristics[ValueParameterDescriptorImpl]

'canonicalText' @ [319:67] ==> public final val PsiType.canonicalText: String[MyPropertyDescriptor]

'boxingTypes' @ [319:84] ==> private final val boxingTypes: Set<String> defined in org.jetbrains.kotlin.j2k.TypeConverter.Companion[PropertyDescriptorImpl]

'Nullable' @ [319:109] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Default' @ [319:135] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'if (isNullableFromUsage(usage)) Nullability.Nullable else Nullability.Default' @ [322:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nullability, elseBranch: Nullability): Nullability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nullability

'isNullableFromUsage' @ [322:24] ==> private final fun isNullableFromUsage(usage: PsiExpression): Boolean defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>[SimpleFunctionDescriptorImpl]

'usage' @ [322:44] ==> value-parameter usage: PsiExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.fromUsage[ValueParameterDescriptorImpl]

'Nullable' @ [322:64] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Default' @ [322:90] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'usage' @ [326:26] ==> value-parameter usage: PsiExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[ValueParameterDescriptorImpl]

'parent' @ [326:32] ==> public final val PsiExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (parent is PsiAssignmentExpression && parent.operationTokenType == JavaTokenType.EQ && usage == parent.lExpression) {
                return parent.rExpression?.nullability() == Nullability.Nullable
            }
            else if (parent is PsiBinaryExpression) {
                val operationType = parent.operationTokenType
                if (operationType == JavaTokenType.EQEQ || operationType == JavaTokenType.NE) {
                    val otherOperand = if (usage == parent.lOperand) parent.rOperand else parent.lOperand
                    return otherOperand?.isNullLiteral() ?: false
                }
            }
            else if (parent is PsiVariable && usage == parent.initializer && parent.isEffectivelyFinal()) {
                return variableNullability(parent) == Nullability.Nullable
            }' @ [327:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parent' @ [327:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[LocalVariableDescriptor]

'parent' @ [327:54] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[LocalVariableDescriptor]

'operationTokenType' @ [327:61] ==> public final val PsiAssignmentExpression.operationTokenType: IElementType[MyPropertyDescriptor]

'EQ' @ [327:97] ==> public final val EQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'usage' @ [327:103] ==> value-parameter usage: PsiExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[ValueParameterDescriptorImpl]

'parent' @ [327:112] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[LocalVariableDescriptor]

'lExpression' @ [327:119] ==> public final val PsiAssignmentExpression.lExpression: PsiExpression[MyPropertyDescriptor]

'parent' @ [328:24] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[LocalVariableDescriptor]

'rExpression' @ [328:31] ==> public final val PsiAssignmentExpression.rExpression: PsiExpression?[MyPropertyDescriptor]

'nullability' @ [328:44] ==> private final fun PsiExpression.nullability(): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>[SimpleFunctionDescriptorImpl]

'Nullable' @ [328:73] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'if (parent is PsiBinaryExpression) {
                val operationType = parent.operationTokenType
                if (operationType == JavaTokenType.EQEQ || operationType == JavaTokenType.NE) {
                    val otherOperand = if (usage == parent.lOperand) parent.rOperand else parent.lOperand
                    return otherOperand?.isNullLiteral() ?: false
                }
            }
            else if (parent is PsiVariable && usage == parent.initializer && parent.isEffectivelyFinal()) {
                return variableNullability(parent) == Nullability.Nullable
            }' @ [330:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parent' @ [330:22] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[LocalVariableDescriptor]

'parent' @ [331:37] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[LocalVariableDescriptor]

'operationTokenType' @ [331:44] ==> public final val PsiBinaryExpression.operationTokenType: IElementType[MyPropertyDescriptor]

'operationType' @ [332:21] ==> val operationType: IElementType defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[LocalVariableDescriptor]

'EQEQ' @ [332:52] ==> public final val EQEQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'operationType' @ [332:60] ==> val operationType: IElementType defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[LocalVariableDescriptor]

'NE' @ [332:91] ==> public final val NE: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'if (usage == parent.lOperand) parent.rOperand else parent.lOperand' @ [333:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiExpression?, elseBranch: PsiExpression?): PsiExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiExpression?

'usage' @ [333:44] ==> value-parameter usage: PsiExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[ValueParameterDescriptorImpl]

'parent' @ [333:53] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[LocalVariableDescriptor]

'lOperand' @ [333:60] ==> public final val PsiBinaryExpression.lOperand: PsiExpression[MyPropertyDescriptor]

'parent' @ [333:70] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[LocalVariableDescriptor]

'rOperand' @ [333:77] ==> public final val PsiBinaryExpression.rOperand: PsiExpression?[MyPropertyDescriptor]

'parent' @ [333:91] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[LocalVariableDescriptor]

'lOperand' @ [333:98] ==> public final val PsiBinaryExpression.lOperand: PsiExpression[MyPropertyDescriptor]

'otherOperand' @ [334:28] ==> val otherOperand: PsiExpression? defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[LocalVariableDescriptor]

'isNullLiteral' @ [334:42] ==> public fun PsiExpression.isNullLiteral(): Boolean defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'parent' @ [337:22] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[LocalVariableDescriptor]

'usage' @ [337:47] ==> value-parameter usage: PsiExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[ValueParameterDescriptorImpl]

'parent' @ [337:56] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[LocalVariableDescriptor]

'initializer' @ [337:63] ==> public final val PsiVariable.initializer: PsiExpression?[MyPropertyDescriptor]

'parent' @ [337:78] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[LocalVariableDescriptor]

'isEffectivelyFinal' @ [337:85] ==> private final fun PsiVariable.isEffectivelyFinal(): Boolean defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'variableNullability' @ [338:24] ==> public final fun variableNullability(variable: PsiVariable): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'parent' @ [338:44] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.isNullableFromUsage[LocalVariableDescriptor]

'Nullable' @ [338:67] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'variable' @ [344:17] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeAfterUsageSearch[ValueParameterDescriptorImpl]

'variable' @ [345:30] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeAfterUsageSearch[ValueParameterDescriptorImpl]

'declarationScope' @ [345:39] ==> public final val PsiParameter.declarationScope: PsiElement[MyPropertyDescriptor]

'method' @ [346:21] ==> val method: PsiMethod? defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeAfterUsageSearch[LocalVariableDescriptor]

'searchScope' @ [347:33] ==> private final fun searchScope(element: PsiElement): PsiElement? defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'method' @ [347:45] ==> val method: PsiMethod? defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeAfterUsageSearch[LocalVariableDescriptor]

'scope' @ [348:25] ==> val scope: PsiElement? defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeAfterUsageSearch[LocalVariableDescriptor]

'method' @ [349:42] ==> val method: PsiMethod? defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeAfterUsageSearch[LocalVariableDescriptor]

'parameterList' @ [349:49] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [349:63] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'parameters' @ [350:46] ==> val parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeAfterUsageSearch[LocalVariableDescriptor]

'indexOf' @ [350:57] ==> public fun <@OnlyInputTypes T> Array<out (PsiParameter..PsiParameter?)>.indexOf(element: (PsiParameter..PsiParameter?)): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)

'variable' @ [350:65] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeAfterUsageSearch[ValueParameterDescriptorImpl]

'converter' @ [351:38] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'referenceSearcher' @ [351:48] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'findMethodCalls' @ [351:66] ==> public fun ReferenceSearcher.findMethodCalls(method: PsiMethod, scope: PsiElement): Collection<PsiMethodCallExpression> defined in org.jetbrains.kotlin.j2k in file ReferenceSearcher.kt[SimpleFunctionDescriptorImpl]

'method' @ [351:82] ==> val method: PsiMethod? defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeAfterUsageSearch[LocalVariableDescriptor]

'scope' @ [351:90] ==> val scope: PsiElement? defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeAfterUsageSearch[LocalVariableDescriptor]

'call' @ [352:40] ==> val call: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeAfterUsageSearch[LocalVariableDescriptor]

'argumentList' @ [352:45] ==> public final val PsiMethodCallExpression.argumentList: PsiExpressionList[MyPropertyDescriptor]

'expressions' @ [352:58] ==> public final val PsiExpressionList.expressions: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>)[MyPropertyDescriptor]

'args' @ [353:33] ==> val args: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeAfterUsageSearch[LocalVariableDescriptor]

'size' @ [353:38] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'parameters' @ [353:46] ==> val parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeAfterUsageSearch[LocalVariableDescriptor]

'size' @ [353:57] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'args' @ [354:37] ==> val args: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>) defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeAfterUsageSearch[LocalVariableDescriptor]

'parameterIndex' @ [354:42] ==> val parameterIndex: Int defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.forVariableTypeAfterUsageSearch[LocalVariableDescriptor]

'nullability' @ [354:58] ==> private final fun PsiExpression.nullability(): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>[SimpleFunctionDescriptorImpl]

'Nullable' @ [354:87] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Nullable' @ [355:56] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Default' @ [362:32] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'body' @ [367:13] ==> value-parameter body: PsiCodeBlock defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.fromMethodBody[ValueParameterDescriptorImpl]

'accept' @ [367:18] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiCodeBlock[JavaMethodDescriptor]

'JavaRecursiveElementVisitor' @ [367:33] ==> public constructor JavaRecursiveElementVisitor() defined in com.intellij.psi.JavaRecursiveElementVisitor[JavaClassConstructorDescriptor]

'statement' @ [369:25] ==> value-parameter statement: PsiReturnStatement defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.fromMethodBody.<no name provided>.visitReturnStatement[ValueParameterDescriptorImpl]

'returnValue' @ [369:35] ==> public final val PsiReturnStatement.returnValue: PsiExpression?[MyPropertyDescriptor]

'nullability' @ [369:48] ==> private final fun PsiExpression.nullability(): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>[SimpleFunctionDescriptorImpl]

'Nullable' @ [369:77] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'isNullable' @ [370:25] ==> var isNullable: Boolean defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.fromMethodBody[LocalVariableDescriptor]

'if (isNullable) Nullability.Nullable else Nullability.Default' @ [378:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nullability, elseBranch: Nullability): Nullability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nullability

'isNullable' @ [378:24] ==> var isNullable: Boolean defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.fromMethodBody[LocalVariableDescriptor]

'Nullable' @ [378:48] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Default' @ [378:74] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'when (this) {
                is PsiLiteralExpression -> if (type != PsiType.NULL) Nullability.NotNull else Nullability.Nullable

                is PsiNewExpression -> Nullability.NotNull

                is PsiConditionalExpression -> {
                    val nullability1 = thenExpression?.nullability()
                    if (nullability1 == Nullability.Nullable) return Nullability.Nullable
                    val nullability2 = elseExpression?.nullability()
                    if (nullability2 == Nullability.Nullable) return Nullability.Nullable
                    if (nullability1 == Nullability.NotNull && nullability2 == Nullability.NotNull) return Nullability.NotNull
                    Nullability.Default
                }

                is PsiParenthesizedExpression -> expression?.nullability() ?: Nullability.Default

                is PsiCallExpression -> resolveMethod()?.let { methodNullability(it) } ?: Nullability.Default

                is PsiReferenceExpression -> (resolve() as? PsiVariable)?.let { variableReferenceNullability(it, this) } ?: Nullability.Default
            //TODO: some other cases

                else -> Nullability.Default
            }' @ [382:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nullability, entry1: Nullability, entry2: Nullability, entry3: Nullability, entry4: Nullability, entry5: Nullability, entry6: Nullability): Nullability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nullability

'this' @ [382:26] ==> <this> defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.nullability[ReceiverParameterDescriptorImpl]

'if (type != PsiType.NULL) Nullability.NotNull else Nullability.Nullable' @ [383:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nullability, elseBranch: Nullability): Nullability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nullability

'type' @ [383:48] ==> public final val PsiLiteralExpression.type: PsiType?[MyPropertyDescriptor]

'NULL' @ [383:64] ==> public final val NULL: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'NotNull' @ [383:82] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Nullable' @ [383:107] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'NotNull' @ [385:52] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'thenExpression' @ [388:40] ==> public final val PsiConditionalExpression.thenExpression: PsiExpression?[MyPropertyDescriptor]

'nullability' @ [388:56] ==> private final fun PsiExpression.nullability(): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>[SimpleFunctionDescriptorImpl]

'nullability1' @ [389:25] ==> val nullability1: Nullability? defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.nullability[LocalVariableDescriptor]

'Nullable' @ [389:53] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Nullable' @ [389:82] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'elseExpression' @ [390:40] ==> public final val PsiConditionalExpression.elseExpression: PsiExpression?[MyPropertyDescriptor]

'nullability' @ [390:56] ==> private final fun PsiExpression.nullability(): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>[SimpleFunctionDescriptorImpl]

'nullability2' @ [391:25] ==> val nullability2: Nullability? defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.nullability[LocalVariableDescriptor]

'Nullable' @ [391:53] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Nullable' @ [391:82] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'nullability1' @ [392:25] ==> val nullability1: Nullability? defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.nullability[LocalVariableDescriptor]

'NotNull' @ [392:53] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'nullability2' @ [392:64] ==> val nullability2: Nullability? defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.nullability[LocalVariableDescriptor]

'NotNull' @ [392:92] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'NotNull' @ [392:120] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Default' @ [393:33] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'expression' @ [396:50] ==> public final val PsiParenthesizedExpression.expression: PsiExpression?[MyPropertyDescriptor]

'nullability' @ [396:62] ==> private final fun PsiExpression.nullability(): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>[SimpleFunctionDescriptorImpl]

'Default' @ [396:91] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'resolveMethod' @ [398:41] ==> @Nullable public abstract fun resolveMethod(): PsiMethod? defined in com.intellij.psi.PsiCallExpression[JavaMethodDescriptor]

'let' @ [398:58] ==> @InlineOnly public inline fun <T, R> PsiMethod.let(block: (PsiMethod) -> Nullability): Nullability defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> Nullability

'methodNullability' @ [398:64] ==> public final fun methodNullability(method: PsiMethod): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'it' @ [398:82] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.nullability.<anonymous>[ValueParameterDescriptorImpl]

'Default' @ [398:103] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'?:' @ [400:46] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Nullability?, right: Nullability): Nullability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Nullability

'resolve' @ [400:47] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'let' @ [400:75] ==> @InlineOnly public inline fun <T, R> PsiVariable.let(block: (PsiVariable) -> Nullability): Nullability defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiVariable
    <R> -> Nullability

'variableReferenceNullability' @ [400:81] ==> public final fun variableReferenceNullability(variable: PsiVariable, reference: PsiReferenceExpression): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'it' @ [400:110] ==> value-parameter it: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.nullability.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [400:114] ==> <this> defined in org.jetbrains.kotlin.j2k.TypeConverter.nullabilityFlavor.<no name provided>.nullability[ReceiverParameterDescriptorImpl]

'Default' @ [400:137] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Default' @ [403:37] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'TypeFlavor<Mutability>' @ [408:45] ==> public constructor TypeFlavor<out T>(default: Mutability) defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Mutability

'Default' @ [408:79] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'Default' @ [409:88] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'NonMutable' @ [411:69] ==> enum entry NonMutable defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'?:' @ [414:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiClass?, right: PsiClass): PsiClass[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiClass

'type' @ [414:27] ==> value-parameter type: PsiType defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.fromType[ValueParameterDescriptorImpl]

'resolve' @ [414:51] ==> @Nullable public abstract fun resolve(): PsiClass? defined in com.intellij.psi.PsiClassType[JavaMethodDescriptor]

'NonMutable' @ [414:82] ==> enum entry NonMutable defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'target' @ [415:17] ==> val target: PsiClass defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.fromType[LocalVariableDescriptor]

'qualifiedName' @ [415:24] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'toKotlinMutableTypesMap' @ [415:42] ==> public val toKotlinMutableTypesMap: Map<String, String> defined in org.jetbrains.kotlin.j2k in file Utils.kt[PropertyDescriptorImpl]

'keys' @ [415:66] ==> public abstract val keys: Set<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'NonMutable' @ [415:90] ==> enum entry NonMutable defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'Default' @ [416:31] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'owner' @ [420:17] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.fromAnnotations[ValueParameterDescriptorImpl]

'owner' @ [421:38] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.fromAnnotations[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [421:44] ==> public abstract val kotlinOrigin: KtElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightElement[DeserializedPropertyDescriptor]

'Default' @ [421:104] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'converter' @ [422:34] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.TypeConverter[PropertyDescriptorImpl]

'services' @ [422:44] ==> public final val services: JavaToKotlinConverterServices defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'resolverForConverter' @ [422:53] ==> public abstract val resolverForConverter: ResolverForConverter defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverterServices[PropertyDescriptorImpl]

'resolveToDescriptor' @ [422:74] ==> public abstract fun resolveToDescriptor(declaration: KtDeclaration): DeclarationDescriptor? defined in org.jetbrains.kotlin.j2k.ResolverForConverter[SimpleFunctionDescriptorImpl]

'jetDeclaration' @ [422:94] ==> val jetDeclaration: KtCallableDeclaration defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.fromAnnotations[LocalVariableDescriptor]

'Default' @ [422:154] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'descriptor' @ [423:28] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.fromAnnotations[LocalVariableDescriptor]

'returnType' @ [423:39] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'Default' @ [423:71] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'?:' @ [424:39] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassDescriptor?, right: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassDescriptor

'getClassDescriptor' @ [424:49] ==> @Nullable public open fun getClassDescriptor(@NotNull p0: KotlinType): ClassDescriptor? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type' @ [424:68] ==> val type: KotlinType defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.fromAnnotations[LocalVariableDescriptor]

'Default' @ [424:95] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'if (DescriptorUtils.getFqName(classDescriptor).asString() in mutableKotlinClasses)
                    Mutability.Mutable
                else
                    Mutability.NonMutable' @ [425:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Mutability, elseBranch: Mutability): Mutability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Mutability

'in' @ [425:28] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'getFqName' @ [425:44] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [425:54] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.fromAnnotations[LocalVariableDescriptor]

'asString' @ [425:71] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'mutableKotlinClasses' @ [425:85] ==> private final val mutableKotlinClasses: Set<String> defined in org.jetbrains.kotlin.j2k.TypeConverter.Companion[PropertyDescriptorImpl]

'Mutable' @ [426:32] ==> enum entry Mutable defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'NonMutable' @ [428:32] ==> enum entry NonMutable defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'super' @ [432:20] ==> <this> defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>[LazyClassReceiverParameterDescriptor]

'fromAnnotations' @ [432:26] ==> public open fun fromAnnotations(owner: PsiModifierListOwner): Mutability defined in org.jetbrains.kotlin.j2k.TypeConverter.TypeFlavor[SimpleFunctionDescriptorImpl]

'owner' @ [432:42] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.fromAnnotations[ValueParameterDescriptorImpl]

'if (isMutableFromUsage(usage)) Mutability.Mutable else Mutability.Default' @ [436:19] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Mutability, elseBranch: Mutability): Mutability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Mutability

'isMutableFromUsage' @ [436:23] ==> private final fun isMutableFromUsage(usage: PsiExpression): Boolean defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>[SimpleFunctionDescriptorImpl]

'usage' @ [436:42] ==> value-parameter usage: PsiExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.fromUsage[ValueParameterDescriptorImpl]

'Mutable' @ [436:61] ==> enum entry Mutable defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'Default' @ [436:85] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'usage' @ [439:26] ==> value-parameter usage: PsiExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[ValueParameterDescriptorImpl]

'parent' @ [439:32] ==> public final val PsiExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (parent is PsiReferenceExpression && usage == parent.qualifierExpression && parent.parent is PsiMethodCallExpression) {
                return modificationMethodNames.contains(parent.referenceName as Any?)
            }
            else if (parent is PsiExpressionList) {
                val call = parent.parent as? PsiCall ?: return false
                val method = call.resolveMethod() ?: return false
                val paramIndex = parent.expressions.indexOf(usage)
                val parameterList = method.parameterList
                if (paramIndex >= parameterList.parametersCount) return false
                return variableMutability(parameterList.parameters[paramIndex]) == Mutability.Mutable
            }
            else if (parent is PsiVariable && usage == parent.initializer) {
                return variableMutability(parent) == Mutability.Mutable
            }
            else if (parent is PsiAssignmentExpression && parent.operationTokenType == JavaTokenType.EQ && usage == parent.rExpression) {
                val leftSideVar = (parent.lExpression as? PsiReferenceExpression)?.resolve() as? PsiVariable ?: return false
                return variableMutability(leftSideVar) == Mutability.Mutable
            }' @ [440:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parent' @ [440:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'usage' @ [440:53] ==> value-parameter usage: PsiExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[ValueParameterDescriptorImpl]

'parent' @ [440:62] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'qualifierExpression' @ [440:69] ==> public final var PsiReferenceExpression.qualifierExpression: PsiExpression?[MyPropertyDescriptor]

'parent' @ [440:92] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'parent' @ [440:99] ==> public final val PsiReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'modificationMethodNames' @ [441:24] ==> private final val modificationMethodNames: Set<String> defined in org.jetbrains.kotlin.j2k.TypeConverter.Companion[PropertyDescriptorImpl]

'contains' @ [441:48] ==> public operator fun <@OnlyInputTypes T> Iterable<Any?>.contains(element: Any?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Any?

'parent' @ [441:57] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'referenceName' @ [441:64] ==> public final val PsiReferenceExpression.referenceName: String?[MyPropertyDescriptor]

'if (parent is PsiExpressionList) {
                val call = parent.parent as? PsiCall ?: return false
                val method = call.resolveMethod() ?: return false
                val paramIndex = parent.expressions.indexOf(usage)
                val parameterList = method.parameterList
                if (paramIndex >= parameterList.parametersCount) return false
                return variableMutability(parameterList.parameters[paramIndex]) == Mutability.Mutable
            }
            else if (parent is PsiVariable && usage == parent.initializer) {
                return variableMutability(parent) == Mutability.Mutable
            }
            else if (parent is PsiAssignmentExpression && parent.operationTokenType == JavaTokenType.EQ && usage == parent.rExpression) {
                val leftSideVar = (parent.lExpression as? PsiReferenceExpression)?.resolve() as? PsiVariable ?: return false
                return variableMutability(leftSideVar) == Mutability.Mutable
            }' @ [443:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parent' @ [443:22] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'parent' @ [444:28] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'parent' @ [444:35] ==> public final val PsiExpressionList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'call' @ [445:30] ==> val call: PsiCall defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'resolveMethod' @ [445:35] ==> @Nullable public abstract fun resolveMethod(): PsiMethod? defined in com.intellij.psi.PsiCall[JavaMethodDescriptor]

'parent' @ [446:34] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'expressions' @ [446:41] ==> public final val PsiExpressionList.expressions: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>)[MyPropertyDescriptor]

'indexOf' @ [446:53] ==> public fun <@OnlyInputTypes T> Array<out (PsiExpression..PsiExpression?)>.indexOf(element: (PsiExpression..PsiExpression?)): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (com.intellij.psi.PsiExpression..com.intellij.psi.PsiExpression?)

'usage' @ [446:61] ==> value-parameter usage: PsiExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[ValueParameterDescriptorImpl]

'method' @ [447:37] ==> val method: PsiMethod defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'parameterList' @ [447:44] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'paramIndex' @ [448:21] ==> val paramIndex: Int defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'parameterList' @ [448:35] ==> val parameterList: PsiParameterList defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'parametersCount' @ [448:49] ==> public final val PsiParameterList.parametersCount: Int[MyPropertyDescriptor]

'variableMutability' @ [449:24] ==> public final fun variableMutability(variable: PsiVariable): Mutability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'parameterList' @ [449:43] ==> val parameterList: PsiParameterList defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'parameters' @ [449:57] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'paramIndex' @ [449:68] ==> val paramIndex: Int defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'Mutable' @ [449:95] ==> enum entry Mutable defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'if (parent is PsiVariable && usage == parent.initializer) {
                return variableMutability(parent) == Mutability.Mutable
            }
            else if (parent is PsiAssignmentExpression && parent.operationTokenType == JavaTokenType.EQ && usage == parent.rExpression) {
                val leftSideVar = (parent.lExpression as? PsiReferenceExpression)?.resolve() as? PsiVariable ?: return false
                return variableMutability(leftSideVar) == Mutability.Mutable
            }' @ [451:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parent' @ [451:22] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'usage' @ [451:47] ==> value-parameter usage: PsiExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[ValueParameterDescriptorImpl]

'parent' @ [451:56] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'initializer' @ [451:63] ==> public final val PsiVariable.initializer: PsiExpression?[MyPropertyDescriptor]

'variableMutability' @ [452:24] ==> public final fun variableMutability(variable: PsiVariable): Mutability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'parent' @ [452:43] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'Mutable' @ [452:65] ==> enum entry Mutable defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'parent' @ [454:22] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'parent' @ [454:59] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'operationTokenType' @ [454:66] ==> public final val PsiAssignmentExpression.operationTokenType: IElementType[MyPropertyDescriptor]

'EQ' @ [454:102] ==> public final val EQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'usage' @ [454:108] ==> value-parameter usage: PsiExpression defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[ValueParameterDescriptorImpl]

'parent' @ [454:117] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'rExpression' @ [454:124] ==> public final val PsiAssignmentExpression.rExpression: PsiExpression?[MyPropertyDescriptor]

'?:' @ [455:35] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiVariable?, right: PsiVariable): PsiVariable[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiVariable

'parent' @ [455:36] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'lExpression' @ [455:43] ==> public final val PsiAssignmentExpression.lExpression: PsiExpression[MyPropertyDescriptor]

'resolve' @ [455:84] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'variableMutability' @ [456:24] ==> public final fun variableMutability(variable: PsiVariable): Mutability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'leftSideVar' @ [456:43] ==> val leftSideVar: PsiVariable defined in org.jetbrains.kotlin.j2k.TypeConverter.mutabilityFlavor.<no name provided>.isMutableFromUsage[LocalVariableDescriptor]

'Mutable' @ [456:70] ==> enum entry Mutable defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'setOf' @ [463:48] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'JAVA_LANG_BYTE' @ [464:34] ==> @NonNls public const final val JAVA_LANG_BYTE: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'JAVA_LANG_CHARACTER' @ [465:34] ==> @NonNls public const final val JAVA_LANG_CHARACTER: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'JAVA_LANG_DOUBLE' @ [466:34] ==> @NonNls public const final val JAVA_LANG_DOUBLE: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'JAVA_LANG_FLOAT' @ [467:34] ==> @NonNls public const final val JAVA_LANG_FLOAT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'JAVA_LANG_INTEGER' @ [468:34] ==> @NonNls public const final val JAVA_LANG_INTEGER: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'JAVA_LANG_LONG' @ [469:34] ==> @NonNls public const final val JAVA_LANG_LONG: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'JAVA_LANG_SHORT' @ [470:34] ==> @NonNls public const final val JAVA_LANG_SHORT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'JAVA_LANG_BOOLEAN' @ [471:34] ==> @NonNls public const final val JAVA_LANG_BOOLEAN: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'setOf' @ [474:47] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'toKotlinMutableTypesMap' @ [478:44] ==> public val toKotlinMutableTypesMap: Map<String, String> defined in org.jetbrains.kotlin.j2k in file Utils.kt[PropertyDescriptorImpl]

'values' @ [478:68] ==> public abstract val values: Collection<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'toSet' @ [478:75] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

