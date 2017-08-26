'this' @ [25:42] ==> public constructor KotlinAnnotationProvider(annotationsReader: Reader) defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[ClassConstructorDescriptorImpl]

'annotationsFile' @ [25:47] ==> value-parameter annotationsFile: File defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.<init>[ValueParameterDescriptorImpl]

'reader' @ [25:63] ==> @InlineOnly public inline fun File.reader(charset: Charset = ...): InputStreamReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'buffered' @ [25:72] ==> @InlineOnly public inline fun Reader.buffered(bufferSize: Int = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'this' @ [26:21] ==> public constructor KotlinAnnotationProvider(annotationsReader: Reader) defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[ClassConstructorDescriptorImpl]

'StringReader' @ [26:26] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'linkedSetOf' @ [28:43] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'linkedMapOf' @ [29:53] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<String, MutableSet<AnnotatedElement>> /* = LinkedHashMap<String, MutableSet<AnnotatedElement>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> MutableSet<AnnotatedElement>

'readAnnotations' @ [32:9] ==> protected final fun readAnnotations(annotationsReader: Reader): Unit defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[SimpleFunctionDescriptorImpl]

'annotationsReader' @ [32:25] ==> value-parameter annotationsReader: Reader defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.<init>[ValueParameterDescriptorImpl]

'annotatedKotlinElementsInternal' @ [36:17] ==> protected final val annotatedKotlinElementsInternal: LinkedHashMap<String, MutableSet<AnnotatedElement>> /* = LinkedHashMap<String, MutableSet<AnnotatedElement>> */ defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[PropertyDescriptorImpl]

'kotlinClassesInternal' @ [39:17] ==> protected final val kotlinClassesInternal: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[PropertyDescriptorImpl]

'kotlinClassesInternal' @ [42:17] ==> protected final val kotlinClassesInternal: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[PropertyDescriptorImpl]

'isNotEmpty' @ [42:39] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'lineParts' @ [46:24] ==> value-parameter lineParts: List<String> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.handleShortenedName[ValueParameterDescriptorImpl]

'lineParts' @ [47:22] ==> value-parameter lineParts: List<String> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.handleShortenedName[ValueParameterDescriptorImpl]

'cache' @ [48:13] ==> value-parameter cache: MutableMap<String, String> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.handleShortenedName[ValueParameterDescriptorImpl]

'put' @ [48:19] ==> public abstract fun put(key: String, value: String): String? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'id' @ [48:23] ==> val id: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.handleShortenedName[LocalVariableDescriptor]

'name' @ [48:27] ==> val name: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.handleShortenedName[LocalVariableDescriptor]

'linkedMapOf' @ [51:40] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<String, String> /* = LinkedHashMap<String, String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'linkedMapOf' @ [52:41] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<String, String> /* = LinkedHashMap<String, String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'shortenedAnnotationCache' @ [54:43] ==> val shortenedAnnotationCache: LinkedHashMap<String, String> /* = LinkedHashMap<String, String> */ defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations[LocalVariableDescriptor]

'getOrElse' @ [54:68] ==> @InlineOnly public inline fun <K, V> Map<String, String>.getOrElse(key: String, defaultValue: () -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

's' @ [54:78] ==> value-parameter s: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.expandAnnotation[ValueParameterDescriptorImpl]

's' @ [54:83] ==> value-parameter s: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.expandAnnotation[ValueParameterDescriptorImpl]

's' @ [57:22] ==> value-parameter s: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.expandClassName[ValueParameterDescriptorImpl]

'substringBefore' @ [57:24] ==> public fun String.substringBefore(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'id' @ [58:17] ==> val id: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.expandClassName[LocalVariableDescriptor]

'isEmpty' @ [58:20] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

's' @ [58:38] ==> value-parameter s: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.expandClassName[ValueParameterDescriptorImpl]

'shortenedPackageNameCache' @ [59:34] ==> val shortenedPackageNameCache: LinkedHashMap<String, String> /* = LinkedHashMap<String, String> */ defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations[LocalVariableDescriptor]

'get' @ [59:60] ==> public open fun get(key: String): String? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'id' @ [59:64] ==> val id: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.expandClassName[LocalVariableDescriptor]

'RuntimeException' @ [60:27] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'id' @ [60:56] ==> val id: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.expandClassName[LocalVariableDescriptor]

'shortenedValue' @ [62:20] ==> val shortenedValue: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.expandClassName[LocalVariableDescriptor]

's' @ [62:43] ==> value-parameter s: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.expandClassName[ValueParameterDescriptorImpl]

'substring' @ [62:45] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'id' @ [62:55] ==> val id: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.expandClassName[LocalVariableDescriptor]

'length' @ [62:58] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'annotationsReader' @ [65:9] ==> value-parameter annotationsReader: Reader defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations[ValueParameterDescriptorImpl]

'useLines' @ [65:27] ==> public inline fun <T> Reader.useLines(block: (Sequence<String>) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'lines' @ [66:26] ==> value-parameter lines: Sequence<String> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'line' @ [67:21] ==> val line: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [67:26] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'line' @ [68:33] ==> val line: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'split' @ [68:38] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'lineParts' @ [70:28] ==> val lineParts: List<String> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'when (type) {
                    Notation.SHORTENED_ANNOTATION -> handleShortenedName(shortenedAnnotationCache, lineParts)
                    Notation.SHORTENED_PACKAGE_NAME -> handleShortenedName(shortenedPackageNameCache, lineParts)
                    Notation.CLASS_DECLARATION -> {
                        val classFqName = expandClassName(lineParts[1]).replace('$', '.')
                        kotlinClassesInternal.add(classFqName)
                    }

                    Notation.ANNOTATED_CLASS, Notation.ANNOTATED_FIELD, Notation.ANNOTATED_METHOD -> {
                        val annotationName = expandAnnotation(lineParts[1])
                        val classFqName = expandClassName(lineParts[2]).replace('$', '.')
                        val elementName = if (lineParts.size == 4) lineParts[3] else null

                        val set = annotatedKotlinElementsInternal.getOrPut(annotationName) { linkedSetOf() }
                        set.add(when (type) {
                            Notation.ANNOTATED_CLASS -> AnnotatedElement.Class(classFqName)
                            Notation.ANNOTATED_FIELD -> {
                                val name = elementName ?: throw AssertionError("Name for field must be provided")
                                AnnotatedElement.Field(classFqName, name)
                            }
                            Notation.ANNOTATED_METHOD -> {
                                val name = elementName ?: throw AssertionError("Name for method must be provided")

                                if (AnnotatedElement.Constructor.METHOD_NAME == name)
                                    AnnotatedElement.Constructor(classFqName)
                                else
                                    AnnotatedElement.Method(classFqName, name)
                            }
                            else -> throw AssertionError("Unknown type: $type")
                        })

                    }
                    else -> throw AssertionError("Unknown type: $type")
                }' @ [71:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any, entry4: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'type' @ [71:23] ==> val type: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'Notation' @ [72:21] ==> public object CompactNotationType defined in org.jetbrains.kotlin.annotation in file CompactNotationType.kt[FakeCallableDescriptorForObject]

'SHORTENED_ANNOTATION' @ [72:30] ==> public const final val SHORTENED_ANNOTATION: String defined in org.jetbrains.kotlin.annotation.CompactNotationType[PropertyDescriptorImpl]

'handleShortenedName' @ [72:54] ==> local final fun handleShortenedName(cache: MutableMap<String, String>, lineParts: List<String>): Unit defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations[SimpleFunctionDescriptorImpl]

'shortenedAnnotationCache' @ [72:74] ==> val shortenedAnnotationCache: LinkedHashMap<String, String> /* = LinkedHashMap<String, String> */ defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations[LocalVariableDescriptor]

'lineParts' @ [72:100] ==> val lineParts: List<String> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'Notation' @ [73:21] ==> public object CompactNotationType defined in org.jetbrains.kotlin.annotation in file CompactNotationType.kt[FakeCallableDescriptorForObject]

'SHORTENED_PACKAGE_NAME' @ [73:30] ==> public const final val SHORTENED_PACKAGE_NAME: String defined in org.jetbrains.kotlin.annotation.CompactNotationType[PropertyDescriptorImpl]

'handleShortenedName' @ [73:56] ==> local final fun handleShortenedName(cache: MutableMap<String, String>, lineParts: List<String>): Unit defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations[SimpleFunctionDescriptorImpl]

'shortenedPackageNameCache' @ [73:76] ==> val shortenedPackageNameCache: LinkedHashMap<String, String> /* = LinkedHashMap<String, String> */ defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations[LocalVariableDescriptor]

'lineParts' @ [73:103] ==> val lineParts: List<String> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'Notation' @ [74:21] ==> public object CompactNotationType defined in org.jetbrains.kotlin.annotation in file CompactNotationType.kt[FakeCallableDescriptorForObject]

'CLASS_DECLARATION' @ [74:30] ==> public const final val CLASS_DECLARATION: String defined in org.jetbrains.kotlin.annotation.CompactNotationType[PropertyDescriptorImpl]

'expandClassName' @ [75:43] ==> local final fun expandClassName(s: String): String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations[SimpleFunctionDescriptorImpl]

'lineParts' @ [75:59] ==> val lineParts: List<String> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'replace' @ [75:73] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'kotlinClassesInternal' @ [76:25] ==> protected final val kotlinClassesInternal: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[PropertyDescriptorImpl]

'add' @ [76:47] ==> public open fun add(element: String): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'classFqName' @ [76:51] ==> val classFqName: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'Notation' @ [79:21] ==> public object CompactNotationType defined in org.jetbrains.kotlin.annotation in file CompactNotationType.kt[FakeCallableDescriptorForObject]

'ANNOTATED_CLASS' @ [79:30] ==> public const final val ANNOTATED_CLASS: String defined in org.jetbrains.kotlin.annotation.CompactNotationType[PropertyDescriptorImpl]

'Notation' @ [79:47] ==> public object CompactNotationType defined in org.jetbrains.kotlin.annotation in file CompactNotationType.kt[FakeCallableDescriptorForObject]

'ANNOTATED_FIELD' @ [79:56] ==> public const final val ANNOTATED_FIELD: String defined in org.jetbrains.kotlin.annotation.CompactNotationType[PropertyDescriptorImpl]

'Notation' @ [79:73] ==> public object CompactNotationType defined in org.jetbrains.kotlin.annotation in file CompactNotationType.kt[FakeCallableDescriptorForObject]

'ANNOTATED_METHOD' @ [79:82] ==> public const final val ANNOTATED_METHOD: String defined in org.jetbrains.kotlin.annotation.CompactNotationType[PropertyDescriptorImpl]

'expandAnnotation' @ [80:46] ==> local final fun expandAnnotation(s: String): String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations[SimpleFunctionDescriptorImpl]

'lineParts' @ [80:63] ==> val lineParts: List<String> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'expandClassName' @ [81:43] ==> local final fun expandClassName(s: String): String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations[SimpleFunctionDescriptorImpl]

'lineParts' @ [81:59] ==> val lineParts: List<String> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'replace' @ [81:73] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (lineParts.size == 4) lineParts[3] else null' @ [82:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'lineParts' @ [82:47] ==> val lineParts: List<String> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'size' @ [82:57] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'lineParts' @ [82:68] ==> val lineParts: List<String> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'annotatedKotlinElementsInternal' @ [84:35] ==> protected final val annotatedKotlinElementsInternal: LinkedHashMap<String, MutableSet<AnnotatedElement>> /* = LinkedHashMap<String, MutableSet<AnnotatedElement>> */ defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[PropertyDescriptorImpl]

'getOrPut' @ [84:67] ==> public inline fun <K, V> MutableMap<String, MutableSet<AnnotatedElement>>.getOrPut(key: String, defaultValue: () -> MutableSet<AnnotatedElement>): MutableSet<AnnotatedElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> MutableSet<AnnotatedElement>

'annotationName' @ [84:76] ==> val annotationName: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'linkedSetOf' @ [84:94] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<AnnotatedElement> /* = LinkedHashSet<AnnotatedElement> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotatedElement

'set' @ [85:25] ==> val set: MutableSet<AnnotatedElement> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'add' @ [85:29] ==> public abstract fun add(element: AnnotatedElement): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'when (type) {
                            Notation.ANNOTATED_CLASS -> AnnotatedElement.Class(classFqName)
                            Notation.ANNOTATED_FIELD -> {
                                val name = elementName ?: throw AssertionError("Name for field must be provided")
                                AnnotatedElement.Field(classFqName, name)
                            }
                            Notation.ANNOTATED_METHOD -> {
                                val name = elementName ?: throw AssertionError("Name for method must be provided")

                                if (AnnotatedElement.Constructor.METHOD_NAME == name)
                                    AnnotatedElement.Constructor(classFqName)
                                else
                                    AnnotatedElement.Method(classFqName, name)
                            }
                            else -> throw AssertionError("Unknown type: $type")
                        }' @ [85:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: AnnotatedElement, entry1: AnnotatedElement, entry2: AnnotatedElement, entry3: AnnotatedElement): AnnotatedElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> AnnotatedElement

'type' @ [85:39] ==> val type: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'Notation' @ [86:29] ==> public object CompactNotationType defined in org.jetbrains.kotlin.annotation in file CompactNotationType.kt[FakeCallableDescriptorForObject]

'ANNOTATED_CLASS' @ [86:38] ==> public const final val ANNOTATED_CLASS: String defined in org.jetbrains.kotlin.annotation.CompactNotationType[PropertyDescriptorImpl]

'Class' @ [86:74] ==> public constructor Class(classFqName: String) defined in org.jetbrains.kotlin.annotation.AnnotatedElement.Class[ClassConstructorDescriptorImpl]

'classFqName' @ [86:80] ==> val classFqName: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'Notation' @ [87:29] ==> public object CompactNotationType defined in org.jetbrains.kotlin.annotation in file CompactNotationType.kt[FakeCallableDescriptorForObject]

'ANNOTATED_FIELD' @ [87:38] ==> public const final val ANNOTATED_FIELD: String defined in org.jetbrains.kotlin.annotation.CompactNotationType[PropertyDescriptorImpl]

'elementName' @ [88:44] ==> val elementName: String? defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'AssertionError' @ [88:65] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'Field' @ [89:50] ==> public constructor Field(classFqName: String, fieldName: String) defined in org.jetbrains.kotlin.annotation.AnnotatedElement.Field[ClassConstructorDescriptorImpl]

'classFqName' @ [89:56] ==> val classFqName: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'name' @ [89:69] ==> val name: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'Notation' @ [91:29] ==> public object CompactNotationType defined in org.jetbrains.kotlin.annotation in file CompactNotationType.kt[FakeCallableDescriptorForObject]

'ANNOTATED_METHOD' @ [91:38] ==> public const final val ANNOTATED_METHOD: String defined in org.jetbrains.kotlin.annotation.CompactNotationType[PropertyDescriptorImpl]

'elementName' @ [92:44] ==> val elementName: String? defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'AssertionError' @ [92:65] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'if (AnnotatedElement.Constructor.METHOD_NAME == name)
                                    AnnotatedElement.Constructor(classFqName)
                                else
                                    AnnotatedElement.Method(classFqName, name)' @ [94:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AnnotatedElement, elseBranch: AnnotatedElement): AnnotatedElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AnnotatedElement

'==' @ [94:37] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'METHOD_NAME' @ [94:66] ==> public const final val METHOD_NAME: String defined in org.jetbrains.kotlin.annotation.AnnotatedElement.Constructor.Companion[PropertyDescriptorImpl]

'name' @ [94:81] ==> val name: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'Constructor' @ [95:54] ==> public constructor Constructor(classFqName: String) defined in org.jetbrains.kotlin.annotation.AnnotatedElement.Constructor[ClassConstructorDescriptorImpl]

'classFqName' @ [95:66] ==> val classFqName: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'Method' @ [97:54] ==> public constructor Method(classFqName: String, methodName: String) defined in org.jetbrains.kotlin.annotation.AnnotatedElement.Method[ClassConstructorDescriptorImpl]

'classFqName' @ [97:61] ==> val classFqName: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'name' @ [97:74] ==> val name: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'AssertionError' @ [99:43] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'type' @ [99:74] ==> val type: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'AssertionError' @ [103:35] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'type' @ [103:66] ==> val type: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.readAnnotations.<anonymous>[LocalVariableDescriptor]

'component1' @ [110:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, Set<AnnotatedElement>>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Set<AnnotatedElement>

'component2' @ [110:27] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, Set<AnnotatedElement>>.component2(): Set<AnnotatedElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Set<AnnotatedElement>

'annotatedKotlinElements' @ [110:40] ==> public final val annotatedKotlinElements: Map<String, Set<AnnotatedElement>> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[PropertyDescriptorImpl]

'elements' @ [111:29] ==> val elements: Set<AnnotatedElement> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.writeAnnotations[LocalVariableDescriptor]

'writer' @ [112:17] ==> value-parameter writer: AnnotationWriter defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.writeAnnotations[ValueParameterDescriptorImpl]

'writeAnnotatedElement' @ [112:24] ==> public fun AnnotationWriter.writeAnnotatedElement(annotation: String, element: AnnotatedElement): Unit defined in org.jetbrains.kotlin.annotation in file AnnotatedElement.kt[SimpleFunctionDescriptorImpl]

'annotation' @ [112:46] ==> val annotation: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.writeAnnotations[LocalVariableDescriptor]

'element' @ [112:58] ==> val element: AnnotatedElement defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.writeAnnotations[LocalVariableDescriptor]

'kotlinClasses' @ [116:27] ==> public final val kotlinClasses: Set<String> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[PropertyDescriptorImpl]

'writer' @ [117:13] ==> value-parameter writer: AnnotationWriter defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.writeAnnotations[ValueParameterDescriptorImpl]

'writeClassDeclaration' @ [117:20] ==> public abstract fun writeClassDeclaration(classFqName: String): Unit defined in org.jetbrains.kotlin.annotation.AnnotationWriter[SimpleFunctionDescriptorImpl]

'className' @ [117:42] ==> val className: String defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider.writeAnnotations[LocalVariableDescriptor]

