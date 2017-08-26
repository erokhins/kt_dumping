'!' @ [23:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'thisRef' @ [23:14] ==> value-parameter thisRef: T defined in org.jetbrains.kotlin.js.backend.ast.metadata.MetadataProperty.getValue[ValueParameterDescriptorImpl]

'hasData' @ [23:22] ==> public final fun hasData(key: String): Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata.HasMetadata[SimpleFunctionDescriptorImpl]

'desc' @ [23:30] ==> value-parameter desc: KProperty<*> defined in org.jetbrains.kotlin.js.backend.ast.metadata.MetadataProperty.getValue[ValueParameterDescriptorImpl]

'name' @ [23:35] ==> public abstract val name: String defined in kotlin.reflect.KProperty[DeserializedPropertyDescriptor]

'default' @ [23:49] ==> public final val default: R defined in org.jetbrains.kotlin.js.backend.ast.metadata.MetadataProperty[PropertyDescriptorImpl]

'thisRef' @ [24:16] ==> value-parameter thisRef: T defined in org.jetbrains.kotlin.js.backend.ast.metadata.MetadataProperty.getValue[ValueParameterDescriptorImpl]

'getData' @ [24:24] ==> public final fun <T> getData(key: String): R defined in org.jetbrains.kotlin.js.backend.ast.metadata.HasMetadata[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> R

'desc' @ [24:35] ==> value-parameter desc: KProperty<*> defined in org.jetbrains.kotlin.js.backend.ast.metadata.MetadataProperty.getValue[ValueParameterDescriptorImpl]

'name' @ [24:40] ==> public abstract val name: String defined in kotlin.reflect.KProperty[DeserializedPropertyDescriptor]

'if (value == default) {
            thisRef.removeData(desc.name)
        }
        else {
            thisRef.setData(desc.name, value)
        }' @ [28:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'value' @ [28:13] ==> value-parameter value: R defined in org.jetbrains.kotlin.js.backend.ast.metadata.MetadataProperty.setValue[ValueParameterDescriptorImpl]

'default' @ [28:22] ==> public final val default: R defined in org.jetbrains.kotlin.js.backend.ast.metadata.MetadataProperty[PropertyDescriptorImpl]

'thisRef' @ [29:13] ==> value-parameter thisRef: T defined in org.jetbrains.kotlin.js.backend.ast.metadata.MetadataProperty.setValue[ValueParameterDescriptorImpl]

'removeData' @ [29:21] ==> public final fun removeData(key: String): Unit defined in org.jetbrains.kotlin.js.backend.ast.metadata.HasMetadata[SimpleFunctionDescriptorImpl]

'desc' @ [29:32] ==> value-parameter desc: KProperty<*> defined in org.jetbrains.kotlin.js.backend.ast.metadata.MetadataProperty.setValue[ValueParameterDescriptorImpl]

'name' @ [29:37] ==> public abstract val name: String defined in kotlin.reflect.KProperty[DeserializedPropertyDescriptor]

'thisRef' @ [32:13] ==> value-parameter thisRef: T defined in org.jetbrains.kotlin.js.backend.ast.metadata.MetadataProperty.setValue[ValueParameterDescriptorImpl]

'setData' @ [32:21] ==> public final fun <T> setData(key: String, value: R): Unit defined in org.jetbrains.kotlin.js.backend.ast.metadata.HasMetadata[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> R

'desc' @ [32:29] ==> value-parameter desc: KProperty<*> defined in org.jetbrains.kotlin.js.backend.ast.metadata.MetadataProperty.setValue[ValueParameterDescriptorImpl]

'name' @ [32:34] ==> public abstract val name: String defined in kotlin.reflect.KProperty[DeserializedPropertyDescriptor]

'value' @ [32:40] ==> value-parameter value: R defined in org.jetbrains.kotlin.js.backend.ast.metadata.MetadataProperty.setValue[ValueParameterDescriptorImpl]

