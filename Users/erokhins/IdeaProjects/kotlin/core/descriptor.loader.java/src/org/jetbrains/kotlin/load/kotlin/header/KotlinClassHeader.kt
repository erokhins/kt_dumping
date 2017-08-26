'' @ [37:16] ==> private constructor Kind(id: Int) defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[ClassConstructorDescriptorImpl]

'' @ [38:14] ==> private constructor Kind(id: Int) defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[ClassConstructorDescriptorImpl]

'' @ [39:20] ==> private constructor Kind(id: Int) defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[ClassConstructorDescriptorImpl]

'' @ [40:24] ==> private constructor Kind(id: Int) defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[ClassConstructorDescriptorImpl]

'' @ [41:24] ==> private constructor Kind(id: Int) defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[ClassConstructorDescriptorImpl]

'' @ [42:29] ==> private constructor Kind(id: Int) defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[ClassConstructorDescriptorImpl]

'values' @ [45:37] ==> public final fun values(): Array<KotlinClassHeader.Kind> defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[SimpleFunctionDescriptorImpl]

'associateBy' @ [45:46] ==> public inline fun <T, K> Array<out KotlinClassHeader.Kind>.associateBy(keySelector: (KotlinClassHeader.Kind) -> Int): Map<Int, KotlinClassHeader.Kind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Kind
    <K> -> Int

'Kind' @ [45:58] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'id' @ [45:64] ==> public final val id: Int defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[PropertyDescriptorImpl]

'JvmStatic' @ [47:13] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'entryById' @ [48:36] ==> private final val entryById: Map<Int, KotlinClassHeader.Kind> defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind.Companion[PropertyDescriptorImpl]

'id' @ [48:46] ==> value-parameter id: Int defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind.Companion.getById[ValueParameterDescriptorImpl]

'UNKNOWN' @ [48:53] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'extraString' @ [58:17] ==> public final val extraString: String? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'takeIf' @ [58:29] ==> @InlineOnly @SinceKotlin public inline fun <T> String?.takeIf(predicate: (String?) -> Boolean): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'kind' @ [58:38] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'MULTIFILE_CLASS_PART' @ [58:51] ==> enum entry MULTIFILE_CLASS_PART defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'data' @ [61:17] ==> public final val data: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'takeIf' @ [61:22] ==> @InlineOnly @SinceKotlin public inline fun <T> Array<String>?.takeIf(predicate: (Array<String>?) -> Boolean): Array<String>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Array<String>?

'kind' @ [61:31] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'MULTIFILE_CLASS' @ [61:44] ==> enum entry MULTIFILE_CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'asList' @ [61:63] ==> public fun <T> Array<out String>.asList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'orEmpty' @ [61:72] ==> @InlineOnly public inline fun <T> List<String>?.orEmpty(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'if (kind == Kind.MULTIFILE_CLASS || kind == Kind.MULTIFILE_CLASS_PART) {
            if ((extraInt and JvmAnnotationNames.METADATA_MULTIFILE_PARTS_INHERIT_FLAG) != 0)
                INHERITING
            else
                DELEGATING
        }
        else
            null' @ [65:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinClassHeader.MultifileClassKind?, elseBranch: KotlinClassHeader.MultifileClassKind?): KotlinClassHeader.MultifileClassKind?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MultifileClassKind?

'kind' @ [65:21] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'MULTIFILE_CLASS' @ [65:34] ==> enum entry MULTIFILE_CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'kind' @ [65:53] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'MULTIFILE_CLASS_PART' @ [65:66] ==> enum entry MULTIFILE_CLASS_PART defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'if ((extraInt and JvmAnnotationNames.METADATA_MULTIFILE_PARTS_INHERIT_FLAG) != 0)
                INHERITING
            else
                DELEGATING' @ [66:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinClassHeader.MultifileClassKind, elseBranch: KotlinClassHeader.MultifileClassKind): KotlinClassHeader.MultifileClassKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MultifileClassKind

'!=' @ [66:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'extraInt' @ [66:18] ==> public final val extraInt: Int defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'METADATA_MULTIFILE_PARTS_INHERIT_FLAG' @ [66:50] ==> public const final val METADATA_MULTIFILE_PARTS_INHERIT_FLAG: Int defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'INHERITING' @ [67:17] ==> enum entry INHERITING defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.MultifileClassKind[FakeCallableDescriptorForObject]

'DELEGATING' @ [69:17] ==> enum entry DELEGATING defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.MultifileClassKind[FakeCallableDescriptorForObject]

'!=' @ [75:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'extraInt' @ [75:18] ==> public final val extraInt: Int defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'METADATA_PRE_RELEASE_FLAG' @ [75:50] ==> public const final val METADATA_PRE_RELEASE_FLAG: Int defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'!=' @ [78:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'extraInt' @ [78:18] ==> public final val extraInt: Int defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'METADATA_SCRIPT_FLAG' @ [78:50] ==> public const final val METADATA_SCRIPT_FLAG: Int defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'kind' @ [80:33] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'metadataVersion' @ [80:47] ==> public final val metadataVersion: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

