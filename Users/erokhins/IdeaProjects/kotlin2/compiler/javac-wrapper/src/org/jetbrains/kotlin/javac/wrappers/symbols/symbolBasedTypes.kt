'when {
            t.kind.isPrimitive || t.kind == TypeKind.VOID -> SymbolBasedPrimitiveType(t, javac)
            t.kind == TypeKind.DECLARED || t.kind == TypeKind.TYPEVAR -> SymbolBasedClassifierType(t, javac)
            t.kind == TypeKind.WILDCARD -> SymbolBasedWildcardType(t as WildcardType, javac)
            t.kind == TypeKind.ARRAY -> SymbolBasedArrayType(t as ArrayType, javac)
            else -> throw UnsupportedOperationException("Unsupported type: $t")
        }' @ [35:66] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SymbolBasedType<TypeMirror>, entry1: SymbolBasedType<TypeMirror>, entry2: SymbolBasedType<TypeMirror>, entry3: SymbolBasedType<TypeMirror>, entry4: SymbolBasedType<TypeMirror>): SymbolBasedType<TypeMirror>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SymbolBasedType<TypeMirror>

't' @ [36:13] ==> value-parameter t: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion.create[ValueParameterDescriptorImpl]

'kind' @ [36:15] ==> public final val TypeMirror.kind: (TypeKind..TypeKind?)[MyPropertyDescriptor]

'isPrimitive' @ [36:20] ==> public final val TypeKind.isPrimitive: Boolean[MyPropertyDescriptor]

't' @ [36:35] ==> value-parameter t: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion.create[ValueParameterDescriptorImpl]

'kind' @ [36:37] ==> public final val TypeMirror.kind: (TypeKind..TypeKind?)[MyPropertyDescriptor]

'VOID' @ [36:54] ==> enum entry VOID defined in javax.lang.model.type.TypeKind[FakeCallableDescriptorForObject]

'SymbolBasedPrimitiveType' @ [36:62] ==> public constructor SymbolBasedPrimitiveType(typeMirror: TypeMirror, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPrimitiveType[ClassConstructorDescriptorImpl]

't' @ [36:87] ==> value-parameter t: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion.create[ValueParameterDescriptorImpl]

'javac' @ [36:90] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion.create[ValueParameterDescriptorImpl]

't' @ [37:13] ==> value-parameter t: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion.create[ValueParameterDescriptorImpl]

'kind' @ [37:15] ==> public final val TypeMirror.kind: (TypeKind..TypeKind?)[MyPropertyDescriptor]

'DECLARED' @ [37:32] ==> enum entry DECLARED defined in javax.lang.model.type.TypeKind[FakeCallableDescriptorForObject]

't' @ [37:44] ==> value-parameter t: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion.create[ValueParameterDescriptorImpl]

'kind' @ [37:46] ==> public final val TypeMirror.kind: (TypeKind..TypeKind?)[MyPropertyDescriptor]

'TYPEVAR' @ [37:63] ==> enum entry TYPEVAR defined in javax.lang.model.type.TypeKind[FakeCallableDescriptorForObject]

'SymbolBasedClassifierType' @ [37:74] ==> public constructor SymbolBasedClassifierType<out T : TypeMirror>(typeMirror: T, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : TypeMirror> -> T

't' @ [37:100] ==> value-parameter t: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion.create[ValueParameterDescriptorImpl]

'javac' @ [37:103] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion.create[ValueParameterDescriptorImpl]

't' @ [38:13] ==> value-parameter t: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion.create[ValueParameterDescriptorImpl]

'kind' @ [38:15] ==> public final val TypeMirror.kind: (TypeKind..TypeKind?)[MyPropertyDescriptor]

'WILDCARD' @ [38:32] ==> enum entry WILDCARD defined in javax.lang.model.type.TypeKind[FakeCallableDescriptorForObject]

'SymbolBasedWildcardType' @ [38:44] ==> public constructor SymbolBasedWildcardType(typeMirror: WildcardType, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedWildcardType[ClassConstructorDescriptorImpl]

't' @ [38:68] ==> value-parameter t: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion.create[ValueParameterDescriptorImpl]

'javac' @ [38:87] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion.create[ValueParameterDescriptorImpl]

't' @ [39:13] ==> value-parameter t: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion.create[ValueParameterDescriptorImpl]

'kind' @ [39:15] ==> public final val TypeMirror.kind: (TypeKind..TypeKind?)[MyPropertyDescriptor]

'ARRAY' @ [39:32] ==> enum entry ARRAY defined in javax.lang.model.type.TypeKind[FakeCallableDescriptorForObject]

'SymbolBasedArrayType' @ [39:41] ==> public constructor SymbolBasedArrayType(typeMirror: ArrayType, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedArrayType[ClassConstructorDescriptorImpl]

't' @ [39:62] ==> value-parameter t: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion.create[ValueParameterDescriptorImpl]

'javac' @ [39:78] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion.create[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [40:27] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

't' @ [40:77] ==> value-parameter t: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion.create[ValueParameterDescriptorImpl]

'typeMirror' @ [45:17] ==> public final val typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[PropertyDescriptorImpl]

'annotationMirrors' @ [45:28] ==> public final val TypeMirror.annotationMirrors: (MutableList<out (AnnotationMirror..AnnotationMirror?)>..List<(AnnotationMirror..AnnotationMirror?)>?)[MyPropertyDescriptor]

'map' @ [45:46] ==> public inline fun <T, R> Iterable<(AnnotationMirror..AnnotationMirror?)>.map(transform: ((AnnotationMirror..AnnotationMirror?)) -> SymbolBasedAnnotation): List<SymbolBasedAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.AnnotationMirror..javax.lang.model.element.AnnotationMirror?)
    <R> -> SymbolBasedAnnotation

'SymbolBasedAnnotation' @ [45:52] ==> public constructor SymbolBasedAnnotation(annotationMirror: AnnotationMirror, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotation[ClassConstructorDescriptorImpl]

'it' @ [45:74] ==> value-parameter it: (AnnotationMirror..AnnotationMirror?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.<get-annotations>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [45:78] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[PropertyDescriptorImpl]

'javac' @ [48:17] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[PropertyDescriptorImpl]

'isDeprecated' @ [48:23] ==> public final fun isDeprecated(typeMirror: TypeMirror): Boolean defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'typeMirror' @ [48:36] ==> public final val typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[PropertyDescriptorImpl]

'typeMirror' @ [50:51] ==> public final val typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[PropertyDescriptorImpl]

'findAnnotation' @ [50:62] ==> internal fun AnnotatedConstruct.findAnnotation(fqName: FqName, javac: JavacWrapper): SymbolBasedAnnotation? defined in org.jetbrains.kotlin.javac.wrappers.symbols[SimpleFunctionDescriptorImpl]

'fqName' @ [50:77] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.findAnnotation[ValueParameterDescriptorImpl]

'javac' @ [50:85] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[PropertyDescriptorImpl]

'==' @ [52:40] ==> public open fun equals(other: Any?): Boolean defined in javax.lang.model.type.TypeMirror[DeserializedSimpleFunctionDescriptor]

'other' @ [52:41] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.equals[ValueParameterDescriptorImpl]

'typeMirror' @ [52:72] ==> public final val typeMirror: TypeMirror defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[PropertyDescriptorImpl]

'typeMirror' @ [52:86] ==> public final val typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[PropertyDescriptorImpl]

'typeMirror' @ [54:31] ==> public final val typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[PropertyDescriptorImpl]

'hashCode' @ [54:42] ==> public open fun hashCode(): Int defined in javax.lang.model.type.TypeMirror[DeserializedSimpleFunctionDescriptor]

'typeMirror' @ [56:31] ==> public final val typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[PropertyDescriptorImpl]

'toString' @ [56:42] ==> public open fun toString(): String defined in javax.lang.model.type.TypeMirror[DeserializedSimpleFunctionDescriptor]

'SymbolBasedType<TypeMirror>' @ [63:5] ==> private constructor SymbolBasedType<out T : TypeMirror>(typeMirror: TypeMirror, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : TypeMirror> -> TypeMirror

'typeMirror' @ [63:33] ==> value-parameter typeMirror: TypeMirror defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPrimitiveType.<init>[ValueParameterDescriptorImpl]

'javac' @ [63:45] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPrimitiveType.<init>[ValueParameterDescriptorImpl]

'if (typeMirror.kind == TypeKind.VOID) null else JvmPrimitiveType.get(typeMirror.toString()).primitiveType' @ [66:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PrimitiveType?, elseBranch: PrimitiveType?): PrimitiveType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PrimitiveType?

'typeMirror' @ [66:21] ==> public final val typeMirror: TypeMirror defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPrimitiveType[PropertyDescriptorImpl]

'kind' @ [66:32] ==> public final val TypeMirror.kind: (TypeKind..TypeKind?)[MyPropertyDescriptor]

'VOID' @ [66:49] ==> enum entry VOID defined in javax.lang.model.type.TypeKind[FakeCallableDescriptorForObject]

'get' @ [66:82] ==> @NotNull public open fun get(@NotNull p0: String): JvmPrimitiveType defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[JavaMethodDescriptor]

'typeMirror' @ [66:86] ==> public final val typeMirror: TypeMirror defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPrimitiveType[PropertyDescriptorImpl]

'toString' @ [66:97] ==> public open fun toString(): String defined in javax.lang.model.type.TypeMirror[DeserializedSimpleFunctionDescriptor]

'primitiveType' @ [66:109] ==> public final val JvmPrimitiveType.primitiveType: PrimitiveType[MyPropertyDescriptor]

'SymbolBasedType<T>' @ [73:5] ==> private constructor SymbolBasedType<out T : TypeMirror>(typeMirror: T, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : TypeMirror> -> T

'typeMirror' @ [73:24] ==> value-parameter typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType.<init>[ValueParameterDescriptorImpl]

'javac' @ [73:36] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType.<init>[ValueParameterDescriptorImpl]

'when (typeMirror.kind) {
            TypeKind.DECLARED -> ((typeMirror as DeclaredType).asElement() as Symbol.ClassSymbol).let { symbol ->
                SymbolBasedClass(symbol, javac, symbol.classfile)
            }
            TypeKind.TYPEVAR -> SymbolBasedTypeParameter((typeMirror as TypeVariable).asElement() as TypeParameterElement, javac)
            else -> null
        }' @ [76:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JavaClassifier?, entry1: JavaClassifier?, entry2: JavaClassifier?): JavaClassifier?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JavaClassifier?

'typeMirror' @ [76:23] ==> public final val typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[PropertyDescriptorImpl]

'kind' @ [76:34] ==> public final val TypeMirror.kind: (TypeKind..TypeKind?)[MyPropertyDescriptor]

'DECLARED' @ [77:22] ==> enum entry DECLARED defined in javax.lang.model.type.TypeKind[FakeCallableDescriptorForObject]

'typeMirror' @ [77:36] ==> public final val typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[PropertyDescriptorImpl]

'asElement' @ [77:64] ==> public abstract fun asElement(): (Element..Element?) defined in javax.lang.model.type.DeclaredType[JavaMethodDescriptor]

'let' @ [77:99] ==> @InlineOnly public inline fun <T, R> Symbol.ClassSymbol.let(block: (Symbol.ClassSymbol) -> SymbolBasedClass): SymbolBasedClass defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassSymbol
    <R> -> SymbolBasedClass

'SymbolBasedClass' @ [78:17] ==> public constructor SymbolBasedClass(element: TypeElement, javac: JavacWrapper, file: JavaFileObject?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[ClassConstructorDescriptorImpl]

'symbol' @ [78:34] ==> value-parameter symbol: Symbol.ClassSymbol defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType.<get-classifier>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [78:42] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[PropertyDescriptorImpl]

'symbol' @ [78:49] ==> value-parameter symbol: Symbol.ClassSymbol defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType.<get-classifier>.<anonymous>[ValueParameterDescriptorImpl]

'classfile' @ [78:56] ==> public final var classfile: (JavaFileObject..JavaFileObject?) defined in com.sun.tools.javac.code.Symbol.ClassSymbol[JavaPropertyDescriptor]

'TYPEVAR' @ [80:22] ==> enum entry TYPEVAR defined in javax.lang.model.type.TypeKind[FakeCallableDescriptorForObject]

'SymbolBasedTypeParameter' @ [80:33] ==> public constructor SymbolBasedTypeParameter(element: TypeParameterElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedTypeParameter[ClassConstructorDescriptorImpl]

'typeMirror' @ [80:59] ==> public final val typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[PropertyDescriptorImpl]

'asElement' @ [80:87] ==> public abstract fun asElement(): (Element..Element?) defined in javax.lang.model.type.TypeVariable[JavaMethodDescriptor]

'javac' @ [80:124] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[PropertyDescriptorImpl]

'if (typeMirror.kind == TypeKind.DECLARED) {
                    (typeMirror as DeclaredType).typeArguments.map { create(it, javac) }
                }
                else {
                    emptyList()
                }' @ [85:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<JavaType>, elseBranch: List<JavaType>): List<JavaType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<JavaType>

'typeMirror' @ [85:21] ==> public final val typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[PropertyDescriptorImpl]

'kind' @ [85:32] ==> public final val TypeMirror.kind: (TypeKind..TypeKind?)[MyPropertyDescriptor]

'DECLARED' @ [85:49] ==> enum entry DECLARED defined in javax.lang.model.type.TypeKind[FakeCallableDescriptorForObject]

'typeMirror' @ [86:22] ==> public final val typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[PropertyDescriptorImpl]

'typeArguments' @ [86:50] ==> public final val DeclaredType.typeArguments: (MutableList<out (TypeMirror..TypeMirror?)>..List<(TypeMirror..TypeMirror?)>?)[MyPropertyDescriptor]

'map' @ [86:64] ==> public inline fun <T, R> Iterable<(TypeMirror..TypeMirror?)>.map(transform: ((TypeMirror..TypeMirror?)) -> SymbolBasedType<TypeMirror>): List<SymbolBasedType<TypeMirror>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)
    <R> -> SymbolBasedType<TypeMirror>

'create' @ [86:70] ==> public final fun <T : TypeMirror> create(t: (TypeMirror..TypeMirror?), javac: JavacWrapper): SymbolBasedType<TypeMirror> defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : TypeMirror> -> (javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)

'it' @ [86:77] ==> value-parameter it: (TypeMirror..TypeMirror?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType.<get-typeArguments>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [86:81] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[PropertyDescriptorImpl]

'emptyList' @ [89:21] ==> public fun <T> emptyList(): List<JavaType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaType

'when {
            typeMirror !is DeclaredType -> false
            (typeMirror.asElement() as TypeElement).typeParameters.isEmpty() -> false
            else -> typeMirror.typeArguments.isEmpty()
        }' @ [93:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'typeMirror' @ [94:13] ==> public final val typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[PropertyDescriptorImpl]

'typeMirror' @ [95:14] ==> public final val typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[PropertyDescriptorImpl]

'asElement' @ [95:25] ==> public abstract fun asElement(): (Element..Element?) defined in javax.lang.model.type.DeclaredType[JavaMethodDescriptor]

'typeParameters' @ [95:53] ==> public final val TypeElement.typeParameters: (MutableList<out (TypeParameterElement..TypeParameterElement?)>..List<(TypeParameterElement..TypeParameterElement?)>?)[MyPropertyDescriptor]

'isEmpty' @ [95:68] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'typeMirror' @ [96:21] ==> public final val typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[PropertyDescriptorImpl]

'typeArguments' @ [96:32] ==> public final val DeclaredType.typeArguments: (MutableList<out (TypeMirror..TypeMirror?)>..List<(TypeMirror..TypeMirror?)>?)[MyPropertyDescriptor]

'isEmpty' @ [96:46] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'typeMirror' @ [100:17] ==> public final val typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[PropertyDescriptorImpl]

'toString' @ [100:28] ==> public open fun toString(): String defined in javax.lang.model.type.TypeMirror[DeserializedSimpleFunctionDescriptor]

'typeMirror' @ [103:17] ==> public final val typeMirror: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[PropertyDescriptorImpl]

'toString' @ [103:28] ==> public open fun toString(): String defined in javax.lang.model.type.TypeMirror[DeserializedSimpleFunctionDescriptor]

'SymbolBasedType<WildcardType>' @ [110:5] ==> private constructor SymbolBasedType<out T : TypeMirror>(typeMirror: WildcardType, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : TypeMirror> -> WildcardType

'typeMirror' @ [110:35] ==> value-parameter typeMirror: WildcardType defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedWildcardType.<init>[ValueParameterDescriptorImpl]

'javac' @ [110:47] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedWildcardType.<init>[ValueParameterDescriptorImpl]

'typeMirror' @ [114:31] ==> public final val typeMirror: WildcardType defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedWildcardType[PropertyDescriptorImpl]

'extendsBound' @ [114:42] ==> public final val WildcardType.extendsBound: (TypeMirror..TypeMirror?)[MyPropertyDescriptor]

'typeMirror' @ [114:58] ==> public final val typeMirror: WildcardType defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedWildcardType[PropertyDescriptorImpl]

'superBound' @ [114:69] ==> public final val WildcardType.superBound: (TypeMirror..TypeMirror?)[MyPropertyDescriptor]

'boundMirror' @ [115:20] ==> val boundMirror: (TypeMirror..TypeMirror?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedWildcardType.<get-bound>[LocalVariableDescriptor]

'let' @ [115:33] ==> @InlineOnly public inline fun <T, R> TypeMirror.let(block: (TypeMirror) -> SymbolBasedType<TypeMirror>): SymbolBasedType<TypeMirror> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeMirror
    <R> -> SymbolBasedType<TypeMirror>

'create' @ [115:39] ==> public final fun <T : TypeMirror> create(t: TypeMirror, javac: JavacWrapper): SymbolBasedType<TypeMirror> defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : TypeMirror> -> TypeMirror

'it' @ [115:46] ==> value-parameter it: TypeMirror defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedWildcardType.<get-bound>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [115:50] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedWildcardType[PropertyDescriptorImpl]

'typeMirror' @ [119:17] ==> public final val typeMirror: WildcardType defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedWildcardType[PropertyDescriptorImpl]

'extendsBound' @ [119:28] ==> public final val WildcardType.extendsBound: (TypeMirror..TypeMirror?)[MyPropertyDescriptor]

'SymbolBasedType<ArrayType>' @ [126:5] ==> private constructor SymbolBasedType<out T : TypeMirror>(typeMirror: ArrayType, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : TypeMirror> -> ArrayType

'typeMirror' @ [126:32] ==> value-parameter typeMirror: ArrayType defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedArrayType.<init>[ValueParameterDescriptorImpl]

'javac' @ [126:44] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedArrayType.<init>[ValueParameterDescriptorImpl]

'create' @ [129:17] ==> public final fun <T : TypeMirror> create(t: (TypeMirror..TypeMirror?), javac: JavacWrapper): SymbolBasedType<TypeMirror> defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : TypeMirror> -> (javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)

'typeMirror' @ [129:24] ==> public final val typeMirror: ArrayType defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedArrayType[PropertyDescriptorImpl]

'componentType' @ [129:35] ==> public final val ArrayType.componentType: (TypeMirror..TypeMirror?)[MyPropertyDescriptor]

'javac' @ [129:50] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedArrayType[PropertyDescriptorImpl]

