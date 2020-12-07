/*
 * Copyright (C) 2017 The LineageOS Project
 * Copyright (C) 2019 The PixelExperience Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pixeldust.ota.misc;

public final class Constants {
    public static final String AB_PAYLOAD_BIN_PATH = "payload.bin";
    public static final String AB_PAYLOAD_PROPERTIES_PATH = "payload_properties.txt";
    public static final String PREF_MOBILE_DATA_WARNING = "pref_mobile_data_warning";
    public static final String UNCRYPT_FILE_EXT = ".uncrypt";
    public static final String PROP_BUILD_DATE = "ro.pixeldust.ota.timestamp";
    public static final String PROP_RECOVERY_UPDATE = "persist.sys.recovery_update";
    public static final String PREF_USE_INCREMENTAL = "use_incremental";
    public static final String PREF_CURRENT_UPDATE_HAS_INCREMENTAL = "current_update_has_incremental";
    public static final String PREF_CURRENT_UPDATE_IS_INCREMENTAL = "current_update_is_incremental";
    public static final String PREF_CURRENT_PERSISTENT_STATUS = "current_persistent_status";
    public static final String PREF_INSTALLING_AB_ID = "installing_ab_id";
    public static final String DOWNLOAD_PATH = "/data/system_updates/";
    static final String PROP_AB_DEVICE = "ro.build.ab_update";
    static final String PROP_DEVICE = "ro.pixeldust.device";
    static final String PROP_AND_VERSION = "ro.pixeldust.ota.version";
    static final String PROP_VERSION_CODE = "ro.pixeldust.ota.version_code";
    static final String OTA_URL = "https://raw.githubusercontent.com/PixelDust-Devices/device_ota/%s/%s_11.json";
    static final String DOWNLOAD_WEBPAGE_URL = "https://sourceforge.net/projects/pixeldustproject/files/changelogs/%s/%s";
    static final String EXPORT_PATH = "PixelDust-Updates/";
}
