package com.willowtreeapps.permissionrequester

import android.Manifest
import android.app.Application
import androidx.test.runner.AndroidJUnitRunner
import androidx.test.runner.permission.PermissionRequester

class TestRunner : AndroidJUnitRunner() {

    override fun callApplicationOnCreate(app: Application?) {
        super.callApplicationOnCreate(app)
        val permissionRequester = PermissionRequester()
        permissionRequester.addPermissions(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        permissionRequester.requestPermissions()
    }

}