'MultiTargetPlatform' @ [24:21] ==> private constructor MultiTargetPlatform() defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[ClassConstructorDescriptorImpl]

'if (other is Common) 0 else -1' @ [26:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'other' @ [26:21] ==> value-parameter other: MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Common.compareTo[ValueParameterDescriptorImpl]

'-' @ [26:45] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'MultiTargetPlatform' @ [29:49] ==> private constructor MultiTargetPlatform() defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[ClassConstructorDescriptorImpl]

'when (other) {
                    is Common -> 1
                    is Specific -> platform.compareTo(other.platform)
                }' @ [31:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'other' @ [31:23] ==> value-parameter other: MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Specific.compareTo[ValueParameterDescriptorImpl]

'platform' @ [33:36] ==> public final val platform: String defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Specific[PropertyDescriptorImpl]

'compareTo' @ [33:45] ==> public open fun compareTo(other: String): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'other' @ [33:55] ==> value-parameter other: MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Specific.compareTo[ValueParameterDescriptorImpl]

'platform' @ [33:61] ==> public final val platform: String defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Specific[PropertyDescriptorImpl]

'JvmField' @ [38:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Capability' @ [39:43] ==> public constructor Capability<T>(name: String) defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor.Capability[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> MultiTargetPlatform

'module' @ [44:9] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'getCapability' @ [44:16] ==> public abstract fun <T> getCapability(capability: ModuleDescriptor.Capability<MultiTargetPlatform>): MultiTargetPlatform? defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> MultiTargetPlatform

'MultiTargetPlatform' @ [44:30] ==> public companion object defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'CAPABILITY' @ [44:50] ==> @JvmField public final val CAPABILITY: ModuleDescriptor.Capability<MultiTargetPlatform> defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Companion[PropertyDescriptorImpl]

'module' @ [47:10] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'getMultiTargetPlatform' @ [47:17] ==> public fun ModuleDescriptor.getMultiTargetPlatform(): MultiTargetPlatform? defined in org.jetbrains.kotlin.resolve in file MultiTargetPlatform.kt[SimpleFunctionDescriptorImpl]

'platform' @ [47:77] ==> public final val platform: String defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Specific[PropertyDescriptorImpl]

